import java.util.Scanner;
public class Question4 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String x = input.nextLine().toLowerCase();
        int vowelNum = 0;
        for(int i = 0; i<x.length(); i++){
            if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'){
                vowelNum++;
            }
        }

        System.out.println(vowelNum);
    }
}
