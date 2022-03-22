import java.util.ArrayList;
import java.util.Arrays;

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
        Arrays.sort(nums);
        double median;
        if (nums.length % 2 == 0) {
            median = ((double) nums[nums.length / 2] + (double) nums[nums.length / 2 - 1]) / 2;
        } else {
            median = nums[nums.length / 2];
        }
        return median;
    }
    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
        for (Cat cat : cats) {
            cat.setColor(cat.getColor().toUpperCase());
        }
        return cats;
    }
}
