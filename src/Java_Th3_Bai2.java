import java.util.Scanner;

public class Java_Th3_Bai2 {
//    public class Main {
        public static void main(String[] args) {
            int a;
            int b;
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập a : ");
            a = input.nextInt();
            System.out.println("Nhập b : ");
            b = input.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0) {
                System.out.println("Kiểm tra");
            }
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("In ra kết quả " +a);
        }
    }
