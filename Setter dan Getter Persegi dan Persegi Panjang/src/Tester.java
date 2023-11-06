
public class Tester {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();

        persegi.setSisi(10);
        System.out.println("Persegi");
        System.out.println("Sisi " + persegi.getSisi());
        System.out.println("Keliling " + persegi.hitungKeliling());
        System.out.println("Luas " + persegi.hitungLuas() + "\n");

        persegiPanjang.setPanjang(10);
        persegiPanjang.setLebar(5);
        System.out.println("Persegi Panjang");
        System.out.println("Panjang " + persegiPanjang.getPanjang());
        System.out.println("Lebar " + persegiPanjang.getLebar());
        System.out.println("Keliling " + persegiPanjang.hitungKeliling());
        System.out.println("Luas " + persegiPanjang.luas());

    }
}
