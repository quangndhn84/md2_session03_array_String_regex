package session03;

import java.util.Scanner;

public class ArrayOneDimension_UD {
    public static void main(String[] args) {
        /*
         * Khai báo mảng 1 chiều số nguyên gồm 6 phần tử
         * In menu và thực hiện các chức năng theo menu
         * **************MENU******************
         * 1. Nhập giá trị các phần tử trong mảng
         * 2. In ra giá trị các phần tử của mảng
         * 3. Tính tổng các phần tử
         * 4. In ra các phần tử có giá trị chẵn
         * 5. In ra các phần tử có chỉ số lẻ
         * 6. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        //Khai báo mảng 1 chiều
        int[] numbers = new int[6];
        //In menu
        do {
            System.out.println("***********MENU************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. Hiển thị giá trị các phần tử");
            System.out.println("3. Tính tổng các phần tử");
            System.out.println("4. In giá trị các phần tử chẵn");
            System.out.println("5. In các phần tử có chỉ số lẻ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d]=", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là:");
//                    for (int i = 0; i < numbers.length; i++) {
//                        System.out.printf("%d\t", numbers[i]);
//                    }
                    for (int element : numbers) {
                        System.out.printf("%d\t",element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int sumNumber = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        sumNumber += numbers[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + sumNumber);
                    break;
                case 4:
                    System.out.println("Các phần tử chẵn trong mảng là:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] % 2 == 0) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số lẻ trong mảng là:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6");
            }
        } while (true);
    }
}
