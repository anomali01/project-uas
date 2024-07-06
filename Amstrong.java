public class Amstrong {
	
	public static void main (String[] args) {
		for(int a = 100 ;a <= 1000;a++){
			int i = a;
			int c = 0;
			while(i != 0){
				int b = i%10;
				c += Math.pow(b,3);
				i = i/10;
			}
			if(c == a){
			System.out.println(a + " adalah bilangan amstorng");
			}
		}
		
		
	}
}
