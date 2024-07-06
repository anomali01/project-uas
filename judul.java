import java.util.Scanner;


public class judul {
	
	public static void main (String[] args) {
	Scanner data = new Scanner (System.in);
		
		int opsi = 1;
		
		while(opsi < 3 && opsi > 0){
			
			System.out.println("1) temukan dua digit angka <= 56 dengan jumlah digit > 10");
			System.out.println("2) temukan dua digit angka dikurangi angka terbalik yang sama dengan jumlah digitnya.");
			System.out.println("3) berhenti \n" );
			System.out.print(">");
			opsi = data.nextInt();
			System.out.println();
			
			if(opsi == 1){
				for(int a = 1 ; a <= 5;a++){
					for(int b = 1 ; b <= 9;b++){
						int n = (a*10)+b;
						if(n<57){
							if((a + b) > 10 && (a + b)<= 56){
								if(a<10 && b<10){
									System.out.println(n + ", " + a + " + " + b + "   = " + (a + b));
								}
							}
						}
					}
				}
			}else if(opsi == 2){
				for(int a = 1 ; a < 10 ;a++){
					for(int b = 1 ; b < 10 ;b++){
						int ab = (a*10)+b;
						int ba = (b*10)+a;
						if((ab - ba) == (a+b)){
							System.out.println(ab);
						}
						
					}
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
	}
}

