package Bab4;
import java.util.*;
public class MainAddressBook {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    AddressBook[] book = new AddressBook[0];
    String loop = "y";
    int x = 0, i = 0;
        do {
            cetakMenu();
            switch (scan.next()) {
                case "1":
                  book = Arrays.copyOf(book, book.length + 1);
                  AddressBook.inputData(book, x);
                  x++;
                  break;
                case "2":
                  AddressBook.cetakBuku(book);
                  edit();
                  i = scan.nextInt();
                  if((i-1)<book.length){
                    AddressBook.editData(book, i);}
                  else dataNull();
                  break;
                case "3":
                  AddressBook.cetakBuku(book);
                  hapus();
                  i = scan.nextInt();
                  yakinHapus();
                  if (scan.next().equals("y")&&(i-1)<book.length)  
                  {
                    AddressBook.deleteData(book, i);
                  }
                  else dataNull();
                  break;
                case "4":
                  AddressBook.cetakBuku(book);
                  break;
                case "0":
                  loop = "n";
                  break;
            }
        } while (loop.equals("y"));
    }
  
    public static void cetakMenu() {
        System.out.println("MENU UTAMA");
        System.out.println("1. Menambah Data");
        System.out.println("2. Mengubah Data");
        System.out.println("3. Menghapus Data");
        System.out.println("4. Melihat Data");
        System.out.println("0. Keluar");
        System.out.print("Pilih : ");
    }
  
    public static void hapus() {
        System.out.print("Hapus nomor ke? ");
    }
  
    public static void edit() {
        System.out.print("Edit nomor ke? ");
    }
  
    public static void yakinHapus() {
        System.out.print("Yakin data dihapus(y/n)?");
    } 
    public static void dataNull(){
        System.out.println("Data tidak ada\n");
    }
}
