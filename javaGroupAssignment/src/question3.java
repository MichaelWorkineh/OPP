import java.lang.Math;
public class question3 {
    public static void main(String[] args) {
        //generate array
        byte x [][]= new byte[4][4];
        //generate random value
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                double value = Math.random(); 
                if(value >0.5){
                    x[i][j] = (byte)Math.ceil(value);
                }
                else{
                    x[i][j] = (byte)Math.floor(value);
                }
            }
        }

        //print value
        System.out.println("The matrix: \n");

        for(int i = 0; i<4; i++){
            System.out.print("|");
            for(int j = 0; j<4; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.print("|");
            System.out.println("");
        }

        // find max row:
        byte counter [] = new byte[4], maxIndex = 0;

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(x[i][j]==1){
                    counter[i]++;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            if(counter[maxIndex]<counter[i]){
                maxIndex = (byte)i;
            }
        }

        System.out.println("\nmax row index is: "+maxIndex);

        maxIndex = 0;
        // find max colomn:

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(x[j][i]==1){
                    counter[i]++;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            if(counter[maxIndex]<counter[i]){
                maxIndex = (byte)i;
            }
        }

        System.out.println("max colomn index is: "+maxIndex);

    }
}
