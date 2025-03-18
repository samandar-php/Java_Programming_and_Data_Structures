package task10_3;

public class MyInteger {
    private final int value;
    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value < 2) return false;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }


    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static boolean isEven(MyInteger n) {
        return n.isEven();
    }

    public static boolean isOdd(MyInteger n) {
        return n.isOdd();
    }

    public static boolean isPrime(MyInteger n) {
        return n.isPrime();
    }

    public boolean equals(int n) {
        return value == n;
    }

    public boolean equals(MyInteger n) {
        return value == n.getValue();
    }


    public static int parseInt(char[] chars) {
        int num = 0;
        for (char c : chars) {
            num = num * 10 + (c - '0');
        }
        return num;
    }

}
