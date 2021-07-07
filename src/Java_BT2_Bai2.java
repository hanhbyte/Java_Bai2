import java.util.Scanner;

public class Java_BT2_Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In ra dãy số :");
        int n = scan.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (numberPrime(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    public static boolean numberPrime(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int canbac2 = (int) Math.sqrt(n);
        for (int i = 2; i <= canbac2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
