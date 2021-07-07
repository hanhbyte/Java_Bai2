import java.util.Scanner;

public class Java_Th2_Bai2 {
    static void tinhTong() {
            Scanner input = new Scanner(System.in);
            double money = 1.0;
            int month = 1;
            double interestRate = 4.0;

            System.out.println("Nhập số tiền : ");
            money = input.nextDouble();

            System.out.println("Nhập số tháng gửi : ");
            month = input.nextInt();

            System.out.println("Nhập lãi suất : ");
            interestRate = input.nextDouble();

            double totallnterest = 0;
            for (int i = 0; i < month; i++) {
                totallnterest += money* (interestRate/100)/12 * month;
            }
            System.out.println("Hiển thị lãi suất : " +totallnterest);
            tinhTong();
        }
        public static void main(String[] args){
            tinhTong();
        }
    }
