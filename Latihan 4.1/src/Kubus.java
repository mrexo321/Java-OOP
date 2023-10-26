public class Kubus {
    private int massa;
    private int sisi;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungVolume(int parSisi){
        if(parSisi != 0 ){
            parSisi = sisi*sisi*sisi;
            return parSisi;
        }
        return 0;
    }

    public int hitungMassaJenis(int parMassa , int volume){

        if(getMassa() != 0 && getSisi() != 0 ){
            volume = hitungVolume(getSisi());
            parMassa = getMassa() / volume;
            return parMassa;
        }
        return 0;

    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa() +
                "\n\n");

        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa jenis : " + kubus.hitungMassaJenis(kubus.hitungVolume(kubus.getSisi()), kubus.getMassa()));
    }
}
