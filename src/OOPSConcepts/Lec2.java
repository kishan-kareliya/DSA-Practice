package OOPSConcepts;

public class Lec2 {
    public static void main(String[] args) {
        Outer o = new Outer(); // so in order to create a object of inner class
        // then it is mandatory to define outer class object first
        // ans based on outer class object inner class object is define
        // "RULES: IF IT IS NON STATIC CLASS"

        Outer.Inner i1 = o.new Inner("kishan");
        Outer.Inner i2 = o.new Inner("kajal");

        i1.display();
        i2.display();
    }
}

class Outer{
    class Inner{
        String name;
        Inner(String name){
            this.name = name;
        }
        void display(){
            System.out.println("Hello "+name);
        }
    }
}
