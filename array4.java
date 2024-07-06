import java.util.Random;
public class array4 {
	
	public static void main (String[] args) {
		Random data = new Random();
		int[] a = new int[1000] ;
		
		
		for(int i = 0; i < a.length;i++){
			int c = data.nextInt(99);
			if(c > 10){
				a[i] = c;
			System.out.print(a[i] + "  ");
			}
			
		}
		
	}
}
