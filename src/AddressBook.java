package Bab4;
import java.util.Scanner;

    public class AddressBook {
        Scanner scan = new Scanner(System.in);
        private String Nama;
        private String Alamat;
        private String NomorTelepon;
        private String Email;
        public AddressBook() {
            this.Nama = "";
            this.Alamat = "";
            this.NomorTelepon = "";
            this.Email = "";
        }
    
    public AddressBook(String nama, String alamat, String nomorTelepon, String email) {
        this.Nama = nama;
        this.Alamat = alamat;
        this.NomorTelepon = nomorTelepon;
        this.Email = email;
        }
    public void setNama() {
        System.out.print("Nama\t: ");
        this.Nama = scan.nextLine();
    }
    
    public void setAlamat() {
        System.out.print("Alamat\t: ");
        this.Alamat = scan.nextLine();
    }
    
    public void setNomorTelepon() {
        System.out.print("Telepon\t: ");
        this.NomorTelepon = scan.nextLine();
    }
    
    public void setEmail() {
        System.out.print("Email\t: ");
        this.Email = scan.nextLine();
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public String getNomorTelepon() {
        return NomorTelepon;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public static void cetakBuku(AddressBook[] book) {
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("\nNO\tNAMA\t\t\tALAMAT LENGKAP\t\t\tNOMOR TELEPON\t\tEMAIL");
        System.out.println("_____________________________________________________________________________________________________");
        for (int x = 0; x < book.length; x++) {
          System.out.print((x+1)+"\t");
          if(book[x].getNama().equals(""))
            System.out.print("Dihapus\n");
          else{   
            System.out.print(book[x].getNama() + "\t");
            System.out.print(book[x].getAlamat() + "\t");
            System.out.print(book[x].getNomorTelepon() + "\t");
            System.out.print(book[x].getEmail() + "\n");}
        }
        System.out.println("");
    }

      
    public static void inputData(AddressBook[] book, int x){
        System.out.println("\nINPUT DATA BARU");
        book[x] = new AddressBook();
        book[x].setNama();
        book[x].setAlamat();
        book[x].setNomorTelepon();
        book[x].setEmail();
        System.out.println("");
    }
      
    public static void deleteData(AddressBook[] book, int y){
        System.out.println("\nDATA BERHASIL DIHAPUS");
        --y;
        book[y] = new AddressBook();
        System.out.println("");
        }
      
    public static void editData(AddressBook[] book, int y){
        System.out.println("\nEDIT DATA");
        --y;
        book[y] = new AddressBook();
        book[y].setNama();
        book[y].setAlamat();
        book[y].setNomorTelepon();
        book[y].setEmail();
        System.out.println("");
        }
    }
