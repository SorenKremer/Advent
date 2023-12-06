import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //create new file reader and scanner

        File file = new File("C:\\Users\\Soren\\Desktop\\AdventOfCode\\AdventOfCode\\src\\input.txt");
        Scanner sc = new Scanner(file);

        //create arrayList
        ArrayList<Integer> elvesArrayList = new ArrayList<Integer>();

        int i = 0;
        int sum = 0;
        String line = "";
        while (sc.hasNextLine()){
            line = sc.nextLine();

            if (line.length() == 0) {
                elvesArrayList.add(sum);
                i = i++;
                sum = 0;
                continue;
            }
            sum = sum + Integer.parseInt(line);
            //System.out.println(sum);


        }
        elvesArrayList.add(sum);
        //System.out.println(elvesArrayList);
        int max = Collections.max(elvesArrayList);
        System.out.println("Elf with most calories has : " + max );
        elvesArrayList.remove(elvesArrayList.indexOf(max));
        int max2 = Collections.max(elvesArrayList);
        System.out.println("Elf with second most calories has : " + max2 );
        elvesArrayList.remove(elvesArrayList.indexOf(max2));
        int max3 = Collections.max(elvesArrayList);
        System.out.println("Elf with third most calories has : " + max3 );

        System.out.println("The total calories of top 3 elves is : " + (max + max2 + max3) );

    }


}