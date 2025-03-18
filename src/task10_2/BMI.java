package task10_2;

public class BMI {
    private String name;
    private int age;
    private final double weight;
    private final double height;

    public BMI(String name, int age, double weight, double height, int i) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    double getBMI(){
        return weight/height;
    }
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
}
