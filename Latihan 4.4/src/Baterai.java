public class Baterai {
    private float kuatArus;
    private float hambatan;

    public rumus(float kuatArus,float hambatan)
    {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
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



    }
}
