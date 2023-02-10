package E2020.algo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getNbPassword(List<String> data){
        int[] min  = new int[data.size()];
        int[] max  = new int[data.size()];
        char[] carac  = new char[data.size()];
        String[] password = new String[data.size()];


        for(int i = 0; i< data.size(); i++){

           min[i]  =  Integer.parseInt(data.get(0).split("-")[0]);
        }

        return data.size();
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/E2020/algo2/input.txt"));
        List<String> data = new ArrayList<String>();
        while (sc.hasNextLine()){

            String line  = sc.nextLine();
            data.add(line);
        }
        getNbPassword(data);
    }
}
