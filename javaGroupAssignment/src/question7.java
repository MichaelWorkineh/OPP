public class question7 {
    public static void main(String[] args) throws Exception {
        int employeeHours [][] = {
            {2, 4, 3, 4, 5, 8, 8},
            {12, 4, 113, 224, 5, 18, 8},
            {22, 4, 13, 42, 15, 8, 118},
            {21, 42, 223, 14, 25, 8, 118},
            {2, 4, 2, 24, 15, 28, 8},
            {2, 2, 2, 1, 1, 8, 8},
            {2, 4, 3, 4, 5, 8, 8},
            {1, 1, 3, 4, 0, 8, 10}
        };

        int empTotalHours [] = new int[8];

        for(int i = 0; i<8; i++){
            for(int j = 0; j<7; j++){
                empTotalHours[i] += employeeHours[i][j];
            }
        }

        for(int i=0; i<8;i++){
            for(int l=i+1;l<8;l++){
                if(empTotalHours[i]>empTotalHours[l]){
                    int temp [] = employeeHours[i];
                    employeeHours[i]=employeeHours[l];
                    employeeHours[l]=temp;
                    
                    int temp1 = empTotalHours[i];
                    empTotalHours[i]=empTotalHours[l];
                    empTotalHours[l]=temp1;
                }
            }
        }

        for(int i=0; i<8; i++){
            for(int j=0; j<7; j++){
                System.out.print(employeeHours[i][j]+" ");
            }
            System.out.println(empTotalHours[i]);
        }
    
    }
}
