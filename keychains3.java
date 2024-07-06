import java.util.Scanner;


public class keychains3 {
	
	public static void main (String[] args) {
		int i = 0;
		Scanner data = new Scanner(System.in);
		System.out.println("ye olde Keychain shoppe");
		System.out.println("");
		int price = 10;
		int opsi = 0;
		double tax = 0.0825;
		int ship = 5;
		int pership = 1;
		while(opsi != 4){
			System.out.println("1. add keychains toorder");
			System.out.println("2. Remove Keychains from order");
			System.out.println("3. View Current order");
			System.out.println("4. Checkouut");
			System.out.println("");
			System.out.print("please enter your choise: ");
			opsi = data.nextInt();
			
			if(opsi == 1){
				i=add(i);
				System.out.println("");
			}else if(opsi == 2){
				i=remove(i);
				System.out.println("");
			}else if(opsi == 3){
				view(i,tax,ship,pership,price);
				System.out.println("");
			}else if(opsi == 4){
				System.out.println("");
				System.out.println("checkuot");
				System.out.println("");
				System.out.println("what is your name? ");
				String name = data.nextLine();
				view(i,tax,ship,pership,price);
				System.out.println("thank you for you order");
				System.out.println("");
			}
		}
	}
	
	public static int add(int i){
		Scanner b = new Scanner(System.in);
		System.out.print("you have " + i + "keychoins,how many to add?");
		int add = b.nextInt();
		i=i+add;
		System.out.println("you now have " + i + "keychains");
		return i;
		
	}
	
	public static int remove(int i){
		Scanner b = new Scanner(System.in);
		System.out.print("you now have " + i + "keychoins,how many to remove?");
		int remove = b.nextInt();
		int remain = i-remove;
		System.out.println("you now have " + remain + "keychains");
		return remain;
	}
	
	public static void view(int i,double tax,int ship,int pership,double price){
		
		System.out.print("you now have " + i + "keychoin");
		System.out.print("keychains cost $10 each.");
		System.out.println("the shipping changes on the order " + ship);
		price = (i*10.00);
		System.out.println("the subtotal before tax " + price + " .");
		System.out.println("the tax on the order " + tax);
		double total=price+tax*price+pership+ship;
		System.out.println("the final cost of the order is" + total);
	}
	
	
	
}

