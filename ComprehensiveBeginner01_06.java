class ComprehensiveBeginner01_06 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 100) {

            // 空白を開けて見やすく
            if (i % 3 == 0 && i % 5 == 0) {
                
                System.out.println("foobar");

            } else if (i % 3 == 0) {

                System.out.println("foo");

            } else if (i % 5 == 0) {

                System.out.println("bar");

            } else {

                System.out.println(i);

            }

            i++;
        }
    }
}