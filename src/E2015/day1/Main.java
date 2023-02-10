package E2015.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader in = new BufferedReader(new FileReader("src/E2015/day1/input.txt"));
       // Exo 1
        /*String read1;
        while ((read1 = in.readLine()) != null){
            char[] etage = read1.toCharArray();
            for (char c : etage) {
                if (c == '(') {
                    result++;
                } else {
                    result--;
                }
            }
          System.out.println(result);
        }*/


        //Exo2
        int result2 = 0;
        String read2;
        while ((read2 = in.readLine()) != null) {
            char[] etage2 = read2.toCharArray();
            for (int i = 0; i < etage2.length; i++) {
                if(result2 > 0 || result2 == 0) {
                    if (etage2[i] == '(') {
                        result2++;
                    } else{
                        result2--;
                    }
                }else{
                    result2 = i;
                    break;
                }
            }
            System.out.println(result2);

        }









    }
}
