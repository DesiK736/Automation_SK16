package Homework11;
/* Define an interface named Shape that includes two methods: getArea and getPerimeter,
both returning a Double. Next, create two classes: Circle and Rectangle, that implement the Shape interface. In the
Circle class, implement the getArea and getPerimeter methods using the formulae for a circle's area and perimeter
(Area = π * radius², Perimeter = 2 * π * radius). In the Rectangle class, implement these methods using the formulae for a
rectangle's area and perimeter (Area = length * width, Perimeter = 2 * (length + width)). Finally, create a main class to
instantiate a Circle and a Rectangle, then print out their area and perimeter. Predict the results before running the code.*/

interface Shape {
double getArea();
double getPerimeter();
}

class Circle implements Shape  {
    private double radius;

    public Circle(double radius)  {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI  * radius;
    }
}

class Rectangle implements Shape  {
    private double length;
    private double width;

    public Rectangle(double length, double width)  {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Main  {
    public static void main(String[] args) {
        Shape circle = new Circle(9);
        System.out.println("Circle:  ");
        System.out.println("Area:  " + circle.getArea());
        System.out.println("Perimeter:  " + circle.getPerimeter());

        Shape rectangle = new Rectangle(6.5, 4.4);
        System.out.println("\nRectangle:  ");
        System.out.println("Area:  " + rectangle.getArea());
        System.out.println("Perimeter:  " + rectangle.getPerimeter());
    }
}


/*Create class Employee with the following attributes – id, first name, last name , salary per
month. Id, first name , last name – must be set only once. Salary – can be updated any time. Add the following methods –
getName() / getAnnualSalary() / raiseSalary(). getName – combines firstname and last name. getAnnualSalary –
return what is the annual salary for the employee. raiseSalary – modify current salary by X% and return the update salary.
toString – should print all the information about the employee. Hint: Use access modifiers, getters and setters.*/

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary)  {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId()  {
        return id;
    }
    public String getFirstName()  {
        return firstName;
    }
    public String getLastName()  {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName()  {
        return firstName + "  " + lastName;
    }
    
    public double getAnnualSalary()  {
        return salary  * 12;
    }
    //Method to raise the salary by a percentage and return updated salary
    public double raiseSalary(double percentage)  {
        salary += salary  *  (percentage / 100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [ id = " + id + ",  name = " + getName() + ", salary per month = " + salary + " BGN ]";
    }

    public static void main(String[] args) {
        Employee person1 = new Employee(1, "Plamena", "Stoilova", 1950.00);
        System.out.println(person1.toString());
        System.out.println("Name:  " + person1.getName());
        System.out.println("Annual salary:  " + person1.getAnnualSalary());

        person1.raiseSalary(5);
        System.out.println("Updated salary:  " + person1.getSalary());
        System.out.println(person1.toString());
    }
}


/*Update class Employee to be abstract.  Rename salary field to base salary. Create a method to return the base salary.
The method must be available only for all subclasses. Hint: use the most suitable access modifier. Create an abstract method
that calculates the monthly salary. Implement concrete subclasses FullTimeEmployee and PartTimeEmployee that extend the
Employee class and provide specific implementations for calculating the monthly salary. The FullTimeEmployee monthly
salary calculation must be base salary. For the PartTimeEmployee add a fields hoursWorked and hourlyRate.
PartTimeEmployee monthly salary must be calculated based on those two fields. Create objects of FullTimeEmployee and
PartTimeEmployee and assign them the Employee variables. Print the name and monthly salary of each employee. */

abstract class AbstractEmployee {
private final int id;
private final String firstName;
private final String lastName;
protected double baseSalary; 

    public AbstractEmployee(int id, String firstName, String lastName, double baseSalary)  {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName()  {
        return firstName + "  " + lastName;
    }
   
    protected double getBaseSalary()  {
        return baseSalary;
    }
 
    abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Employee [ id = " + id + ",  name = " + getName() + ", monthly salary = " + calculateMonthlySalary() + " BGN ]";
    }
}

class FullTimeEmployee extends AbstractEmployee {

    public FullTimeEmployee(int id, String firstName, String lastName, double baseSalary)  {
        super(id, firstName, lastName, baseSalary);
    }
    //Full-time employee's monthly salary is simply the base salary
    public double calculateMonthlySalary()  {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends AbstractEmployee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String firstName, String lastName, double baseSalary, double hoursWorked, double hourlyRate)  {
super(id, firstName, lastName, baseSalary);
this.hoursWorked = hoursWorked;
this.hourlyRate = hourlyRate;
    }
   
    public double calculateMonthlySalary()  {
        return hoursWorked  *  hourlyRate;
    }
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        AbstractEmployee fullTimePerson1 = new FullTimeEmployee(1, "Lidiya", "Kondova", 2200.50);
        AbstractEmployee partTimePerson1 = new PartTimeEmployee(2, "Svetla", "Ladzhova", 0.00, 6, 75);

        System.out.println("ID: " + fullTimePerson1.getId() + ", Name:  " + fullTimePerson1.getName() + ",  Monthly salary for Full-time person1:  " + fullTimePerson1.calculateMonthlySalary() + " BGN");
        System.out.println("ID: " + partTimePerson1.getId() + ", Name:  " + partTimePerson1.getName() + ",  Monthly salary for Part-time person2:  " + partTimePerson1.calculateMonthlySalary()+ " BGN");
    }
}

/* ~ Further customized work on Encapsulation & Abstraction OOP concepts.~ */


import java.util.ArrayList;

public interface VendingItem {
double getVendingPrice();
}

abstract class VendingMachine implements VendingItem  {
private String dispenseItem;
private int itemDiversityCount;
private double vendingPrice;

        public VendingMachine(String dispenseItem, int itemDiversityCount, double vendingPrice)  {
            this.dispenseItem = dispenseItem;
            this.itemDiversityCount = itemDiversityCount;
            this.vendingPrice = vendingPrice;
    }

    public String getDispenseItem() {
        return dispenseItem;
    }

    public int getItemDiversityCount() {
        return itemDiversityCount;
    }

        @Override
        public double getVendingPrice() {
            return vendingPrice;
        }

        public void displayVendingMachineInfo()  {
        System.out.println("Dispense item:  " + dispenseItem);
        System.out.println("Count of item's diversity:  " + itemDiversityCount);
        System.out.println("Vending machine price:  " + vendingPrice + " BGN");
    }
}

class DrinksVendingMachine extends VendingMachine  {
    private String type;
    private ArrayList<String> mainBrands;

    public DrinksVendingMachine(String dispenseItem, int itemDiversityCount, double vendingPrice, String type, ArrayList<String>  mainBrands)  {
        super(dispenseItem, itemDiversityCount, vendingPrice);
        this.type = type;
        this.mainBrands = mainBrands;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getVendingPrice() {
        return super.getVendingPrice();
    }

    @Override
    public void displayVendingMachineInfo() {
        super.displayVendingMachineInfo();
        System.out.println("Drinks type:  " + type);
        System.out.println("Main brands:  " + mainBrands);
    }
}

class MedicinesVendingMachine extends VendingMachine  {
    private double medicinePrice;
    private String name;
    private String packaging;
    private String typeOfTreatment;

    public MedicinesVendingMachine(String dispenseItem, int itemDiversityCount, double vendingPrice, double medicinePrice, String name, String packaging, String typeOfTreatment)  {
        super(dispenseItem, itemDiversityCount, vendingPrice);
        this.medicinePrice = medicinePrice;
        this.name = name;
        this.packaging = packaging;
        this.typeOfTreatment = typeOfTreatment;
    }

    public String getPackaging() {
        return packaging;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    @Override
    public void displayVendingMachineInfo() {
        super.displayVendingMachineInfo();
        System.out.println("Medicine price:  " + medicinePrice + " BGN");
        System.out.println("Medicine name:  " + name);
        System.out.println("Packaging:  " + packaging);
        System.out.println("Type of treatment:  " + typeOfTreatment);
    }
}

import java.util.ArrayList;

public class MainVending {
    public static void main(String[] args) {
        ArrayList<String>  hotDrinksBrand = new ArrayList<>();
        hotDrinksBrand.add("Nescafe");
        hotDrinksBrand.add("Espresso");
        hotDrinksBrand.add("La Festa");
        hotDrinksBrand.add("Bianchi");
        hotDrinksBrand.add("LavAzza");
        hotDrinksBrand.add("Bioprograma");
        hotDrinksBrand.add("Phytolek");

        ArrayList<String>  fizzyDrinksBrand = new ArrayList<>();
        fizzyDrinksBrand.add("Pepsi");
        fizzyDrinksBrand.add("Coca Cola");
        fizzyDrinksBrand.add("Sprite");
        fizzyDrinksBrand.add("Fuzetea");
        fizzyDrinksBrand.add("Fanta");
        fizzyDrinksBrand.add("Kinley");
        fizzyDrinksBrand.add("Devin");
        fizzyDrinksBrand.add("Schweppes");

        ArrayList<String>  healthyDrinksBrand = new ArrayList<>();
        healthyDrinksBrand.add("Rice Pro");
        healthyDrinksBrand.add("Medicura");
        healthyDrinksBrand.add("Bioherba");
        healthyDrinksBrand.add("Глътка Здраве GOLD");
        healthyDrinksBrand.add("Vico Fresh");

        VendingMachine myDrinks1 = new DrinksVendingMachine("drinks", 7,  1950.25,"hot drinks", hotDrinksBrand);
        myDrinks1.displayVendingMachineInfo();
        System.out.println("\n--------------------\n");

        VendingMachine myDrinks2 = new DrinksVendingMachine("drinks", 8,  2200.55,"fizzy drinks", fizzyDrinksBrand);
        myDrinks2.displayVendingMachineInfo();
        System.out.println("\n--------------------\n");

        VendingMachine myDrinks3 = new DrinksVendingMachine("drinks", 5,  3200.99,"healthy drinks", healthyDrinksBrand);
        myDrinks3.displayVendingMachineInfo();
        (( DrinksVendingMachine) myDrinks3).setType(" \'Healthier Lifestyle\' ");
        System.out.println("Updated drinks type for \'healthy drinks\' to:  " + ((DrinksVendingMachine) myDrinks3).getType());

        System.out.println("\n--------------------\n");

        VendingMachine myMedicine1 = new MedicinesVendingMachine("medicines", 25, 1250.55,  25.98, "\"Ospamox\"", "tablets", "treatment of infections");
        myMedicine1.displayVendingMachineInfo();
        System.out.println("\n--------------------\n");

        VendingMachine myMedicine2 = new MedicinesVendingMachine("medicines", 12, 2550.66, 12.54, "\"Paracetamol\"", "tablets", "fever medication");
        myMedicine2.displayVendingMachineInfo();
        System.out.println("\n--------------------\n");

        VendingMachine myMedicine3 = new MedicinesVendingMachine("medicines", 5, 3250.77, 15.88, "\"Fervex\"", "sachets", "treatment of colds");
        myMedicine3.displayVendingMachineInfo();

       }
   }
