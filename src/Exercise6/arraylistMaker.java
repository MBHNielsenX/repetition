package Exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistMaker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i+1);
            System.out.println(numbers.get(i));
        }
        System.out.println();
        System.out.println("What number do you want to remove?");
        System.out.println("note: all multiples of the number will be removed except for the number itself");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            if (!(numbers.get(i) == userInput)) {
                if (numbers.get(i) % userInput == 0) {
                    numbers.remove(i);
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }


    }
}
