

class Juice {
    String menu = "ジュース";

    public void buyDrink(String menu1) {
        System.out.println(
            switch (menu1) {
                case "バヤリース" -> "オレンジ 味です。130 円になります。";
                case "午後の紅茶" -> "レモンティー 味です。150 円になります。";
                default -> "特定できませんでした";
            }
        );

    }
}

class Coffee {
    String menu = "コーヒー";

    public void buyDrink(String menu2) {
        System.out.println(
            switch (menu2) {
                case "ボス" -> "控えめ、 ミルク 無しです。 110 円になります。";
                case "ジョージア" -> "甘め、ミルク 入りです。 120 円になります。";
                default -> "特定できませんでした。";

            }
        );

    }

}

class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        
        Juice a001 = new Juice();
        a001.menu = "バヤリース";
        System.out.print(a001.menu + " の ");
        a001.buyDrink(a001.menu);

        Juice a002 = new Juice();
        a002.menu = "午後の紅茶";
        System.out.print(a002.menu + " の ");
        a002.buyDrink(a002.menu);

        Coffee a003 = new Coffee();
        a003.menu = "ボス";
        System.out.print(a003.menu + " の甘さは ");
        a003.buyDrink(a003.menu);

        Coffee a004 = new Coffee();
        a004.menu = "ジョージア";
        System.out.print(a004.menu + " の甘さは ");
        a004.buyDrink(a004.menu);

    }

}