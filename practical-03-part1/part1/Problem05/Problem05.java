import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Matrix Determinant Calculator!");
        System.out.println("Would you like to calculate the determinant of a new matrix?");
        System.out.println("1. Yes, 2. No");
        System.out.println();
        System.out.print("Option: ");
        int num = sc.nextInt();     //receive 1 or 2
        switch (num) {
            case 1: {
                System.out.println("What is the dimension of the matrix?");
                System.out.print("Input: ");
                String dmns = sc.next();        //receive dimension
                switch (dmns) {
                    case "2*2": {
                        System.out.println("Great! Let's calculate this determinant then.");
                        System.out.println("Please insert all the values for your matrix.");
                        double[][] arr2 = new double[2][2];       //arr2: second-order determinant
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("New matrix [%d][%d]: ", i + 1, j + 1);
                                arr2[i][j] = sc.nextDouble();       //receive determinant number
                            }
                        }
                        double result_2d = arr2[0][0] * arr2[1][1] - arr2[1][0] * arr2[0][1];
                        System.out.println("The determinant of your matrix is:");
                        System.out.println();
                        for (int i = 0; i < 2; i++) {
                            System.out.print("| ");          //this line
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("%-10s", arr2[i][j]);      //space
                            }
                            System.out.println("|");        //next line
                        }
                        System.out.printf("Determinant: %f", result_2d);
                        System.out.println();
                    }
                    case "3*3": {
                        System.out.println("Great! Let's calculate this determinant then.");
                        System.out.println("Please insert all the values for your matrix.");
                        double[][] arr3 = new double[3][3];       //arr3: third-order determinant
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("New matrix [%d][%d]: ", i + 1, j + 1);
                                arr3[i][j] = sc.nextDouble();       //receive determinant number
                            }
                        }
                        double result_3d = (arr3[0][0] * (arr3[1][1] * arr3[2][2] - arr3[1][2] * arr3[2][1])) - (arr3[0][1] * (arr3[1][0] * arr3[2][2] - arr3[1][2] * arr3[2][0])) + (arr3[0][2] * (arr3[1][0] * arr3[2][1] - arr3[1][1] * arr3[2][0]));
                        ;
                        System.out.println("The determinant of your matrix is:");
                        System.out.println();
                        for (int i = 0; i < 3; i++) {
                            System.out.print("| ");          //this line
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("%-10s", arr3[i][j]);      //space
                            }
                            System.out.println("|");        //next line
                        }
                        System.out.printf("Determinant: %f", result_3d);
                        System.out.println();
                    }
                }
                break;
            }
            case 2:
                break;      //directly end the project
        }
    }
}
