package E2020.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws FileNotFoundException {
        int targetNum = 2020;
        List<Integer> nums = new ArrayList<>();

        Scanner sc = new Scanner(new File("src/E2020/day1/input.txt"));

        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int difference = targetNum - num;
            int index = Collections.binarySearch(nums, difference);
            if (index > 0 && index != i) {
                int result = difference * num;
                System.out.println(result);
                break;
            }

        }

    }
}