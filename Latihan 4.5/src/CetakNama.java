import java.util.Scanner;
public class CetakNama {
    private int jumlahCetak;
    private String nama;

    public int getJumlahCetak() {
        return jumlahCetak;
    }

    public void setJumlahCetak(int jumlahCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetakNama(String nama)
    {
        this.nama = nama;
    }

    public void cetak(int jumlahCetak,String nama){
        this.jumlahCetak = jumlahCetak;
        this.nama = nama;

        for(int i = 1; i <= jumlahCetak; i++){
            System.out.println(i + "." + nama);
        }
    }

    public static void main(String[] args) {

        CetakNama data = new CetakNama();
        String nama;
        int jumlahCetak;

        Scanner input = new Scanner(System.in);
        System.out.println("===== Applikasi pencetak nama =====");


        System.out.print("Masukan Nama Anda : ");
        data.setNama(input.next());
        nama = data.getNama();

        System.out.print("Mau cetak berapa kali? : ");
        data.setJumlahCetak(input.nextInt());
        jumlahCetak = data.getJumlahCetak();

        System.out.println("Nama anda : " + nama);
        System.out.println("Hasil Cetak : ");
        data.cetak(jumlahCetak,nama);
    }
}
