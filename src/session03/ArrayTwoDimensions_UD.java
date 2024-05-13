package session03;

import java.util.Scanner;

public class ArrayTwoDimensions_UD {
    public static void main(String[] args) {
        /*
         * Nhập số dòng(row) và số cột(col) của mảng 2 chiểu
         * Khai báo mảng 2 chiều số nguyên gồm row dòng và col cột
         * In menu và thực hiện các chức năng theo menu sau:
         * *******************MENU*******************
         * 1. Nhập giá trị các phần tử của mảng
         * 2. Hiển thị các phần tử mảng theo ma trận
         * 3. Tính tổng các phần tử có giá trị chẵn trong mảng
         * 4. In ra các phần tử chia hết cho 3 và 5
         * 5. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[row][col];
        do {
            System.out.println("****************MENU*************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. Tính tổng các phần tử có giá trị chẵn");
            System.out.println("4. In các phần tử chia hết cho 3 và 5");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("numbers[%d][%d]=", i, j);
                            numbers[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng là:");
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("%5d", numbers[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int sumNumbers = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            if (numbers[i][j] % 2 == 0) {
                                sumNumbers += numbers[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử chẵn trong mảng là: " + sumNumbers);
                    break;
                case 4:
                    System.out.println("Các phần tử chia hết cho 3 và 5 trong mảng là:");
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            if (numbers[i][j] % 3 == 0 && numbers[i][j] % 5 == 0) {
                                System.out.printf("%d\t", numbers[i][j]);
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-5");
            }
        } while (true);
    }
}
