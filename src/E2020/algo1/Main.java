package E2020.algo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws FileNotFoundException {
        int targetNum = 2020;
        List<Integer> nums = new ArrayList<>();

        Scanner sc = new Scanner(new File("src/E2020/algo1/input.txt"));

        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            int difference = targetNum - nums.get(i);
            int index = Collections.binarySearch(nums, difference);
            if (index > 0 && index != i) {
                int result = difference * nums.get(i);
                System.out.println(result);
                break;
            }

        }
    }
}