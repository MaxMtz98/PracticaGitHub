import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        while (j<=20) {
            System.out.println(j);
            j++;

        }
    }
}