package excecise;

public class BT6 {
    public static void main(String[] args) {
        //In ra 20 số nguyên tố đầu tiên
        int cntPrime = 0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên:");
        while (cntPrime<20){
            //B1: kiểm tra number có phải số nguyên tố không
            boolean isPrime = true;
            for (int i = 2; i <=Math.sqrt(number) ; i++) {
                if (number%i==0){
                    isPrime = false;
                    break;
                }
            }
            //B2: Nếu number là số nguyên tố, tăng cntPrime lên 1 và in number
            if (isPrime){
                cntPrime++;
                System.out.printf("%d\t",number);
            }
            //B3: Tăng number lên 1
            number++;
        }
        System.out.printf("\n");
    }
}
