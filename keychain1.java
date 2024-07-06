import java.util.Scanner;

public class keychain1 {
	
	public static void main (String[] args) {
		Scanner data = new Scanner(System.in);
		
		while(true){
			System.out.println("ye olde Keychain shooppe");
			System.out.println("1. Add Keychains to order");
			System.out.println("2. Remove keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println("");
			System.out.print("please enter your choise ");
			int opsi = data.nextInt();
			System.out.println("");
			if(opsi == 1){
				add();
				System.out.println("");
			}else if(opsi == 2){
				remove();
				System.out.println("");
			}else if(opsi == 3){
				view();
				System.out.println("");
			}else if(opsi == 4){
				checkout();
				break;
			}else{
				System.out.println("your number not ready");
				System.out.println("");
			}
		}
		
	}
	
	public static String add(){
		System.out.println("ADD KEYCHAINS");
		return null;
	}
	
	public static String remove(){
		System.out.println("Remove KEYCHAINS");
		return null;
	}
	
	public static String view(){
		System.out.println("View order");
		return null;
	}
	
	public static String checkout(){
		System.out.println("chehckout");
		return null;
	}
	
}

