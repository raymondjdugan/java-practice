import java.util.ArrayList;

public class AssessmentReview {
    public static int cubed(int number) {
        return (int) Math.pow(number, 3);
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double median(int [] nums) {
        double total = 0;
        for (int num : nums) {
            total += num;
        }
        return total / nums.length;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
        for (Cat cat : cats) {
            cat.setColor(cat.getColor().toUpperCase());
        }
        return cats;
    }
}
