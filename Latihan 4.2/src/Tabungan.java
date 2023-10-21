import java.util.Scanner;
public class Tabungan {
    private int saldo;

    public void tabungan(int saldo)
    {
        this.saldo = saldo;

    }

    public void ambilUang(int jumlah)
    {

        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Sisa saldo: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
        }
    }

    public static void main(String[] args) {

        Tabungan rekening = new Tabungan();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Saldo Awal: ");
        int saldoTabungan = input.nextInt();
        rekening.tabungan(saldoTabungan);

        System.out.print("Jumlah uang yang diambil: ");
        int jumlahAmbil = input.nextInt();
        rekening.ambilUang(jumlahAmbil);
    }
}
