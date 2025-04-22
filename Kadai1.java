public class Kadai1 {
    public static void main (String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            count++;
            if(count == 10) {
                count = 0;
                System.out.println();
            }
        }
    }
}