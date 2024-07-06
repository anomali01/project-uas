import java.util.Scanner;

public class cobaan2 {
    
    public static void main(String[] args) {
    Scanner data = new Scanner(System.in);


        System.out.print("m :");
        int i1 = data.nextInt(); 

        System.out.print("n :");
        int i2 = data.nextInt(); 

        int [][] array = new int[i1][i2];

        System.out.print("enter your elemen :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = data.nextInt();
            }
        }
        int ditemukan = 0;
        int cari = data.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(cari == array[i][j]){
                    ditemukan++

                }

            }
        }
          
        
    }
}
