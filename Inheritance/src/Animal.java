public class Animal {
    private String type;
    private String size;
    private double weight;
    //a constructor in Java is a special method that is used to
    //initialize objects. The constructor is called when an object of
    //a class is created.
public Animal(){

}
    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;

    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise ");
    }
}
