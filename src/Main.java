import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your degree : ");
        Scanner scanner = new Scanner(System.in);
        double Degree, F, C, K;
        int MU;
        Degree = scanner.nextDouble();
        System.out.println("Enter the number  measuring unit of this degree :  (1) Celsius   (2) Fahrenheit   (3) Kelvin  ");
        MU = scanner.nextInt();
        if (MU == 1) {      //°F = (°C × 9/5) + 32     K = °C + 273.15
            F = (Degree * 1.8) + 32;
            K = Degree + 273.15;
            System.out.println("Your degree is : \n " + F + "Fahrenheit \n " + K + "Kelvin");

        }
        if (MU == 2) { //C = 5/9 * (F-32)        K = (F + 459.67) x 5/9
            C = (5.0 / 9) * (Degree - 32);
            K = (Degree + 459.67) * (5.0 / 9);
            System.out.println("Your degree is : \n" + C + " Celsius\n" + K + " Kelvin");
        }
        if (MU == 3) { // C = K - 273.15     F = 1.8*(K-273) + 32.
            C = Degree - 273.15;
            F = (1.8 * (Degree - 273)) + 32;
            System.out.println("Your degree is : \n" + C + " Celsius\n" + F + " Fahrenheit");

        }


    }
}