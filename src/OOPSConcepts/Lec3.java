package OOPSConcepts;

//Inheritance
public class Lec3 {
    public static void main(String[] args) {
        Child1 aman = new Child1("brown","white",5.4f,65);
        System.out.println(aman);
    }
}
class Parent{
    String eyeColor,skinColor;
    Parent(String eyeColor,String skinColor){
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
    }
}
class Child1 extends Parent{
    float height, weight;
    Child1(String eyeColor,String skinColor,float height,float weight){
        super(eyeColor,skinColor);
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return "Eye Color: " + super.eyeColor + " Skin Color: "+super.skinColor + " Height: " + height + " Weight: " + weight;
    }
}

