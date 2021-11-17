import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ex3 {
    public static void main(String args[]) throws IOException {
        String vet1, ende = scan.nextLine();
        Scanner scan = new Scanner(System.in);
        BufferedReader bastaler = new BufferedReader(new FileReader(ende));
        int j = 0;
        int b[][] = new int[2][2];
        int a[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vet1 = bastaler.readLine();
                b[i][j] = Integer.parseInt(vet1);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vet1 = bastaler.readLine();
                a[i][j] = Integer.parseInt(vet1);
            }
        }

       
        if ((a[0][1] < a[1][0]) || (a[1][1] < a[0][0]) || (b[0][1] < b[1][0]) || (b[1][1] < a[1][1])
                || (a[1][0] > a[0][1]) || (y[0][0] > b[1][1]) || (b[1][0] > b[0][1])) {
            System.out.print('1');
        } else {
            System.out.print('0');
        }
        scan.close();
        bastaler.close();
    }

}