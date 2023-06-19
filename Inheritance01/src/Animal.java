public class Animal {

    protected String type;
    private String size;
    private double weight;

    //constructor
    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(){

    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    //method
    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise ");
    }

    //Dog inherits from Animal. When we create a Dog object, it will
    //inherit Animals attributes (type, size and weight). children class
    //will inherit parents attributes and methods.

}
