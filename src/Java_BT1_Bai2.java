import java.util.Scanner;

public class Java_BT1_Bai2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\nMenu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. In hình tam giác vuông (Góc là hình vuông có 4 góc khác nhau: trên cùng bên trái, trên cùng bên phải, dưới cùng bên trái, dưới cùng bên phải)");
            System.out.println("3. In tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Nhập sự lựa chọn của bạn:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(" ");
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i < 7; i++) {
                        System.out.println(" ");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                            for (int k = 1; k < j; k++) {
                                System.out.print("*");
                            }
                        }
                    }
                    break;
            }
        }
    }
}