

public class numberpuzzle {
	
	public static void main (String[] args) {
		
		for(int a = 1 ; a <= 45 ;a++){
			for(int b = 1 ; b <= 45 ;b++){
				for(int c = 1 ; c <= 45 ;c++){
					for(int d = 1 ; d <= 45 ;d++){
						if(a+b+c+d == 45 ){
							if(a+2==b-2 && a+2==c*2 && a+2==d/2){
								System.out.println("A + B + C + D = " + (a+b+c+d) + " \n" + a + " + 2 = " + b + " - 2 = " + c + " x 2 = " + d + " / 2 ");
							}
						}
					}
				}
			}
		}
		
	}
}

