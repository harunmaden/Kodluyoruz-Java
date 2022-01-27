import java.util.Scanner;
public class Main {
    public static void main(String[]args) {

        System.out.print("Sayıyı giriniz :");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        double result = 0.0;
        for (double i = 1; i<=number; i++){
            result +=(1/i);
        }
        System.out.println(result);
    }
}
