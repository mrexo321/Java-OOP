import java.util.Scanner;
public class NilaiMahasiswa {


    private double quiz;
    private double uts;
    private double uas;

    private String index;
    private String keterangan;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }



    public double nilaiAkhir(double quiz , double uts , double uas )
    {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
        double hasil = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);

        return hasil;
    }

    public String getIndex(double nilai)
    {
        if(nilai <= 45){
            return "E";
        }else if(nilai <= 56){
            return "D";
        }else if(nilai <= 68){
            return "C";
        }else if(nilai <= 80){
            return "B";
        }else if(nilai <= 100){
            return "A";
        }else{
            return "Index tidak diketahui";
        }
    }

    public String getKeterangan(String index){
        if(index == "A"){
            return "Sangat Baik";
        }else if(index == "B"){
            return "Baik";
        }else if(index == "C"){
            return "Cukup";
        }else if(index == "D"){
            return "Kurang";
        }else if(index == "E"){
            return "Sangat Kurang";
        }else{
            return "Keterangan tidak diketahui";
        }
    }

    public static void main(String[] args) {
        NilaiMahasiswa siswa = new NilaiMahasiswa();

        siswa.setQuiz(30);
        siswa.setUts(80);
        siswa.setUas(40);

        double quiz = siswa.getQuiz();
        double uts = siswa.getUts();
        double uas = siswa.getUas();
        double nilaiAkhir = siswa.nilaiAkhir(quiz , uts , uas);

        String indexSiswa = siswa.getIndex(nilaiAkhir);
        String keteranganNilai = siswa.getKeterangan(indexSiswa);

        System.out.println("QUIZ :" + quiz);
        System.out.println("UTS :" + uts);
        System.out.println("UAS :" + uas);

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Index : " + indexSiswa);
        System.out.println("Keterangan : " +keteranganNilai);
    }
}