import java.util.Random;
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int prizeValue = r.nextInt(99)+1, numTrails = 1;
        boolean quit = false;

        do{
            System.out.println("Guess a number");
            int userGuess = input.nextInt();
            input.close();
            if(userGuess>prizeValue){
                System.out.println("High");
            }

            else if(userGuess<prizeValue){
                System.out.println("Low");
            }

            else if(userGuess == prizeValue){
                System.out.println("Correct! It took you "+numTrails+" attempts");
                break;
            }
            numTrails++;
            System.out.println("Do you want to quit? enter true to quit");
            quit = r.nextBoolean();
        }
        while(quit != true);

    }
}
