import java.util.Arrays;
public class Kadai1 {
    public static void main (String[] args) {
       int num = Integer.parseInt(args[0]);
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i);
            count++;
            if(count == num) {
                count = 0;
                System.out.println();
            }else if(i == 1000){
                break;
            } else{
                System.out.print(" ");
            }
        }System.out.print("");
    }
}