import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inputNum;

        System.out.println("数値の入力");
        inputNum = sc.nextInt();
        sc.close();

        if (inputNum % 2 == 0) {

            System.out.println("even");

        } else if (inputNum % 2 == 1) {

            System.out.println("odd");

        }

    }
}