public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return model;
    }

    public void setMake(String make){
        if(make == null) make = "unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "honda", "mercedes", "ford" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model){
        if(model == null) model = "unknown";
        String lowercaseModel = model.toLowerCase();
        switch (lowercaseModel){
            case "accord", "cls550", "mustang" -> this.model = model;
            default -> {
                this.model = "Unsupported";
            }
        }
    }

    public void setColor(String color){
        if(color == null) color = "unknown";
        String lowercaseColor = color.toLowerCase();
        switch (lowercaseColor){
            case "red", " black ", "orange", "blue" -> this.color = color;
            default -> {
                this.color = " Unsupported ";
            }
        }
    }

    public void setDoors(int doors){
        if(doors == 0) doors = 100;
        switch (doors){
            case 6, 8, 10 -> this.doors = doors;
            default -> {
                this.doors = 4;
            }
        }
    }

    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }



//
//    public void setMake(String make){
//        if(make == null) make = "unknown";
//        String lowercaseMake =  make.toLowerCase();
//        switch (lowercaseMake){
//            case "holden", "porsche", "telsa" -> this.make = make;
//            default -> {
//                this.make = "Unsupported ";
//            }
//        }
//    }

//    public void setModel(String model){
//        this.model = model;
//    }

//    public void setColor(String color){
//        this.color = color;
//    }

//    public void setDoors(int doors){
//        this.doors = doors;
//    }
//
//    public void setConvertible(boolean convertible){
//        this.convertible = convertible;
//    }


    public void describeCar(){

    System.out.println(doors + "-Door" +
            color + " " +
            make + " " +
            model + " " +
                    (convertible ? "Convertible" : "")
            );

}

public void describeTruck(){

    System.out.println(doors + "-Door" +
            color + " " +
            make + " " +
            model + " " +
                    (convertible ? "Convertible" : "")

            );
}
}
