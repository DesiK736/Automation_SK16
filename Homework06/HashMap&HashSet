package Homework06;
/*Tracking Inventory in a Store - Use a HashMap to manage a store's inventory, where the product name
is the key, and the quantity in stock is the value*/

import java.util.Collection;
import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String, Integer>  inventoryProducts = new HashMap<String, Integer>();

        //Add several products to the inventory with their quantities.
        inventoryProducts.put("Bread", 12);
        inventoryProducts.put("Milk", 7);
        inventoryProducts.put("Chocolate", 38);
        inventoryProducts.put("Butter", 22);
        inventoryProducts.put("Oil", 59);
        inventoryProducts.put("Mineral  water", 82);
        inventoryProducts.put("Snacks", 41);
        inventoryProducts.put("Olives", 74);

        Integer bread = inventoryProducts.get("Bread"); // Check the quantity of a specific product.
        System.out.println("Bread:   " + bread);

        inventoryProducts.replace("Olives", 74, 95); //Restock a product by increasing its quantity.
        System.out.println("Product with increased quantity:  " + inventoryProducts);

           inventoryProducts.put("Butter", 0); //Mark a product as out of stock by setting its quantity to zero.
          Collection<Integer>  inventoryProductsvalues = inventoryProducts.values();
          System.out.println("Butter is out of stock after setting its quantity:  " + inventoryProducts);

          inventoryProducts.remove("Snacks", 41); //Remove a product from the inventory
        System.out.println("Updated list after removal:  " + inventoryProducts); //Print the entire inventory to see the stock levels.
      }
    }

//Unique Guest List for a Party - Use a HashSet to manage a list of unique guests for a party.

import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        HashSet<String>  guestList = new HashSet<String>();

        guestList.add("Anna"); //Add several guest names to the list.
        guestList.add("Kaloyan");
        guestList. add("Silvia");
        guestList.add("Petya");
        guestList.add("Ivelina");
        guestList.add("Stanimir");
        guestList.add("Anna"); //Attempt to add a duplicate name and observe that it doesn’t get added again.

        guestList.remove("Ivelina"); //Remove a guest who can’t attend the party.

        guestList.contains("Petya"); //Check if a specific person is on the guest list.

        System.out.println("The whole list of guests:   " + guestList); //Print all the guest names to see who is attending.
    }
}

import java.util.HashMap;

public class Exercise_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> sportsView = new HashMap<Integer, String>();
        sportsView.put(1, "Basketball");
        sportsView.put(2, "Volleyball");
        sportsView.put(3, "Tennis");
        sportsView.put(4, "Football");
        sportsView.put(5, "Baseball");
        sportsView.put(6, "Wrestling");

        sportsView.get(1);
        System.out.println("Show me the first sport:  " + sportsView.get(1));

        for (String sport : sportsView.values())   {
            System.out.println("Print values for the each row of the HashMap:  " + sport);
        }
for (Integer sport :  sportsView.keySet())   {
    System.out.println("key:  " +  sport  +  ",   value:  " + sportsView.get(sport));
}

sportsView.remove(4);
        System.out.println(sportsView.containsValue("Football"));
        System.out.println("Size of the elements are:  " + sportsView.size());
        System.out.println("Updated sports:  " + sportsView);
    }
}

import java.util.HashSet;

public class Exercise_HashSet {
    public static void main(String[] args) {
        HashSet<String>  contries = new HashSet<String>();
        boolean isEmpty = contries.isEmpty();
        System.out.println("Is HashSet empty:  " + isEmpty);

        contries.add("Bulgaria");
        contries.add("Spain");
        contries.add("Italy");
        contries.add("Gambia");
        contries.add("Peru");
        contries.add("Malta");
        contries.add("Panama");

        int size = contries.size();
        System.out.println("Size of the HashSet:  " + size);

        if (contries.contains("Malta")) {
            System.out.println("Malta " + "was found in the set");
        } else {
            System.out.println("Malta "  +  "was not found");
        }

        System.out.println("Is the set empty:  " +  contries.isEmpty());
    }
}
