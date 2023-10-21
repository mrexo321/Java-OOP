public class Baterai {
    private float kuatArus;
    private float hambatan;

    public float baterai(float kuatArus , float hambatan)
    {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;

        return kuatArus * hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public void setKuatArus(float kuatArus) {

        this.kuatArus = kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public void setHambatan(float hambatan) {
        this.hambatan = hambatan;
    }

    public float hitungTegangan()
    {
        return this.kuatArus * this.hambatan;
    }

    public static void main(String[] args) {
        Baterai hukum = new Baterai();
         hukum.setKuatArus(3);
         hukum.setHambatan(12);

         float getKuatArus = hukum.getKuatArus();
         float getHambatan = hukum.getHambatan();
         float getTegangan = hukum.hitungTegangan();

        System.out.println("Hasil kuat arus : " + getKuatArus + " ampere" );
        System.out.println("Hambatan : " + getHambatan + " ohm" );
        System.out.println("Hasil tegangan : " + getTegangan + " volt" );
    }
}
