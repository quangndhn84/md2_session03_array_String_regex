package excecise;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        //Tổng số chẵn trong khoảng cho trước (fromNumber<toNumber)
        //B1: Nhập số thứ nhất
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu:");
        int fromNumber = Integer.parseInt(scanner.nextLine());
        //B2: Nhập số thứ hai (hai <= nhất --> bắt nhập lại)
        System.out.println("Nhập vào số kết thúc:");
        int toNumber = 0;
        do {
            toNumber = Integer.parseInt(scanner.nextLine());
            if (toNumber > fromNumber) {
                break;
            } else {
                System.err.println("Số kết thúc phải lớn hơn số bắt đầu, vui lòng nhập lại");
            }
        } while (true);
        //B3: Duyệt từ số thứ nhất đến số thứ 2 và tính tổng các số chẵn
        int sumNumber = 0;
        for (int i = fromNumber; i <= toNumber; i++) {
            if (i % 2 == 0) {
                //sumNumber -= i --> sumNumber = sumNumber - i;
                //sumNumber = sumNumber + i;
                sumNumber += i;
            }
        }
        //B4: In tổng các số chẵn
        System.out.printf("Tổng các số chẵn từ %d đến %d là %d\n", fromNumber, toNumber, sumNumber);
    }
}
