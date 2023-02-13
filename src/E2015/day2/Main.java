package E2015.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int l=0, w=0, h=0, result = 0, surface;

        BufferedReader input  = new BufferedReader(new FileReader("src/E2015/day2/input.txt"));
        String read;

        //Exo1

       /* while((read = input.readLine()) != null){
            String[] nbre = read.split("x");
            l = Integer.parseInt(nbre[0]);
            w = Integer.parseInt(nbre[1]);
            h = Integer.parseInt(nbre[2]);
            int min = Integer.min(Integer.min(l*w, l*h), w*h);
            surface  = ((2 * l * w )+ (2 * w * h) + (2 * h * l) )+ min ;
            result += surface;
        }
        System.out.println(result);*/
    // Exo2
        while((read = input.readLine()) != null){
            String[] nbre = read.split("x");
            l = Integer.parseInt(nbre[0]);
            w = Integer.parseInt(nbre[1]);
            h = Integer.parseInt(nbre[2]);
            int min = Integer.min(Integer.min(l*w, l*h), w*h);
            surface  = ((2 * l * w )+ (2 * w * h) + (2 * h * l) )+ min ;
            result += surface;
        }
        System.out.println(result);
        input.close();

        input.close();


    }

}
