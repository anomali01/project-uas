import java.util.Scanner;



public class bmi {
	
	public static void main (String[] args) {
		Scanner data = new Scanner (System.in);
		
		System.out.println("silakan masukkan berat badan anda (kg)");
		int berat = data.nextInt();
		
		System.out.println("silakan masukkan tinggi badan (cm)");
		double tinggi = data.nextInt();
		
		tinggi = tinggi/100;
		
		
		
		double hasil = berat/Math.pow(tinggi,2);
		
		System.out.printf("%.2f",hasil);
		
	}
}

