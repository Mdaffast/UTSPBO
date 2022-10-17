import java.util.Scanner;
public class Nomor4 {

     double r;
     final double phi = 3.14;

    public void setR(double jari) {
        this.r = jari;
    }

    public double getR() {
        return this.r;
    }

    public double luas() {
        return phi * (this.r * this.r);
    }
    public double keliling() {
        return 2 * phi * this.r;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomor4 hitung = new Nomor4();

        System.out.print("Masukkan nilai jari-jari: ");
        hitung.setR(sc.nextDouble());

        System.out.println("Luas dari lingkaran sama dengan " +hitung.luas()+ " cm");
        System.out.println("Keliling dari lingkaran sama dengan " +hitung.keliling()+ " cm");
    }
}