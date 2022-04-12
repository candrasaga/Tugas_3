import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Baju object = new Baju();
        object.baju_tersedia();

        System.out.print("Baju yang akan anda beli bertipe : ");
        object.tipe_baju = sc.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        object.jumlah = sc.nextInt();

        object.display();

    }
}

  class Baju {
    String tipe_baju;
    int harga;
    int jumlah;

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void baju_tersedia() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
    }

    void harga_a() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = bajua;
        }
    }

    void harga_b() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = bajub;
        }
    }

    void harga_c() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = bajuc;
        }
    }
    

    void display() {
        if (tipe_baju.equalsIgnoreCase("a"))
            harga_a();
        else if (tipe_baju.equalsIgnoreCase("b"))
            harga_b();
        else if (tipe_baju.equalsIgnoreCase("c"))
            harga_c();
        
        
        
        System.out.println("Jenis yang anda beli : " + tipe_baju);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
        
        
    }
}