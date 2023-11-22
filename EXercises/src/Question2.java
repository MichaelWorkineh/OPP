import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2  different numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        if(x == y){
            System.out.println("wrong input!");
        }

        else{
            int max = x;
            if(max<y){
                max=y;
                y=x;
            }
            for(int i = y; i<=max; i++){
                System.out.println(i);
            }
        }
    }
}
