import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menber, yen;

        System.out.println("人数は？");
        menber = sc.nextInt();
        yen = 600;
        sc.close();

        if (menber >= 5) {

            if (menber >= 5 && menber <= 19) {
                yen = 550;
            } else if (menber >= 20) {
                yen = 500;
            } 
            
        }

        System.out.println("人数は " + menber + " 人、合計金額は " + yen * menber + " 円です。");

    }
}