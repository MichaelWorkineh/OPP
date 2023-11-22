//Quesrion1 
import java.util.Scanner;
import java.lang.Math;
public class Question3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z = x;
        int y = 0;
        int reverse = 0;
        for(; z>0; y++){
            z /= (10^y);
        }
        //System.out.println(y);
        y--;
        for(; y >= 0; y--){
            reverse += (x % (10))*(int)Math.pow(10, y);
            x /= 10;
        }
        System.out.println(reverse);
    }
}
