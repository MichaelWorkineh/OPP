public class IndividualActivity {
    public static void main(String [] args){
        int j = 0;
        for(int i =1; i<=100; i++){
            if((i%5 == 0 || i%6 == 0) && i% 30 !=0){
                System.out.print(i+" ");
                j++;
                if(j%10 == 0) {
                    System.out.println(" ");
                }
            }
        }
    }
}
