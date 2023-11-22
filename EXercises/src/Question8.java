//Question3
import java.util.Random;
public class Question8 {
    public static void main(String [] args){
        Random r = new Random();
        int min = 100;
        for(int i=0; i < 8; i++){
            int toPrint = r.nextInt(71)+10;
            System.out.print(toPrint+" ");
            if(min>toPrint){
                min=toPrint;
            }
        }
        System.out.println("min value is "+min);   
    }
}
