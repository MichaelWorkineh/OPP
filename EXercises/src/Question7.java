//Question2
import java.util.Scanner;
public class Question7 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of input you want to insert");
        int n = input.nextInt();
        int [] array = new int [n];

        for(int i = 0; i<n; i++){
            array[i] = input.nextInt();
        }

        int max1 = array[0], max2 = 0,position = 0;
        for(int i=0; i<n; i++){
            if(max1<array[i]){
                max1 = array[i];
                position = i;
            }
        }

        for(int i=0; i<n; i++){
            if(i == position){
                continue;
            }
            if(max2<array[i]){
                max2 = array[i];
            }

        }

        System.out.println("max value: "+ max1+" next max: "+max2);
    }
}
