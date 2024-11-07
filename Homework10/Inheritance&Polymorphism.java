package Homework10;
/* Develop a Shape class that can calculate the area of a shape. This class should have a
method to display the calculated area. Create a Circle class that inherits from the Shape class. This class should be able to
calculate the area of a circle based on its radius. Create a Rectangle class that inherits from the Shape class. This class should be able
to calculate the area of a rectangle based on its width and height. Create objects for each class. Assign them to variables of type Shape. Display the
calculated area for each object. Hints: When you use Shape class to calculate the area it should return 0 by default since Shape
is too generic to be bind to a specific formula. Create specific attributes in Circle and Rectangle class. Use them to calculate the area
Use Inheritance and Polymorphism.*/

class Shape {
    public double calculateArea() {
        return 0;  // Method to calculate the area - returns 0 for the generic Shape
    }
    public void displayArea()  {
        System.out.println("The area is:   " + calculateArea());
    }
}

class Circle extends Shape  {
    private double radius;

    public Circle(double radius)  {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape  {
    private double width;
    private double height;

    public Rectangle(double width, double height)  {
        this.width = width;
        this.height = height;
    }
  
    @Override
    public double calculateArea() {
        return width * height;
    }
}
class Main {
    public static void main(String[] args) {
        Shape circleShape = new Circle(6.25);
        circleShape.displayArea();

        Shape rectangleShape = new Rectangle(14.5,3.5);
        rectangleShape.displayArea();
    }
}

package Homework10;
/* We need a system to manage household appliances with basic details like brand and power
consumption. Each appliance should have the ability to be turned on or off. Add Appliance and specific types of appliances, like washing machines and refrigerators
Specific types should handle extra details such as load capacity and temperature settings. Washing machines need to start a wash cycle if it’s turned on (ex. Print message in console)
Refrigerators should set temperatures. Temperature must be in range 5 to -3. If the value is not  in rage the temperature must be set to 0.
The system should show both general and specific information for each appliance type. Create object from each appliance type and demo the display of the general and specific information.
The demonstration must be performed using a variable type corresponding to the superclass(parent).Hint: Use Inheritance */
// + Enhanced and customized version!

public class Appliance {
    protected String brand;
    protected int powerConsumption;
    protected boolean isTurnedOn;

    public Appliance(String brand, int powerConsumption)  {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isTurnedOn = false;  //Appliances are off by default
    }
    public void turnOn()  {
        if (!isTurnedOn) {
            isTurnedOn = true;
            System.out.println(brand + "  appliance is  turned ON.");
        }
    }
    public void turnOff()  {
        if (isTurnedOn) {
            isTurnedOn = false;
            System.out.println(brand + "  appliance is turned OFF.");
        }
    }
    public void factoryReset()  {
        turnOff();
        System.out.println("Factory reset:  Appliance setting reset to default. ");
    }
    public void displayInfo()  {
        System.out.println("Brand:  " + brand);
        System.out.println("Power consumption:  " + powerConsumption + "  watts");
        System.out.println("Status:  " + (isTurnedOn ?  "ON"  :  "OFF"));
    }
}
class Microwave extends Appliance  {
    private int maxTemperature;
    private int currentTemperature;
    private int capacity;
    private int currentLoad;

    public Microwave(String brand, int powerConsumption, int maxTemperature, int capacity)  {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemperature;
        this.currentTemperature = 0;  //Default temperature
        this.capacity = capacity;
        this.currentLoad = 0;  //Default load
    }
    public void setTemperature(int temperature)  {
        if (temperature >= 10 && temperature <= maxTemperature)  {
            this.currentTemperature = temperature;
            System.out.println("Microwave temperature set to:  " + currentTemperature + "°C");
        } else {
            System.out.println("Error: Temperature must be between 10°C and  " + maxTemperature + "°C.");
        }
    }
    public void addFood(int foodVolume)  {
        if (currentLoad + foodVolume <= capacity)  {
            currentLoad +=foodVolume;
            System.out.println("Added  " + foodVolume + "  litters of food. Current load: " + "/" + capacity + "  liters.");
        } else {
            System.out.println("Error:  Adding  " + foodVolume + "  liters exceeds microwave capacity of  " + capacity + "  liters.");
        }
    }
    public void heat()  {
if (isTurnedOn && currentTemperature > 0)  {
    System.out.println("Heating food at  " + currentTemperature + "°C.");
} else if (currentTemperature == 0)  {
    System.out.println("Error:  Set a temperature above 0 to start heating.");
} else {
    System.out.println("Error:  Microwave is not turned ON.");
}
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.currentTemperature = 0;
        this.currentLoad = 0;
        System.out.println("Microwave setting reset: Temperature and load are 0.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max temperature:  " + maxTemperature + "°C");
        System.out.println("Current temperature:  " + currentTemperature + "°C");
        System.out.println("Capacity:  " + capacity + " liters");
        System.out.println("Current load:  " + currentLoad + " liters");
    }
}
class VacuumCleaner extends Appliance  {
    private int noiseLevel;

    public VacuumCleaner(String brand, int powerConsumption, int noiseLevel)  {
        super(brand, powerConsumption);
        this.noiseLevel = noiseLevel;
    }
    public void turnOn()  {
        super.turnOn();
        tuneVacuumCleanerNoise();
    }
    public void tuneVacuumCleanerNoise()  {
        if (isTurnedOn)  {
            System.out.println("Starting Vacuum Cleaner with noise level of:   " + noiseLevel + " db. ");
        }
    }
    @Override
    public void factoryReset() {
        super.factoryReset();
        this.noiseLevel = 0;  //Reset noise level to 0
        System.out.println("Vacuum Cleaner setting reset:  Noise Level is   " + noiseLevel + " db. ");
    }
    public void displayInfo()  {
        super.displayInfo();
        System.out.println("Noise Level:   " + noiseLevel + " db" );
    }
}
class Absorber extends Appliance  {
    private int suctionCapacity;
    private int temperature;

    public Absorber(String brand, int powerConsumption, int suctionCapacity)  {
        super(brand, powerConsumption);
        this.suctionCapacity = suctionCapacity;
        this.temperature = 0;  //Default temperature
    }
    public void turnOn()  {
        super.turnOn();
        startAbsorberSuction();
    }
    public void startAbsorberSuction() {
        if (isTurnedOn) {
            System.out.println("Starting Absorber with suction capacity of:   " + suctionCapacity + " m3.");
        }
    }
    public void setTemperature(int temperature)  {
        if (temperature >= -3 && temperature <= 5) {
            this.temperature = temperature;
        } else {
            this.temperature = 0;  //Default temperature if out of range
        }
        System.out.println("Absorber temperature set to:  " + this.temperature + "°C");
    }
    @Override
    public void factoryReset() {
        super.factoryReset();
        this.temperature = 0;  //Reset temperature to 0
        System.out.println("Absorber setting reset:  Temperature is  " + temperature + "°C.");
    }
    public void displayInfo()  {
    super.displayInfo();
        System.out.println("Suction capacity:   " + suctionCapacity + "  m3");
        System.out.println("Current temperature:  " + temperature + "°C");
    }
}
class Basic {
    public static void main(String[] args) {
        Appliance myVacuumCleaner = new VacuumCleaner("Samsung", 450, 65);
        myVacuumCleaner.turnOn();
        myVacuumCleaner.displayInfo();
        System.out.println("\nApplying factory reset on Vacuum cleaner.");
        myVacuumCleaner.factoryReset();
        myVacuumCleaner.displayInfo();

        System.out.println("\n------------------\n");

        Appliance myAbsorber = new Absorber("Gorenje", 290, 450);
        myAbsorber.turnOn();
        ((Absorber) myAbsorber).setTemperature(4);
        myAbsorber.displayInfo();
        System.out.println("\nApplying factory reset on Absorber.");
        myAbsorber.factoryReset();
        myAbsorber.displayInfo();

        System.out.println("\n--------------------\n");

        Appliance myMicrowave = new Microwave("LG", 255, 200,15);
        myMicrowave.turnOn();
        ((Microwave) myMicrowave).setTemperature(100);
        ((Microwave) myMicrowave).addFood(8);
        ((Microwave) myMicrowave).heat();
        myMicrowave.displayInfo();

        System.out.println("\nApplying factory reset on Microwave.");
        myMicrowave.factoryReset();
        myMicrowave.displayInfo();
    }
}
