import java.util.Scanner;

public class areacal {
	
	public static void main (String[] args) {
		Scanner data = new Scanner (System.in);
		
		System.out.println("Kalkulator Area Bentuk Versi 0.1 (c) 2024 abinaya sample");
		
		while(true){
			System.out.println("");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("");
			System.out.println("1). Segetiga");
			System.out.println("2). persegi panjang");
			System.out.println("3). persegi");
			System.out.println("4). Lingkaran");
			System.out.println("5). Berhenti");
			System.out.print("Bentuk yang mana:");
			int opsi = data.nextInt();
			System.out.println("");
			
			if(opsi == 1){
				area_triangle(5,6);
			}else if(opsi == 2){
				area_rectangle(0,0);
			}else if(opsi == 3){
				area_square(0);
			}else if(opsi == 4){
				area_circle(0);
			}else if(opsi == 5){
				System.out.println("Good bye");
				break;	
			}	
		}
	}
	
	public static double area_triangle(int dasar,int tinggi){
			Scanner data = new Scanner (System.in);
			System.out.print("dasar");
			dasar = data.nextInt();
			System.out.print("Tinggi");
			tinggi = data.nextInt();
			System.out.print("");
			int A = (dasar*tinggi)/2;
			System.out.print("Luasnya :" + A);
			return A;
			
		
	}
	
	public static int area_rectangle(int panjang,int lebar){
			Scanner data = new Scanner (System.in);
			System.out.print("Panjang");
			panjang = data.nextInt();
			System.out.print("lebar");
			lebar = data.nextInt();
			System.out.print("");
			int A = panjang*lebar;
			System.out.print("Luasnya :" + A);
			return A;
			
		
	}
	

	
	public static int area_square(int sisi){
			Scanner data = new Scanner (System.in);
			System.out.print("sisi");
			sisi = data.nextInt();
			System.out.print("");
			int A = sisi*sisi;
			System.out.print("Luasnya :" + A);
			return A;
			
		
	}
	
	

	
	public static double area_circle(int radius){
			Scanner data = new Scanner (System.in);
			System.out.print("jari-jari");
			radius = data.nextInt();
			double A = Math.PI*radius*radius;
			System.out.print("Luasnya :" + A);
			return A;
			
		
	}
}

