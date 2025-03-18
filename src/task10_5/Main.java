package task10_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();
        int factor = 2;

        while (number > 1) {
            while (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            }
            factor++;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
