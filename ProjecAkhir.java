import java.util.Scanner;  


public class ProjecAkhir {
    
      String[] akun;           // mendeclare variabel && arry
      double[] saldo;
      String[] passwords;
       int nomerakun;
       Scanner input=new Scanner(System.in);
        

    public ProjecAkhir(){
        akun=new String[10];           
        saldo=new double[10];
        passwords=new String[10];
        nomerakun=1;
       
        
    }

        
    
    /**
     * modul diatas untuk menyimpan nilai arry
     */

    public void  run() {  
        int option; //modul menjalankan perintah di main
        
        while(true){
            System.out.println("==================================");
            System.out.println("|  Welcome  To  Banking System   |");
            System.out.println("==================================");
            System.out.println("|1.| Create Account              |");
            System.out.println("|2.| Login                       |");
            System.out.println("|3.| viewaccount                 |");
            System.out.println("==================================");
            System.out.print  ("option:");
            option = input.nextInt();
           
        
            switch (option) {  //pemilihan hasil inputan menuju modul yang dipilih
                case 1:
                    Buatakun();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    Lihatakun();
                    break;

                default:
                    System.out.println("error. Please try again.");
            
            }
        }
    }
    /**
     * modul yang menerima perintah main 
     * dan pemilihan modul yang digunakan untuk menuju modul selanjutnya
     */
       
    public void Buatakun() //modul buat akun 
    { 
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        
       if (nomerakun < akun.length  ) {
         
    
            System.out.print("Enter username: ");
            String userakun= input.next();

            String password;
        while(true){
            System.out.print("Enter password: ");
            
            password = input.next();
         if(password.length()==8){
            break;
         }else{
            System.out.println("your password minim digit");
         }
        }
            System.out.print("Enter your digit: ");
            double isisaldo= input.nextDouble();

    


           akun[nomerakun] = userakun;
            passwords[nomerakun] = password;
            saldo[nomerakun] = isisaldo;
            nomerakun++;

            
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account Maximum .");
        }
         
    }
    /**
     * membuat username dan pasword(harus 8 digit)
     * 
     */

    public  void login() { //modul login
        System.out.print("\033[H\033[2J");
        System.out.flush();  

        System.out.print("Enter username: ");
        String userakun= input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        for (int i = 1; i < nomerakun; i++) {
            if (akun[i].equals(userakun) && passwords[i].equals(password)) {
                System.out.println("Login successful!");
                fitur(i);
                return;
            }
        }

        System.out.println("error useraccount or password.");
    }
    /**
     * digunakan untuk modul login sesuai dengan akun yang telah dibuat
     */

    public void fitur(int saldoakun) {//modul memilih fitur dan menyimpan int untuk menyimpan saldo akun
        while (true) {
            System.out.println("select ficture:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. ceksaldo");
            System.out.println("4. Transfer");
            System.out.println("5. Logout");
            System.out.print("option: ");

            int option = input.nextInt();

            switch (option) {     // pembagia option untuk menuju modul fitur banking
                case 1:
                    mengisi(saldoakun);
                    break;
                case 2:
                    mengambil(saldoakun);
                    break;
                case 3:
                    checksaldo(saldoakun);
                    break;
                case 4:
                    transfer(saldoakun);
                    break;
                case 5:
                    System.out.println("Log out successfully!");
                    return;
                default:
                    System.out.println("error option. Please try again.");
            }
        }
    }

    private void mengisi(int saldoakun) {  //modul setor
        System.out.print("Enter digit your deposit: ");
        int sum = input.nextInt();

        saldo[saldoakun] += sum;
        System.out.println("Deposit successful!");
    }

    public void mengambil(int saldoakun) {   //modul tarik saldo
        System.out.print("Enter digit to withdraw: ");
        double sum = input.nextDouble();

        if (saldo[saldoakun] >= sum) {
            saldo[saldoakun] -= sum;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("your digit not enough.");
        }
    }

    public void checksaldo(int saldoakun) { //modul cek saldo
        System.out.print("your digit: "  );
        System.out.println(saldo[saldoakun]);
    }

    public void transfer(int saldoakun) {//modul transfer
        System.out.print("Enter recipient's account number: ");
        String tujuanakun = input.next();

        int indexspenerima = 0;
        for (int i = 0; i < nomerakun; i++) {
            if (akun[i].equals(tujuanakun)) {
                indexspenerima = i;
                break;
            }
        }

        if (indexspenerima == 0) {
            System.out.println("Recipient's account not found.");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double sum = input.nextDouble();

        if (saldo[saldoakun] >= sum) {
            saldo[saldoakun] -= sum;
            saldo[saldoakun] += sum;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    
        public void Lihatakun(){// modul melihat akun yang ada
            if (nomerakun == 0) {
                System.out.println("No accounts available.");
                return;
            }
            System.out.println("Available Accounts:");
            for (int i = 1; i < nomerakun; i++) {
                System.out.println("============================");
                System.out.println("  Account " + (i) + ":    ");
                System.out.println("-------------------------- |");
                System.out.println( " Username: " + akun[i] );
                System.out.println("-------------------------- ");
                System.out.println("  Password:"+passwords[i]);
                System.out.println("-------------------------- ");
                System.out.println("  Balance : " + saldo[i]);
                System.out.println("============================");
            }
               
               
        }
            /**
             * modul ini digunakan untuk melihat akun menampilkan akun yang ada pada program
             * jika tidak ada akun maka program akan memberi tahu 
             * @param args
             */
            
        

    public static void main(String[] args) {
        ProjecAkhir data=new ProjecAkhir();
        data.run();

       
        
        
    }
   
}