package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class MisingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 8, 10, 6};
        Arrays.sort(numbers);

        ArrayList<Integer> num = new ArrayList<>();
        for (int i : numbers) {
            num.add(i);
        }

        System.out.println(num);

        System.out.println("--------------------");
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];
        int[] newNumbers = new int[lastNumber - firstNumber + 1];

        for (int i = 0; i < newNumbers.length; i++) {

            newNumbers[i] = firstNumber + i;
        }
        System.out.println(Arrays.toString(newNumbers));

        ArrayList<Integer> newNum = new ArrayList<>();
        for (int j : newNumbers) {
            newNum.add(j);
        }
        System.out.println(newNum);

        System.out.println("----------------------");

        newNum.removeAll(num);
        System.out.println(newNum);

    }



    }

