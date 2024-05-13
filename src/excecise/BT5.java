package excecise;

public class BT5 {
    public static void main(String[] args) {
        //In ra các số nguyên tố từ 1-100
        /*
        * Số nguyên tố
        *   - Có giá trị >=2
        *   - Có ước là 1 và chính nó
        * */
        //B1: Duyệt các số nguyên từ 2-100
        //B2: Kiểm tra số nguyên đó có là số nguyên tố hay không (kỹ thuật cờ)
        System.out.println("Các số nguyên tố trong khoảng 1-100 là:");
        for (int i = 2; i <=100 ; i++) {
            //i có phải là số nguyên tố hay không
            boolean isPrime = true;//true là số nguyên tố - false không phải số nguyên tố
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    //j là ước của i (j khác 1 và i) --> i không phải là số nguyên tố
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                //i là số nguyên tố
                System.out.printf("%d\t",i);
            }
        }
        System.out.printf("\n");
    }
}
