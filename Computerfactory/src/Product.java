public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }


    }
    class Monitor extends Product {

        private int size;
        private String resolution;

        public Monitor(String model, String manufacturer){
            super(model, manufacturer);

        }

        //%d specifies that the single variable is a decimal integer.

        public void drawPixelAt(int x, int y, String color){
            System.out.println(String.format("Drawing pixel at %d, %d in color %s ",
                    x,y, color));
        }

        public Monitor(String model, String manufacturer, int size, String resolution){
            super(model, manufacturer);
            this.size = size;
            this.resolution = resolution;
        }

}
    class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    //constructors
        public Motherboard(String model, String manufacturer){
            super(model, manufacturer);
        }

        public Motherboard(String model, String manufacturer, int ramSlots,
                           int cardSlots, String bios){
            super(model, manufacturer);
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }

        //method
        public void loadProgram(String programName){
            System.out.println("Program " + programName + " is now loading...");

        }


    }

    class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manufacture){
        super(model, manufacture);
    }

    public ComputerCase(String model, String manufacture, String powerSupply){
        super(model, manufacture);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
    }

