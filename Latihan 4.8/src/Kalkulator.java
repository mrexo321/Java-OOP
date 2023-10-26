
import java.util.Scanner;
public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return this.value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    public double getValue2() {
        return this.value2;
    }
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public void setNameProject() {
        System.out.print("Kalkulator");
    }
    public void setNoteProject(String note){
        System.out.print("Project untuk menghitung");
    }
    public double add(double val1, double val2){
        this.value1 = val1;
        this.value2 = val2;
        return val1 + val2;
    }
    public double minus(double val1, double val2) {
        this.value1 = val1;
        this.value2 = val2;
        return val1 - val2;
    }
    public double multipication(double val1, double val2) {
        this.value1 = val1;
        this.value2 = val2;
        return val1 * val2;
    }
    public double division(double val1, double val2) {
        this.value1 = val1;
        this.value2 = val2;
        return val1 / val2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator perhitungan = new Kalkulator();


        System.out.print("Value 1 =");
        perhitungan.setValue1(input.nextInt());
        System.out.print("Value 2=");
        perhitungan.setValue2(input.nextInt());

        double val1 = perhitungan.getValue1();
        double val2 = perhitungan.getValue2();

        System.out.println("/n"+
                "Project Perhitungan");

        System.out.println("This Project showyou how to menage method in jaba");

        System.out.println("add is :"+ perhitungan.add(val1,val2));
        System.out.println("Minus is"+ perhitungan.minus(val1,val2));
        System.out.println("multiple is"+ perhitungan.multipication(val1,val2));
        System.out.println("division is"+ perhitungan.division(val1,val2));

    }
}
