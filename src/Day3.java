import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        //create new file reader and scanner

        File file = new File("C:\\Users\\Soren\\Desktop\\AdventOfCode\\AdventOfCode\\src\\inputs\\day3input.txt");
        Scanner sc = new Scanner(file);


        int sum = 0;
        String line = "";
        String firsthalf = "";
        String secondhalf = "";



        while (sc.hasNextLine()){
            line = sc.nextLine();
            Integer middle = (line.length()/2);
            firsthalf = line.substring(0,middle);
            secondhalf = line.substring(middle);

            Hashtable<String, Integer> inventory = new Hashtable<>();

            Integer i = 0;
            while(i < middle){

                 inventory.merge(String.valueOf(firsthalf.charAt(i)),1,Integer::sum);
                i++;
            }
            Hashtable<String, Integer> secondInventory =  new Hashtable<>();
            secondInventory.putAll(inventory);

            Integer j = 0;
            while(j < middle){

                secondInventory.merge(String.valueOf(secondhalf.charAt(j)),1,Integer::sum);
                j++;
            }
            String sharedString = "";
            Integer k = 0;
            while (sharedString == ""){

                if (inventory.get(String.valueOf(firsthalf.charAt(k))) != secondInventory.get(String.valueOf(firsthalf.charAt(k)))){
                    sharedString = String.valueOf(firsthalf.charAt(k));
                    /*
                    System.out.println(sharedString);
                    System.out.println(inventory.get(String.valueOf(firsthalf.charAt(k))));
                    System.out.println(secondInventory.get(String.valueOf(firsthalf.charAt(k))));
                    System.out.println(inventory);
                    System.out.println(secondInventory);
                    */
                }

                k++;
            }
            if (Character.isLowerCase(sharedString.charAt(0))){
                sum = sum + sharedString.charAt(0) - 96;

            }
            if (Character.isUpperCase(sharedString.charAt(0))) {
                sum = sum + sharedString.charAt(0) - (64 - 26);
            }

        }

        System.out.println(sum);
    }
}
