package task10_2;

public class Main {
    public static void main(String[] args) {
        BMI bmi =new BMI("Ali", 25, 70, 5, 9);
        System.out.println(bmi.getBMI());
        System.out.println(bmi.getStatus());
    }
}
