import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        //create new file reader and scanner
        int sum = 0;
        try{


        File file = new File("C:\\Users\\Soren\\Desktop\\AdventOfCode\\AdventOfCode\\src\\inputs\\day2input.txt");
        Scanner sc = new Scanner(file);



        String line = "";

        Dictionary<String, Integer> lookup = new Hashtable<>();
       /*
        lookup.put("A X",4);
        lookup.put("A Y",8);
        lookup.put("A Z",3);
        lookup.put("B X",1);
        lookup.put("B Y",5);
        lookup.put("B Z",9);
        lookup.put("C X",7);
        lookup.put("C Y",2);
        lookup.put("C Z",6);
        */
        lookup.put("A X",3);
        lookup.put("A Y",4);
        lookup.put("A Z",8);
        lookup.put("B X",1);
        lookup.put("B Y",5);
        lookup.put("B Z",9);
        lookup.put("C X",2);
        lookup.put("C Y",6);
        lookup.put("C Z",7);


        while (sc.hasNextLine()){
            line = sc.nextLine();
            sum = sum + lookup.get(line);
        }


        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        finally {
            System.out.println(sum);
        }
    }
}