package OOPSConcepts.ProductReviewSystem;
import java.util.ArrayList;

class RatingOutOfBoundsException extends Exception {
    public RatingOutOfBoundsException(String message) {
        super(message);
    }
}

class Product {
    private String productId;
    private String productName;
    private double price;
    private ArrayList<Review> reviews;

    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
        System.out.println("Review added successfully!");
    }

    public void removeReview(Review review){
        if(reviews.contains(review)){
            reviews.remove(review);
            System.out.println("Review Deleted Successfully!");
        }
    }

    public float getAverageRating() {
        if (reviews.isEmpty()) return 0; // Prevent division by zero

        int totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        return (float) totalRating / reviews.size();
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId + " | Name: " + productName + " | Price: $" + price);
        displayReviews();
    }

    public void displayReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
            return;
        }
        System.out.println("Reviews for " + productName + ":");
        for (Review review : reviews) {
            System.out.println(review);
        }
    }
}

class User {
    private String userId;
    private String username;
    private String email;
    private ArrayList<Review> userReviews;

    User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.userReviews = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public void writeReview(Product product, int rating, String comment, String date) {
        try {
            Review review = new Review(this, product, rating, comment, date);
            userReviews.add(review);
            product.addReview(review);
        } catch (RatingOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void editReview(Review review, int newRating, String newComment) {
        if (userReviews.contains(review)) {
            review.editReview(newRating, newComment);
            System.out.println("Review updated successfully.");
        } else {
            System.out.println("Error: You can only edit your own reviews.");
        }
    }

    public void deleteReview(Review review) {
        if (userReviews.contains(review)) {
            userReviews.remove(review);
            review.getProduct().removeReview(review);
            System.out.println("Review deleted successfully.");
        } else {
            System.out.println("Error: You can only delete your own reviews.");
        }
    }
}

class Review {
    protected User user;
    protected Product product;
    protected int rating;
    protected String comment;
    protected String date;

    Review(User user, Product product, int rating, String comment, String date) throws RatingOutOfBoundsException {
        if (rating < 1 || rating > 5) {
            throw new RatingOutOfBoundsException("Rating must be between 1 and 5.");
        }
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public void editReview(int newRating, String newComment) {
        if (newRating < 1 || newRating > 5) {
            System.out.println("Error: Rating must be between 1 and 5.");
            return;
        }
        this.rating = newRating;
        this.comment = newComment;
        System.out.println("Review updated successfully.");
    }

    public int getRating() {
        return rating;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "User: " + user.getUsername() + " | Rating: " + rating + " | Comment: " + comment + " | Date: " + date;
    }
}

// Main Class
public class EcommerceProductReviewSystem {
    public static void main(String[] args) {
        User user1 = new User("U1", "kishan", "kishan@example.com");
        User user2 = new User("U2", "rahul", "rahul@example.com");

        Product product1 = new Product("P101", "Laptop", 19999.99);
        Product product2 = new Product("P102", "Smartphone", 15699.49);

        user1.writeReview(product1, 5, "Great laptop!", "2024-02-24");
        user2.writeReview(product1, 4, "Good performance!", "2024-02-25");
        user1.writeReview(product2, 3, "Decent phone, but overpriced.", "2024-02-26");

        product1.displayProductDetails();
        product2.displayReviews();
    }
}
