public class Car {
    //classes can be organized into groupings, which are called
    //packages. You declare a package name in the class using the package statement.
    //if you dont declare package, the class implicity belongs to default package.
    //a getter is a method on a class, that retrieves the value of a private field and returns it.


    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public boolean isConvertible(){
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door" +

                color + " " +
                make  + " " +
                model + " "+
                        (convertible ? "Convertible" : "")




                );
    }

}
