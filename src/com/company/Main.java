package com.company;

import java.util.Scanner;

public class Main {
        static void kiemTra() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số để kiểm tra");
            int number = scanner.nextInt();
            if (number < 2) {
                System.out.println(number + " Không phải số nguyên tố");
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0){
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(number+ " Là số nguyên tố");
                else
                    System.out.println(number+ " Không phải số nguyên tố");
            }
            kiemTra();
        }
    public static void main(String[] args) {
            kiemTra();
        }
    }