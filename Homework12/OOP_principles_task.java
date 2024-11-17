package Homework12;
/*Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality, EGN, date of birth, age, country of residence.
The date of birth attribute and age are composed during the creation of an object based on the EGN. EGN consists of 10 digits. If provided value for EGN or sex are not correct throw exception.
If wrong sex is provided program must continue its normal execution with printing relevant message. Only job and country of residence could change their values. All other attributes can`t be changes
once they are set. Hint: EGN validation should be limited to consisting 10 digits only, nothing more. Use only EGN with year in range 1900-1999. The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant parameters if any.
sayHello() should print Hello based on concrete person spoken language, default is in English. celebrateEaster should print if the concrete person celebrates Easter based on their religion. isAdult should take in consideration the country of residence.
canTakeLoan is based on the job. Languages – Bulgarian / Italian / English; Countries – Bulgaria (18) / Italy (18) / USA (21); Sex – Male / Female; Religions – Orthodox / Catholic / Islam
Create 4 classes Child, Bulgarian, American and Italian which inherit Person class. Use polymorphism to change the implementation of the methods that need different behavior.
Implement new methods specific only for the concrete class. Create different objects in the main class and use their methods. */
// ~ further developed task ~

import java.time.LocalDate;

interface PersonDeeds {
    void sayHello();

    void celebrateEaster();

    boolean isAdult();

    boolean canTakeLoan();
}
//InvalidDataException - custom exception class.
class InvalidDataException extends Exception  {
    public InvalidDataException(String message)  {
        super(message);
    }
}

abstract class Person implements PersonDeeds  {
     protected final String name;
     protected String gender;
     protected final String religion;
     private final String language;
     private final String nationality;
     private final String EGN;
     private final LocalDate dateOfBirth;
     private final int age;
     private String job;
     private String countryOfResidence;

     public Person(String name, String gender, String religion, String language, String nationality, String EGN, int age, String job, String countryOfResidence) throws InvalidDataException  {
         this.name = name;
         this.gender = gender;
         this.religion = religion;
         this.language = language;
         this.nationality = nationality;
         this.EGN = validateEGN(EGN);
         this.dateOfBirth = calculateDateOfBirth(this.EGN);
         this.age = calculateAge(this.dateOfBirth);
         this.job = job;
         this.countryOfResidence = countryOfResidence;

         if (!isValidGender(gender)) {
             System.out.println("Program continues executing, although provided value for \'gender\' is not correct...  " + gender + ".  Defaulting to 'Unknown'.");
             this.gender = "Unknown";
         } else {
             this.gender = gender;
         }
     }
     private boolean isValidGender(String gender)  {
         return gender.equalsIgnoreCase("Male")  ||  gender.equalsIgnoreCase("Female");
     }
     
    private String validateEGN(String EGN)  throws InvalidDataException  {
         if (EGN == null || !EGN.matches("\\d{10}"))  {  //Ensures, that the string consists of exactly 10 digits.
             throw new InvalidDataException("EGN must consist of  exactly  10 digits.");
         }
         return EGN;
     }
     private LocalDate calculateDateOfBirth(String EGN)  {
         int year = Integer.parseInt(EGN.substring(0,  2))  + 1900;  //EGN.substring(0, 2) - extracts the first two digits of the egn string, which represent the last two digits of the year of birth.
         int month = Integer.parseInt(EGN.substring(2,  4)); //EGN.substring(2, 4) - extracts the 3rd and 4th digits from the egn, which represent the month of birth.
         int day = Integer.parseInt(EGN.substring(4,  6)); //EGN.substring(4, 6) - extracts the 5th and 6th digits from the egn, which represent the day of birth.
         return LocalDate.of(year, month, day);
     }

protected int calculateAge(LocalDate dateOfBirth)  {
         return LocalDate.now().getYear() -  dateOfBirth.getYear();
     }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

   public abstract void sayHello();

    public abstract void celebrateEaster();

    public boolean isAdult()  {
         int ageOfMajority = switch (countryOfResidence.toLowerCase())  {
             case "bulgaria", "italy"  -> 18;
             case "usa"  -> 21;
             default -> 18;
         };
         return age >= ageOfMajority;
     }

    @Override
    public boolean canTakeLoan() {
        return job != null && !job.isBlank();
    }
}

class Bulgarian extends Person {
    public Bulgarian(String name, String gender, String religion, String language, String EGN, int age, String job, String countryOfResidence)
            throws InvalidDataException {
        super(name, gender, religion, language, "Bulgarian", EGN, age, job, countryOfResidence);
    }

    @Override
    public String toString() {
        return "Bulgarian {" +
                "name = '" + name + '\'' +
                '}';
    }
    
    @Override
    public void sayHello() {
        System.out.println("Здравей!");
    }

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("Orthodox")  || religion.equalsIgnoreCase("Catholic"))  {
            System.out.println(name + " celebrates \"Easter\".");
        } else {
            System.out.println(name + " does not celebrate \"Easter\".");
        }
    }

    public void danceHoro() {
        System.out.println("Dancing a traditional Bulgarian horo.");
    }
}

class American extends Person  {
    public American(String name, String gender, String religion, String language, String EGN, int age, String job, String countryOfResidence)
        throws InvalidDataException  {
        super(name, gender, religion, language, "American", EGN, age, job, countryOfResidence);
    }

    @Override
    public String toString() {
        return "American {" +
                "religion = '" + religion + '\'' +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("Orthodox") || religion.equalsIgnoreCase("Catholic"))  {
            System.out.println(name + " celebrates \"Easter\".");
        } else {
            System.out.println(name + " does not celebrate \"Easter\".");
        }
    }
    public void celebrateThanksGiving()  {
        System.out.println("Celebrating Thanksgiving!");
    }
}

class Italian extends Person  {
    public Italian(String name, String gender, String religion, String language, String EGN, int age, String job, String countryOfResidence)
        throws InvalidDataException  {
        super(name, gender, religion, language, "Italian", EGN, age , job, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    @Override
    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("Orthodox") || religion.equalsIgnoreCase("Catholic"))  {
            System.out.println(name + " celebrates \"Easter\".");
        } else {
            System.out.println(name + " does not celebrate \"Easter\".");
        }
    }
    public void makePizza()  {
        System.out.println("Making delicious Italian pizza!");
    }
}

class Child extends Person  {
    public Child(String name, String gender, String religion, String language, String nationality, String EGN, int age, String job, String countryOfResidence)  throws  InvalidDataException  {
        super(name, gender, religion, language, nationality, EGN, age , job, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi there!");
    }

    @Override
    public void celebrateEaster() {
        System.out.println(name + " is too young to care about \"Easter\".");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
    public void play()  {
        System.out.println("The child is playing with dolls.");
    }
}
