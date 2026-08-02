import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] vector = new int[size];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {

                if (vector[i] + vector[j] == target) {
                    index1 = i;
                    index2 = j;
                }

            }
        }

        System.out.println("[" + index1 + ", " + index2 + "]");

        sc.close();
    }
}