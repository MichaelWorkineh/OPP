public class question1 {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        double universityTuition = 10000, increamentPercentage = 0.05, totalCost = 0;
        for(int i = 1; i<=10; i++){
            universityTuition += universityTuition*increamentPercentage;
            
            if(i<=4){
                totalCost += universityTuition;
            }
        }
        System.out.println("Cost in ten years: "+universityTuition);

        System.out.println("Total cost in 4 years: "+totalCost);

    }
}
