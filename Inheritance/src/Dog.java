public class Dog extends Animal{
    //extends -using extends specifies the superclass (or the parent class
    //of the class we're declaring. Dog is a subclass or child class, of Animal.
    //Animal is a parent, or super class, of Dog.
    //A class can specify one, and only one, class in its extends clause.
    //super() is a lot like this () its a way to call a constructor on the super class
    //directly from the sub class's constructor. must be the first statement in constructor.
    // this and super cant be called inside the same constructor.

    private String earShaped;
    private String tailShaped;
    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight, String earShaped, String tailShaped) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShaped = earShaped;
        this.tailShaped = tailShaped;
    }
}
