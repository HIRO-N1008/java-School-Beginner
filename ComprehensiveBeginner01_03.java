import java.util.Scanner;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {

        System.out.println("ax^2 + bx + c = 0 の 解を求める");

        Scanner sc = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("整数を入力してください。");
        System.out.println("aの値");
        a = sc.nextInt();

        System.out.println("bの値");
        b = sc.nextInt();

        System.out.println("cの値");
        c = sc.nextInt();

        sc.close();

        d = b * b - 4 * a * c;

        if (d > 0) {

            System.out.print("二つの実数解");
        }

        if (d == 0) {
            
            System.out.print("重解");
        }

        if (d < 0) {

            System.out.print("二つの虚数解");
        }

    }
}