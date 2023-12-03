import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play;
        int ansr = 0;

        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.println("begin と入力してください");
        play = sc.nextLine();

        if (play.equals("begin")) {

            for (int i = 1; i <= 30; i++) {

                int a = new Random().nextInt(9) + 1;
                int b = new Random().nextInt(9) + 1;
                int c = new Random().nextInt(9) + 1;

                slot(i, a, b, c);

                if (a == b && a == c) {
                    ansr = 1;
                    break;
                }

            } 
                
            if (ansr == 0) {

                System.out.println("残念でした。終わります。");
            
            }
        
        }

        sc.close();

    }

    private static void slot(int i, int a, int b, int c) {
        
        System.out.println(i + "回目:" + a + b + c);
        if (a == b && a == c) {
            System.out.println(i + "回目で大当たりです。おめでとうございます!");
        }  

    }

}
