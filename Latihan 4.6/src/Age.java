import java.util.Scanner;

public class Age {
    private int yearBirth;
    private int yearNow;

    public int age(int yearNow){
        return this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return this.age(yearNow);
    }

    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }

    public int hitungUmur()
    {
        return this.yearNow - this.yearBirth;
    }

    public String tandanyaKamu(int umur){
        if(umur <= 5){
            return "Lagi lucu lucunya";
        }
        else if(umur <= 10 ){
            return "Masih Anak-Anak";
        }
        else if(umur <= 13 ){
            return "Masih Remadja";
        }
        else if(umur <= 19 ){
            return "Alay wuuu";
        }
        else if(umur <= 29 ){
            return "Sedang Galau Nyari Jodoh wkwkwk";
        }
        else if(umur <= 35 ){
            return "Sibuk nyari duid";
        }
        else if(umur <= 150 ){
            return "Sudah tua";
        }
        else if(umur >= 150){
            return "Fix lain orang inimah";
        }
        else{
            return "Inputan ada yg salah nih";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age person1 = new Age();

        System.out.print("Masukan tahun Lahir anda : ");
        person1.setYearBirth(input.nextInt());
        System.out.println("\n" +
                "====== Hasil Perhitungan Umur ======");

        System.out.print("Hari ini tahun? : ");
        person1.setYearNow(input.nextInt());

        System.out.println("Umur Kamu sampai hari ini adalah " + person1.hitungUmur() + " tahun");

        System.out.println("Tandanya Kamu " + person1.tandanyaKamu(person1.hitungUmur()));

    }
}
