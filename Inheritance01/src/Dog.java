public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Ow Woooo! ");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            wagTail();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();


    }

    private void bark(){
        System.out.println("Woof! ");
    }
    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void wagTail(){
        System.out.println("Tail Wagging ");
    }




}

//Overridden method
//it can implement completely differnet behavior, overriding behavior of the parent.
//it can simply call the parent class's method, which is redundant to do,
//or the method can call the parent class method, and include other code to run, so
//it can extend the functionality for the dog, for that behavior.
