package E2020.algo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) throws FileNotFoundException {

        // lecture du fichier
        File input  = new File("src/E2020/algo1/input.txt");
        Scanner obj = new Scanner(input);
        while (obj.hasNextLine())
            System.out.println(obj.nextLine());
    }


        }