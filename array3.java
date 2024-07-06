import java.util.Random;
public class array3 {
	
	public static void main (String[] args) {
		Random data = new Random();
		int[] a = new int[10] ;
		int[] b = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < 10;i++){
			int c = data.nextInt(100);
			a[i] = c;
			System.out.println("slot " + b[i] + " terisi " + a[i]);
		}
		
	}
}
