public class MasKawin {

    private double harga;
    private double berat;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double hitungHargaEmas(double harga, double berat){
        this.berat = berat;
        this.harga = harga;

        return harga * berat;
    }

    public static void main(String[] args) {
        MasKawin hendi = new MasKawin();
        hendi.setBerat(15.7);
        hendi.setHarga(570000);
        System.out.println("Jadi Harganya Adalah : Rp."+hendi.hitungHargaEmas(hendi.getBerat() , hendi.getHarga()));
    }
}
