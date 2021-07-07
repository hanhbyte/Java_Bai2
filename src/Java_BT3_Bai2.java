public class Java_BT3_Bai2 {
    public static void main(String[] args) {
        System.out.println("In ra 100 số nguyên tố : ");
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + "");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
