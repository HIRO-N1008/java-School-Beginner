import java.util.Scanner;
import java.util.Random;

class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int you;

        do {

            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");
            you = sc.nextInt();
            
            if (you >= 0 && you <= 2) {

                int npc = new Random().nextInt(3);
                hantei(you, npc);

            } else if (you < 0 || you > 2) {

                System.out.println("エラー");
                System.out.println("やり直してください");

            }

        } while (you < 0 || you > 2);
        
        sc.close();

    }

    private static void hantei(int you, int npc) {

        if (you == 0) {

            System.out.print("あなたはグーです。");

            if (npc == 0) {

                System.out.println("相手はグーです。");
                System.out.println("あいこです。");

            } else if (npc == 1) {

                System.out.println("相手はチョキです。");
                System.out.println("あなたの勝ちです。");

            } else if (npc == 2) {

                System.out.println("相手はパーです。");
                System.out.println("あなたの負けです。");

            }

        } else if (you == 1) {

            System.out.print("あなたはチョキです。");

            if (npc == 0) {

                System.out.println("相手はグーです。");
                System.out.println("あなたの負けです");

            } else if (npc == 1) {

                System.out.println("相手はチョキです。");
                System.out.println("あいこです。");

            } else if (npc == 2) {

                System.out.println("相手はパーです。");
                System.out.println("あなたの勝ちです。");

            }

        } else if (you == 2) {

            System.out.print("あなたはパーです。");

            if (npc == 0) {

                System.out.println("相手はグーです。");
                System.out.println("あなたの勝ちです。");

            } else if (npc == 1) {

                System.out.println("相手はチョキです。");
                System.out.println("あなたの負けです");

            } else if (npc == 2) {

                System.out.println("相手はパーです。");
                System.out.println("あいこです。");

            }

        }

    }
}