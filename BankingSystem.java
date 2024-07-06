import java.util.Scanner;



public class BankingSystem {
    String[] account;           // mendeclare variabel && arry
    double[]digit;
    String[] passwords;
     int numaccount;
     Scanner input;

     public static void main(String[] args) {
        BankingSystem data = new BankingSystem(); //untuk membua objek baru yang dapat disimpan
        data.run();
    }

    public BankingSystem() {
        account = new String[10];    //menyimpan data  userarry suatu variabel
        digit = new double[10];    //menyimpan data saldo
        passwords = new String[10]; //menyimpan data pasword
        numaccount = 0;        //list jumlah akun
        input = new Scanner(System.in);   //mendeclare inputan
    }
    

    public void run() {   //modul menjalankan perintah di main
        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("option: ");

            int option = input.nextInt();

            switch (option) {  //pemilihan hasil inputan menuju modul yang dipilih
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
				default:
                    System.out.println("error. Please try again.");
            }
        }
    }

    public void createAccount() {   //membuat akun mengisi username,pasword dan digitawal akun
       if (numaccount < account.length) {
        
            System.out.print("Enter username: ");
            String useraccount= input.next();
            System.out.print("Enter password: ");
            String password = input.next();
            System.out.print("Enter your digit: ");
            double initialdigit = input.nextDouble();
            

           account[numaccount] = useraccount;
            passwords[numaccount] = password;
            digit[numaccount] = initialdigit;
            numaccount++;

            
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account Maximum .");
        }
    
    }

    public  void login() { //modul login
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Enter username: ");
        String useraccount = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        for (int i = 0; i < numaccount; i++) {
            if (account[i].equals(useraccount) && passwords[i].equals(password)) {
                System.out.println("Login successful!");
                selectfeatures(i);
                return;
            }
        }

        System.out.println("error useraccount or password.");
    }

    public void selectfeatures(int accountbalance) {//modul memilih fitur dan menyimpan int untuk menyimpan saldo akun
        while (true) {
            System.out.println("Session");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. ceksaldo");
            System.out.println("4. Transfer");
            System.out.println("5. Logout");
            System.out.print("option: ");

            int option = input.nextInt();

            switch (option) {     // pembagia option untuk menuju modul fitur banking
                case 1:
                    deposit(accountbalance);
                    break;
                case 2:
                    withdraw(accountbalance);
                    break;
                case 3:
                    checkdigit(accountbalance);
                    break;
                case 4:
                    transfer(accountbalance);
                    break;
                case 5:
                    System.out.println("Log out successfully!");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    return;
                default:
                    System.out.println("error option. Please try again.");
            }
        }
    }

    private void deposit(int accountbalance) {  //modul setor
        System.out.print("Enter digit your deposit: ");
        double sum = input.nextDouble();

        digit[accountbalance] += sum;
        System.out.println("Deposit successful!");
    }

    public void withdraw(int accountbalance) {   //modul tarik saldo
        System.out.print("Enter digit to withdraw: ");
        double sum = input.nextDouble();

        if (digit[accountbalance] >= sum) {
            digit[accountbalance] -= sum;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("your digit not enough.");
        }
    }

    public void checkdigit(int accountbalance) { //modul cek saldo
        System.out.println("your digit: " + digit[accountbalance]);
    }

    public void transfer(int accountbalance) {//modul transfer
        System.out.print("Enter recipient's account number: ");
        String recipientAccountNumber = input.next();

        int recipientIndex = -1;
        for (int i = 0; i < numaccount; i++) {
            if (account[i].equals(recipientAccountNumber)) {
                recipientIndex = i;
                break;
            }
        }

        if (recipientIndex == -1) {
            System.out.println("Recipient's account not found.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double sum = input.nextDouble();

        if (digit[accountbalance] >= sum) {
            digit[accountbalance] -= sum;
            digit[recipientIndex] += sum;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    
}
