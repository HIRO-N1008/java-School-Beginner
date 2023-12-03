import java.util.Scanner;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumA, inputNumB, inputNumC;

        System.out.println("整数を入力してください。");
        System.out.println("整数1");
        inputNumA = sc.nextInt();

        System.out.println("整数2");
        inputNumB = sc.nextInt();

        System.out.println("整数3");
        inputNumC = sc.nextInt();

        sc.close();

        if (inputNumA <= inputNumB && inputNumB <= inputNumC) {

            System.out.println("OK");
            
        } else {

            System.out.println("NG");
        
        }

    }
}