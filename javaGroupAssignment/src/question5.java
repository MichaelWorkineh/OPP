import java.util.Random;
public class question5 {
    public static void main(String[] args) throws Exception {
        int theTopThree [] = new int[3];
        Random r =new Random();

        //generating random values
        for(int i=0; i<3; i++){
            theTopThree[i] = r.nextInt(29)+1;
        }

        //checking if the are identicall values
        for(int i =0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(i==j){
                    continue;
                }
                if(theTopThree[i]==theTopThree[j]){
                    theTopThree[i] = r.nextInt(29)+1;
                    j=0;
                }
            }
        }

        //displaying the winners
        for(int i=0; i<3; i++){
            System.out.println(theTopThree[i]);
        }
    }
}
