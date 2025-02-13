package OOPSConcepts;

// Public class Lec1: The main class where execution begins.
public class Lec1 {

    // Static nested class Student: Represents a blueprint for student objects.
    static class Student {
        // Instance variables (data members): These variables store information for each student object.
        int rollNo;      // Stores student's roll number
        String name;     // Stores student's name
        float marks;     // Stores student's marks

        // Constructor: Initializes instance variables when an object of Student is created.
        Student(int rollNo, String name, float marks) {
            // 'this' keyword is used to refer to the current object's instance variables.
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        // Method to display student details.
        void display() {
            // Printing student details to the console.
            System.out.println("RollNo: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
        public String toString(){
            return "RollNo: "+rollNo+" ,Name: "+name+" ,Marks: "+marks;
        }
    }

    // Main method: The entry point of the program.
    public static void main(String[] args) {

        // Creating an object of Student class using the 'new' keyword.
        // This calls the constructor and initializes the object with given values.
        Student s1 = new Student(56, "Kishan Kareliya", 95.6f);
        Student s2 = new Student(57,"Rahul",97.8f);

        // Calling the 'display' method on 's1' object to print student details.
        s1.display();

        //whenever we want to print object directly
        //without calling display function
        //for debugging purpose then special
        //method toString is used
        System.out.println(s2);
    }
}
