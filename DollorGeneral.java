import java.util.ArrayList;

public class DollarGeneral {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 10, 20, 50, 100};
        ArrayList<Integer> array = new ArrayList<>();
        int targetValue = 125;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int denomination = numbers[i];
            if (targetValue >= denomination) {
                int count = targetValue / denomination;
                for (int j = 0; j < count; j++) {
                    array.add(denomination);
                }
                targetValue %= denomination;
            }
        }

        System.out.println("Combination: " + array);
    }
}
