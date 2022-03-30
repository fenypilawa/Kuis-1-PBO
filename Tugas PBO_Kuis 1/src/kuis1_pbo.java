import java.util.Scanner;

class PeminjamanBuku{
    String nama;
    String judulBuku;
    String waktuPengembalian;

    PeminjamanBuku(String nama, String judulBuku, String waktuPengembalian){
        this.nama = nama;
        this.judulBuku = judulBuku;
        this.waktuPengembalian = waktuPengembalian;
    }

    void tampil(){
        System.out.println("Nama Peminjam       : "+this.nama);
        System.out.println("Judul Buku          : "+this.judulBuku);
        System.out.println("Waktu Pengembalian  : "+this.waktuPengembalian);
    }
}


public class kuis1_pbo {
    public static void main(String[] args) {
        String nama;
        String judulBuku;
        String waktuPengembalian;
        int a,z=0,menu=0;
        PeminjamanBuku [] pinjam = new PeminjamanBuku[33];
        try (Scanner getstr = new Scanner(System.in)) {
            try (Scanner getint = new Scanner(System.in)) {
                while(menu!=3){
                    System.out.print("Menu...\n1.Input Data\n2.Output Data\n3.Keluar\nPilihan : ");
                    menu=getint.nextInt();
                    if(menu==1){
                        z++;
                        System.out.println("Masukkan Data Peminjam");
                        System.out.print("Nama Peminjam      : ");
                        nama=getstr.nextLine();
                        System.out.print("Judul Buku         : ");
                        judulBuku=getstr.nextLine();
                        System.out.print("Waktu Pengembalian : ");
                        waktuPengembalian=getstr.nextLine();
                        pinjam [z] = new PeminjamanBuku (nama,judulBuku,waktuPengembalian);
                    }
                    else if(menu==2){
                        if(z<1){
                            System.out.println("Data Masih Kosong...");
                        }
                        else{
                            a=0;
                            while(a<z){
                                a++;
                                System.out.println("---"+a+"---");
                                pinjam [a].tampil();
                            }
                        }
                    }
                    else if(menu==3){
                        System.out.println("Keluar...");
                    }
                    else{
                        System.out.println("Masukkan Menu Yang Tersedia...");
                    }
                }
            }
        }
    }
}
