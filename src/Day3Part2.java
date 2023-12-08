import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Day3Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        //create new file reader and scanner

        File file = new File("C:\\Users\\Soren\\Desktop\\AdventOfCode\\AdventOfCode\\src\\inputs\\day3Input.txt");
        Scanner sc = new Scanner(file);


        int sum = 0;
        String line = "";
        String firstline = "";
        String secondline = "";
        String thirdline = "";

        int lineloop = 0;


        while (sc.hasNextLine()){
            thirdline = secondline;
            secondline = firstline;
            line = sc.nextLine();
            firstline = line;
            lineloop++;

            if ((lineloop % 3) == 0) {


                Hashtable<String, Integer> firstInventory = new Hashtable<>();

                Integer i = 0;
                while (i < firstline.length()) {

                    firstInventory.merge(String.valueOf(firstline.charAt(i)), 1, Integer::sum);
                    i++;
                }
                Hashtable<String, Integer> secondInventory = new Hashtable<>();
                secondInventory.putAll(firstInventory);

                Integer j = 0;
                while (j < secondline.length()) {

                    secondInventory.merge(String.valueOf(secondline.charAt(j)), 1, Integer::sum);
                    j++;
                }

                Hashtable<String, Integer> thirdInventory = new Hashtable<>();
                thirdInventory.putAll(secondInventory);

                Integer m = 0;
                while (m < thirdline.length()) {

                    thirdInventory.merge(String.valueOf(thirdline.charAt(m)), 1, Integer::sum);
                    m++;
                }



                String sharedString = "";
                Integer k = 0;
                while (sharedString == "") {

                    if ((firstInventory.get(String.valueOf(firstline.charAt(k))) !=
                            secondInventory.get(String.valueOf(firstline.charAt(k))))
                    && (secondInventory.get(String.valueOf(firstline.charAt(k))) !=
                            thirdInventory.get(String.valueOf(firstline.charAt(k)))))
                    {
                    sharedString = String.valueOf(firstline.charAt(k));
                    /*
                    System.out.println(sharedString);
                    System.out.println(firstInventory.get(String.valueOf(firstline.charAt(k))));
                    System.out.println(secondInventory.get(String.valueOf(firstline.charAt(k))));
                    System.out.println(thirdInventory.get(String.valueOf(firstline.charAt(k))));
                    System.out.println(firstInventory);
                    System.out.println(secondInventory);
                    */
                    }

                    k++;
                }
                if (Character.isLowerCase(sharedString.charAt(0))) {
                    sum = sum + sharedString.charAt(0) - 96;

                }
                if (Character.isUpperCase(sharedString.charAt(0))) {
                    sum = sum + sharedString.charAt(0) - (64 - 26);
                }
            }
        }

        System.out.println(sum);
    }
}
