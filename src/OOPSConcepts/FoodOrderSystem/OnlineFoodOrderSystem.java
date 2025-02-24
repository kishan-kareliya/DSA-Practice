package OOPSConcepts.FoodOrderSystem;

import java.util.ArrayList;

class FoodItem{
    private String name;
    private double price;
    private String category;

    FoodItem(String name,double price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice(){
        return price;
    }

    public void getDetails(){
        System.out.println(name + " - " + category +" -  $" + price);
    }

}

class Order{
    private ArrayList<FoodItem> foodItems;

    Order(){
        foodItems = new ArrayList<>();
    }

    public void addItem(FoodItem item){
        foodItems.add(item);
    }
    public void removeItem(FoodItem item){
        if(foodItems.contains(item)){
            foodItems.remove(item);
        }
    }
    public void calculateTotal(){
        double total = 0;
        System.out.println("Order Details: ");
        for(FoodItem item: foodItems){
            item.getDetails();
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class User{
    private String name;
    private String address;
    private ArrayList<Order> orderHistory;

    User(String name,String address){
        this.name = name;
        this.address = address;
        orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order){
        orderHistory.add(order);
    }

    public void viewOrderHistory(){
        System.out.println(this.name + " orders: ");
        for(Order order: orderHistory){
            order.calculateTotal();
        }
    }
}

public class OnlineFoodOrderSystem {
    public static void main(String args[]){
        FoodItem burger = new FoodItem("Burger",5.99,"Fast Food");
        FoodItem coffee = new FoodItem("Coffee",2.49,"Beverage");

        Order order1 = new Order();
        order1.addItem(burger);
        order1.addItem(coffee);

        Order order2 = new Order();
        order2.addItem(coffee);

        User kishan = new User("kishan","ahmedabad");
        kishan.placeOrder(order1);
        kishan.viewOrderHistory();
        kishan.placeOrder(order2);
        kishan.viewOrderHistory();
    }
}
