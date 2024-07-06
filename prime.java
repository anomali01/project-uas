

public class prime {
	
	public static void main (String[] args) {
		int tries = 0;
		for(int n = 2 ;n <= 99; n++){
			
			if(isPrime(n)){
				System.out.println(n + " <=");
				tries++;
			}else{
				System.out.print(n);
			}
		}
		System.out.println("\nThere are " + tries + " prime numbers between 1 to 100");
		
	}
	
	public static boolean isPrime(int i){
		boolean prime = false;
		for(int n = 2; n<=i/2;n++){
			if(i%n == 0){
				return false;
			}
		}return true;
	}
	
}

