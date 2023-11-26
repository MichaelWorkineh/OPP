import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a year:");
        int year = input.nextInt();

        if(year>1582){
            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println("is a leap year!");
            }

            else{
                System.out.println("is not a leap year!");
            }
            input.close();
        }
        else{
            System.out.println("wrong input!");
        }
    }    
}
