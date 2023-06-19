public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.setMake("Porsche");
        car.setMake("Honda");
        car.setModel("ACCORD");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor(" black ");
        System.out.println(" make = " + car.getMake());
        System.out.println(" model " + car.getModel());
        System.out.println("color: " + car.getColor());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("mercedes");
        targa.setModel("cls550");
        targa.setColor("red");
        targa.setDoors(10);
        targa.setConvertible(false);
        targa.describeCar();
        System.out.println("car color " + targa.getColor());

    }
}