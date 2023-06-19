public class Car {

//    classes can be organized into groupings, which are called packages.
//    You declare a package name in the class using the package statement.
//    if you dont declare a package, the class implicity belongs to default package.
//    What is null? null is a special keyword in Java, meaning the variable or
//    attribute has a type, but no reference to an object.
//    A getter is a method on a class, that retrieves the value of a private field,
//     and returns it
//    a setter is a method on a class, that sets the value of a private field.

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

//    public void setMake(String make){
//        this.make = make;
//    }

    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setColor(String color){
        this.color = color;
    }
    public  void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door" +

                color + " " +
                make + " " +
                model + " " +
                        (convertible ? "Convertible" : "")
                );


    }

}
