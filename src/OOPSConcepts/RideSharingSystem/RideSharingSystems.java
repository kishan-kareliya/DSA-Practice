package OOPSConcepts.RideSharingSystem;
import java.util.ArrayList;

class User {
    private String userId;
    private String name;
    private String phoneNumber;

    User(String userId, String name, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getDetails() {
        return "UserID: " + userId + " | Name: " + name + " | Phone: " + phoneNumber;
    }
}

class Passenger extends User {
    private ArrayList<Double> currentLocation;

    Passenger(String userId, String name, String phoneNumber, ArrayList<Double> currentLocation) {
        super(userId, name, phoneNumber);
        this.currentLocation = currentLocation;
    }

    public Ride requestRide(String rideId, ArrayList<Double> destination, RideManager rideManager) {
        Driver nearestDriver = rideManager.findNearestDriver(currentLocation);
        if (nearestDriver == null) {
            System.out.println("No available drivers near your location.");
            return null;
        }
        Ride ride = new Ride(rideId, this, currentLocation, destination);
        ride.assignDriver(nearestDriver);
        rideManager.addRide(ride);
        System.out.println("Ride Requested Successfully. Assigned Driver: " + nearestDriver.getDetails());
        return ride;
    }

    public void cancelRide(Ride ride) {
        if (ride != null && ride.getStatus().equals("Requested")) {
            double penalty = ride.calculateFare() * 0.2;
            ride.setStatus("Cancelled");
            System.out.println("Ride Cancelled Successfully. Penalty: " + penalty);
        } else {
            System.out.println("Ride cancellation failed.");
        }
    }
}

class Driver extends User {
    private String carDetails;
    private ArrayList<Double> currentLocation;
    private float rating;

    Driver(String userId, String name, String phoneNumber, String carDetails, ArrayList<Double> currentLocation) {
        super(userId, name, phoneNumber);
        this.carDetails = carDetails;
        this.currentLocation = currentLocation;
        this.rating = 5;
    }

    public ArrayList<Double> getCurrentLocation() {
        return currentLocation;
    }

    public boolean acceptRide(Ride ride) {
        if (ride != null && ride.startRide()) {
            System.out.println("Ride Accepted Successfully.");
            return true;
        }
        return false;
    }

    public boolean completeRide(Ride ride) {
        if (ride != null && ride.endRide()) {
            System.out.println("Ride Completed Successfully.");
            return true;
        }
        return false;
    }

    public void updateLocation(ArrayList<Double> newLocation) {
        this.currentLocation = newLocation;
    }

    public void updateRating(float newRating) throws Exception {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = newRating;
        } else {
            throw new Exception("Error: Rating must be between 0 and 5");
        }
    }
}

class Ride {
    private String rideId;
    private Passenger passenger;
    private Driver driver;
    private ArrayList<Double> pickupLocation;
    private ArrayList<Double> destination;
    private String status;
    private final int PER_KILOMETER_CHARGES = 10;

    Ride(String rideId, Passenger passenger, ArrayList<Double> pickupLocation, ArrayList<Double> destination) {
        this.rideId = rideId;
        this.passenger = passenger;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.status = "Requested";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean assignDriver(Driver driver) {
        if (driver == null) return false;
        this.driver = driver;
        return true;
    }

    public boolean startRide() {
        if (this.status.equals("Requested")) {
            this.status = "Ongoing";
            return true;
        }
        return false;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(destination.get(0) - pickupLocation.get(0), 2)
                + Math.pow(destination.get(1) - pickupLocation.get(1), 2));
    }

    public double calculateFare() {
        return getDistance() * PER_KILOMETER_CHARGES;
    }

    public boolean endRide() {
        if (this.status.equals("Ongoing")) {
            this.status = "Completed";
            System.out.println("Total Fare: " + calculateFare());
            return true;
        }
        return false;
    }
}

class RideManager {
    private ArrayList<Driver> drivers;
    private ArrayList<Ride> rides;

    RideManager() {
        this.drivers = new ArrayList<>();
        this.rides = new ArrayList<>();
    }

    public Driver findNearestDriver(ArrayList<Double> passengerLocation) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            double distance = Math.sqrt(Math.pow(driver.getCurrentLocation().get(0) - passengerLocation.get(0), 2)
                    + Math.pow(driver.getCurrentLocation().get(1) - passengerLocation.get(1), 2));
            if (distance < minDistance) {
                minDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("New Driver Added Successfully: " + driver.getDetails());
    }

    public void addRide(Ride ride) {
        rides.add(ride);
        System.out.println("New Ride Added: " + ride.getStatus());
    }
}

public class RideSharingSystems {
    public static void main(String[] args) {
        RideManager rideManager = new RideManager();

        Driver driver1 = new Driver("D001", "Kishan", "9876543210", "Toyota Prius", new ArrayList<>(java.util.Arrays.asList(10.0, 20.0)));
        Driver driver2 = new Driver("D002", "Vraj", "9876543211", "Honda Civic", new ArrayList<>(java.util.Arrays.asList(12.0, 22.0)));
        rideManager.addDriver(driver1);
        rideManager.addDriver(driver2);

        Passenger passenger = new Passenger("P001", "Kajal", "1234567890", new ArrayList<>(java.util.Arrays.asList(11.0, 21.0)));

        Ride ride = passenger.requestRide("R001", new ArrayList<>(java.util.Arrays.asList(20.0, 30.0)), rideManager);
        if (ride == null) return;

        driver1.acceptRide(ride);

        driver1.completeRide(ride);
    }
}
