package OOPSConcepts.FoodDeliverySystem;
import java.util.*;

class FoodOrderException extends Exception{
    FoodOrderException(String message){
        super(message);
    }
}

class Customer{
    private String customerId;
    private String name;
    private String phoneNumber;
    private String address;

    public Customer(String customerId,String name,String phoneNumber,String address){
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Order placeOrder(String orderId,Restaurant restaurant,ArrayList<String> foodItems,OrderManager orderManager) throws FoodOrderException {
        Order order = new Order(orderId,this,restaurant,foodItems);
        if(restaurant.acceptOrder(order)){
            if(orderManager.addOrder(order))
                System.out.println("Order Placed Successfully!");
        }
        return order;
    }

    public boolean cancelOrder(Order order){
        if(order.getStatus().equals("Placed") || order.getStatus().equals("Preparing")){
            order.updateStatus("Cancelled");
            return true;
        }
        System.out.println("Order Can't Be Cancelled");
        return false;
    }
}

class Restaurant{
    private String restaurantId;
    private String name;
    private String location;
    private ArrayList<String> menu;

    public Restaurant(String restaurantId,String name,String location,ArrayList<String> menu){
        this.restaurantId = restaurantId;
        this.name = name;
        this.location = location;
        this.menu = menu;
    }

    public boolean acceptOrder(Order order) throws FoodOrderException{
        if(menu.containsAll(order.getFoodItems())){
            if(!order.getStatus().equals("Cancelled")) {
                System.out.println(this.name + " accepted this order id:  " + order.getOrderId());
                return true;
            }
            throw new FoodOrderException("order is not accept because it is already cancelled");
        }
        return false;
    }

    public void prepareOrder(Order order) throws FoodOrderException{
        if(order.getStatus().equals("Placed")) {
            order.updateStatus("Preparing");
            System.out.println(order.getOrderId() + " is preparing right now...");
            return;
        }
        throw new FoodOrderException("Order Doesn't Placed Yet");
    }

    public void dispatchOrder(Order order){
        if(order.getStatus().equals("Preparing")){
            System.out.println(order.getOrderId() + " is prepared and out for delivery");
            order.updateStatus("On the Way");
        }
    }
}

class Order{
    private String orderId;
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<String> foodItems;
    private String status;
    private DeliveryPerson deliveryPerson;

    public Order(String orderId,Customer customer,Restaurant restaurant,ArrayList<String> foodItems){
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItems = foodItems;
        this.status = "Placed";
        this.deliveryPerson = null;
    }

    public String getOrderId(){
        return orderId;
    }

    public String getStatus(){
        return status;
    }

    public ArrayList<String> getFoodItems(){
        return foodItems;
    }

    public boolean assignDeliveryPerson(DeliveryPerson deliveryPerson){
       this.deliveryPerson = deliveryPerson;
       return true;
    }

    public void updateStatus(String newStatus){
        this.status = newStatus;
    }
}

class DeliveryPerson{
    private String deliveryPersonId;
    private String name;
    private String phoneNumber;
    private String currentLocation;
    private boolean availability;

    public DeliveryPerson(String deliveryPersonId,String name,String phoneNumber,String currentLocation,boolean availability){
        this.deliveryPersonId = deliveryPersonId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.currentLocation = currentLocation;
        this.availability = availability;
    }

    public void changeAvailability(boolean newAvailability){
        this.availability = newAvailability;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void showDetails(){
        System.out.println("Deliver PersonID: " + deliveryPersonId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public boolean acceptOrder(Order order){
        if(order.getStatus().equals("Placed")){
            System.out.println(this.name + " accept your order: " + order.getOrderId());
            return true;
        }
        return false;
    }

    public boolean deliverOrder(Order order){
        order.updateStatus("Delivered");
        System.out.println("your order " + order.getOrderId() + " is delivered successfully by delivery person " + this.name);
        return true;
    }
}

class OrderManager{
    private ArrayList<Order> orders;
    private ArrayList<DeliveryPerson> deliveryPersons;

    public OrderManager(ArrayList<DeliveryPerson> deliveryPersons){
        this.orders = new ArrayList<>();
        this.deliveryPersons = deliveryPersons;
    }

    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public DeliveryPerson assignDeliveryPerson(Order order){

        int randomIndex = (int) (Math.random() * deliveryPersons.size());
        DeliveryPerson deliveryPerson = deliveryPersons.get(randomIndex);

        if(!deliveryPerson.getAvailability()){
            while(!deliveryPerson.getAvailability()){
                randomIndex = (int) (Math.random() * deliveryPersons.size());
                deliveryPerson = deliveryPersons.get(randomIndex);
            }
        }

        if(order.assignDeliveryPerson(deliveryPerson)){
            deliveryPerson.changeAvailability(false);
            System.out.println("-----Delivery Person Details-----");
            deliveryPerson.showDetails();
            return deliveryPerson;
        }
        order.updateStatus("Waiting");
        return null;
    }

    public String trackOrder(String orderId){
        for(Order order: orders){
            if(order.getOrderId().equals(orderId)){
                return order.getStatus();
            }
        }
        return "orderId doesn't found";
    }
}

public class FoodDeliverySystems {
    public static void main(String[] args){
        Customer kishan = new Customer("C101","kishan kareliya","8160273697","nikol ahmedabad");
        Customer ghanshyam = new Customer("C102","ghanshyam patel","8888888888","naroda ahmedabad");

        Restaurant megma = new Restaurant("R101","Megma Restaurant","nikol ahmedabad",new ArrayList<String>(Arrays.asList("Pizza","Burger","Pasta")));
        Restaurant ksCharcoal = new Restaurant("R102","K'S Charcoal","SBR Road ahmedabad",new ArrayList<String>(Arrays.asList("Pizza","Sandwich","Pasta")));

        DeliveryPerson rahul = new DeliveryPerson("D101","rahul","123456789","naroda ahmedabad",true);
        DeliveryPerson vraj = new DeliveryPerson("D102","vraj","987456123","nikol ahmedabad",true);
        DeliveryPerson urvish = new DeliveryPerson("D103","urvish","8978897889","sbr ahmedabad",true);

        ArrayList<DeliveryPerson> deliveryPersons = new ArrayList<>();
        deliveryPersons.add(rahul);
        deliveryPersons.add(vraj);
        deliveryPersons.add(urvish);

        OrderManager manager1 = new OrderManager(deliveryPersons);

        try{
            Order kishanOrder = kishan.placeOrder("O101",megma,new ArrayList<String>(Arrays.asList("Pizza","Burger","Pasta")),manager1);
            DeliveryPerson deliveryPerson = manager1.assignDeliveryPerson(kishanOrder);

            if(deliveryPerson != null){
                deliveryPerson.acceptOrder(kishanOrder);
                megma.acceptOrder(kishanOrder);
                megma.prepareOrder(kishanOrder);
                megma.dispatchOrder(kishanOrder);
                deliveryPerson.deliverOrder(kishanOrder);
            }
            else{
                System.out.println("Delivery Person not available please wait...");
            }
        }catch(FoodOrderException e){
            System.out.println(e.getMessage());
        }
    }
}
