public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal("Generic Animal", "Huge", 400);
    doAnimalStuff(animal, "slow");

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast");

    Dog yorkie = new Dog("Yorkie", 15);
    doAnimalStuff(yorkie, "fast");

    Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
    doAnimalStuff(retriever, "slow");

    Dog wolf = new Dog("Wolf", 40);
    doAnimalStuff(wolf, "slow");

    Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
    doAnimalStuff(goldie, "fast");


    }
    //all subclasses can execute methods, even though the code is declared on the parent class
    //the code doesn't have to be duplicated in each subclass. we can use code from the parent.

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}