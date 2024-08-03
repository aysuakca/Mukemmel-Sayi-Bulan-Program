import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {

        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int n = input.nextInt();

        int i = 0;
        while (i < n) {
            i++;
            if (n % i != 0) {
                continue;
            }
            if (n == i) {
                continue;
            }
            total += i;
        }

            if (total == n) {
                System.out.println(n + " bir mukemmel sayidir.");
            } else {
                System.out.println(n + "bir mukemmel sayi degildir.");

            }
        }













