public class Reduce {

    public static void main(String[] args) {

        int counter = 0;
        int n = 100;
        while (n != 0) {

            boolean divby2 = n % 2 == 0;

            if (divby2) {
                n = n/2;
            }

            else {
                n = n - 1;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
