import java.util.Random;
import java.util.Scanner;

public class Massiv5 {
    public static void main(String[] ags) {

        int[][] test = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < test.length; i++)
            for (int j = 0; j < test.length; j++)
                test[i][j] = random.nextInt(10);

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test.length; j++) {

                System.out.print(test[i][j] + "  ");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test.length; j++) {
                test[i][j] += a;
                System.out.print(test[i][j] + "  ");

            }
            System.out.println();
        }
        int x = test.length;
        int sum = 0;
        for (int i = 0; i<x;i++){
            for (int j = 0; j<x;j++)
                sum += test[i][j];
        }
        System.out.println("Сумма элементов массива  " + sum);

    }


}
