import java.util.ArrayList;
import java.io.*;

public class LearnArrayLists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        boolean isEmptyFruits = fruits.isEmpty();
        System.out.println(isEmptyFruits);
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits.toString());
        System.out.println("Fruits List Size: "+ fruits.size());
        System.out.println("=============================");
        System.out.println(fruits.get(0));

        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        boolean containsOrange = fruits.contains("Orange");
        int indexBanana = fruits.indexOf("banana");
        if (indexBanana == -1) {
            System.out.println("banana is out of stock" + fruits.toString());
        }
        System.out.println("Fruits has Orange? -> "+containsOrange);
        System.out.println("Index of banana: "+indexBanana);
        fruits.add("Banana");
        fruits.add("Kiwi");
        System.out.println(fruits.toString());
        fruits.indexOf("Mango");
        System.out.println("MangoIndex: "+fruits.indexOf("Mango"));
        fruits.remove("Mango");
        System.out.println("Fruits: "+ fruits.toString());

    }



}
