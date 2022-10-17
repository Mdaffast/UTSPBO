import java.util.Scanner;
class isi {
    Scanner input = new Scanner(System.in);
    double berat, tinggi;
    double BMI;

    isi() {
        System.out.print("Masukan berat : ");
        this.berat = input.nextDouble();
        System.out.print("Masukan tinggi : ");
        this.tinggi = input.nextDouble();
    }

    void hasil() {
        System.out.println("Berat badan = " + this.berat + " kg");
        tinggi=tinggi/100;
        System.out.println("Tinggi badan = " + this.tinggi + " m");
        BMI = (float)berat /(tinggi * tinggi);
        System.out.println("Body Mass Index : "+BMI);
    }

    public void berat(double a) {
        if ((a >= 18.5) && (a <= 22.9)) {
            System.out.println("Ideal");
        } else if (a > 22.9 ) {
            System.out.println("Over Weight");
        } else {
            System.out.println("Under Weight");
        }
    }
}

public class Nomor2{
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Masukan berat dan tinggi");
        isi gl = new isi();
        gl.hasil();
        gl.berat(gl.BMI);
        System.out.println("=========================================");
    }
}