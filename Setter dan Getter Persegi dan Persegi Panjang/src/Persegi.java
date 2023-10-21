public class Persegi {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling()
    {
        return sisi*4;
    }

    public double hitungLuas()
    {
        return sisi*sisi;
    }
}
