import java.util.Scanner;

public class ComplexCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the real part of the first complex number:");
        double a = sc.nextDouble();
        System.out.println("Please enter the imaginary part of the first complex number:");
        double b = sc.nextDouble();
        System.out.println("Please enter the real part of the second complex number:");
        double c = sc.nextDouble();
        System.out.println("Please enter the imaginary part of the second complex number:");
        double d = sc.nextDouble();
        System.out.println("Please input the operation symbol:");
        String os = sc.next();
        switch (os) {
            case "+":
                if (b + d > 0) {              //The output is: num1+num2i
                    System.out.printf("Addition of the two complex numbers is: %f+%fi", a + c, b + d);
                }else if (b + d < 0) {        //The output is: num1-num2i
                    System.out.printf("Addition of the two complex numbers is: %f%fi", a + c, b + d);
                }else{                        //The output is: num1
                    System.out.printf("Addition of the two complex numbers is: %f", a + c);
                }
                System.out.println();
                break;
            case "-":
                if (b - d > 0) {
                    System.out.printf("Subtraction of the two complex numbers is: %f+%fi", a - c, b - d);
                }else if (b - d < 0) {
                    System.out.printf("Subtraction of the two complex numbers is: %f%fi", a - c, b - d);
                }else{
                    System.out.printf("Subtraction of the two complex numbers is: %f", a - c);
                }
                System.out.println();
                break;
            case "*":       //(a+bi)(c+di)=(ac-bd)+(bc+ad)i
                double rp_m = a*c-b*d;     //record the real part of product
                double ip_m = b*c+a*d;     //record the imaginary part of product
                if (ip_m > 0) {
                    System.out.printf("Multiplication of the two complex numbers is: %f+%fi", rp_m, ip_m);
                }else if (ip_m < 0) {
                    System.out.printf("Multiplication of the two complex numbers is: %f%fi", rp_m, ip_m);
                }else{
                    System.out.printf("Multiplication of the two complex numbers is: %f", rp_m);
                }
                System.out.println();
                break;
            case "/":       //(a+bi)/(c+di)=(ac+bd)/(c^2+d^2)+((bc-ad)/(c^2+d^2))i
                double rp_d = (a*c+b*d)/(c*c+d*d);     //record the real part of quotient
                double ip_d = (b*c-a*d)/(c*c+d*d);     //record the imaginary part of quotient
                if (ip_d > 0) {
                    System.out.printf("Division of the two complex numbers is: %f+%fi", rp_d, ip_d);
                }else if (ip_d < 0) {
                    System.out.printf("Division of the two complex numbers is: %f%fi", rp_d, ip_d);
                }else{
                    System.out.printf("Division of the two complex numbers is: %f", rp_d);
                }
                System.out.println();
                break;
        }
    }
}
