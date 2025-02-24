package OOPSConcepts.Interface;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("bhow bhow...");
    }
}

class Cow implements Animal{
    public void makeSound(){
        System.out.println("hammmmmmmmm...");
    }
}

public class Interface2 {
    public static void main(String args[]){
        Dog g = new Dog();
        Cow c = new Cow();

        g.makeSound();
        c.makeSound();
    }
}
