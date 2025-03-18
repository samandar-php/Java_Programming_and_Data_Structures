package task10_3;

public class Main {
    public static void main(String[] args) {
                MyInteger num1 = new MyInteger(7);
                MyInteger num2 = new MyInteger(10);
                System.out.println("num1 = " + num1.value());
                System.out.println("Is num1 even? " + num1.isEven());
                System.out.println("Is num1 odd? " + num1.isOdd());
                System.out.println("Is num1 prime? " + num1.isPrime());
                System.out.println("Is 10 even? " + MyInteger.isEven(10));
                System.out.println("Is 10 odd? " + MyInteger.isOdd(10));
                System.out.println("Is 10 prime? " + MyInteger.isPrime(10));
                System.out.println("Is num2 even? " + MyInteger.isEven(num2));
                System.out.println("Is num2 odd? " + MyInteger.isOdd(num2));
                System.out.println("Is num2 prime? " + MyInteger.isPrime(num2));
                System.out.println("Does num1 equal 7? " + num1.equals(7));
                System.out.println("Does num1 equal num2? " + num1.equals(num2));

    }
}
