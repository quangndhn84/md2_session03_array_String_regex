package excecise;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        //Nhập 3 cạnh của tam giác --> Nếu 3 cạnh thì tính diện tích và chu vi
        Scanner scanner = new Scanner(System.in);
        float firstSide, secondSide, thirthSide;
        do {
            System.out.println("Nhập cạnh thứ nhất của tam giác: ");
            firstSide = Float.parseFloat(scanner.nextLine());
            System.out.println("Nhập cạnh thứ hai của tam giác:");
            secondSide = Float.parseFloat(scanner.nextLine());
            System.out.println("Nhập cạnh thứ ba của tam giác:");
            thirthSide = Float.parseFloat(scanner.nextLine());
            //Kiểm tra 3 cạnh có phải là 3 cạnh của tam giác
            if ((firstSide+secondSide>thirthSide) && (firstSide+thirthSide>secondSide) && (secondSide+thirthSide>firstSide)){
                break;
            }else {
                System.err.println("Đây không phải là 3 cạnh của tam giác, vui lòng nhập lại");
            }
        }while (true);
        //Tính chu vi và diện tích của tam giác
        float perimeter = firstSide + secondSide + thirthSide;
        float area = (float)Math.sqrt((perimeter/2)*(perimeter/2-firstSide)*(perimeter/2-secondSide)*(perimeter/2-thirthSide));
        System.out.printf("Chu vi tam giác: %f - Diện tích tam giác: %f\n",perimeter,area);
    }
}
