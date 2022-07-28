import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, basamak, total = 0;
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        while (number != 0){
            basamak = number % 10;
            number /= 10;
            total += basamak;
        }
        System.out.println("Sayının Basamakları Toplamı : " +total);
    }
}
