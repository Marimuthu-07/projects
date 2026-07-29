
import java.util.Scanner;

public class Matrix_Operations {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr_1=new int[3][3][3];
        int[][][] arr_2=new int[3][3][3];

        System.out.println("Enter Array No.1 :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr_1[i][j][k]= sc.nextInt();
                }
            }
        }
        System.out.println("Enter Array No.2 :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr_2[i][j][k]= sc.nextInt();
                }
            }
        }

        System.out.println("The Array 01 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr_1[i][j][k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("The Array 02 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr_2[i][j][k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("The Array Added : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr_1[i][j][k]+arr_2[i][j][k]+" ");
                }
                System.out.println();
            }
        }

    }
}

