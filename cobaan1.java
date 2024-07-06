import java.util.Scanner;

public class cobaan1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);


        System.out.print("m :");
        int i1 = data.nextInt(); 

        System.out.print("n :");
        int i2 = data.nextInt(); 

        int [][] array = new int[i1][i2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = data.nextInt();
                    
            }
            
        }
        

        //int[][] d = new int[3][];
        //d[0] = new int[4];
        //d[1] = new int[]{1,2};
        //d[2] =  new int[100];


        
    }
}
