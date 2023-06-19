public class Main {
    public static void main(String[] args) {
       Car car = new Car();
       car.describeCar();
       car.setMake("Benz ");
       car.setModel("G-Wagon ");
       car.setDoors(4);
       car.setColor("red");
       car.setConvertible(false);


       //getters and setters
        //A getter is a method on a class, that retrieves the value of a private field, and returns it.
        //A setter is a method on a class, that sets the value of a private field.
        //the purpose of the methods is to control, and protect access to private fields.
        //this is a special keyword in Java. refers to the instance that was created
        //when the object was instantiated.
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        car.describeCar();


    }
}