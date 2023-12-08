import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {
        //create new file reader and scanner

        File file = new File("C:\\Users\\Soren\\Desktop\\AdventOfCode\\AdventOfCode\\src\\inputs\\day4input.txt");
        Scanner sc = new Scanner(file);

        int sum = 0;
        String line = "";
        while (sc.hasNextLine()) {
            line = sc.nextLine();

            int max1;
            int min1;
            int max2;
            int min2;

            String[] firstSplit = line.split(",");
            String[] firsthalf = firstSplit[0].split("-");
            String[] secondhalf = firstSplit[1].split("-");

            min1 = Integer.parseInt(firsthalf[0]);
            max1 = Integer.parseInt(firsthalf[1]);
            min2 = Integer.parseInt(secondhalf[0]);
            max2 = Integer.parseInt(secondhalf[1]);


            if (((min1 >= min2) && (max1 <= max2)) || (min1 <= min2) && (max1 >=max2)) {
                sum++;
            }

        }
        System.out.println(sum);
    }
}



