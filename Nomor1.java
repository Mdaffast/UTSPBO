import java.util.Scanner;
public class Nomor1
{
    //Merubah Jam dan menit ke detik
    static double rubahjam(int jam) {return 3600 * (jam); }    static double rubahmenit(int menit) {return 60 * (menit); }
    static double rubahdetik(int detik) {return detik; }
    static double biayapulsa(int biaya, int detik, int jam, int menit) {
        //Untuk Menghitung total biaya telfon dengan rumus (jam+menit+detik/5) karena 5 detik = Rp.150
        return ((rubahjam(jam) + rubahmenit(menit) + rubahdetik(detik))/5)*biaya ; }
    public static void main(String[] args) {
        int biaya = 150;
        //untuk inputan dari user
        Scanner input = new Scanner(System.in);
        String jawab;
        do{
            System.out.println("==================================================================================");
            int jam;
            System.out.print("Input Jam = ");
            jam = input.nextInt();
            int menit;
            System.out.print("Input Menit = ");
            menit = input.nextInt();
            int detik;        System.out.print("Input Detik = ");
            detik = input.nextInt();
            System.out.println(jam + "Jam : " + menit + "Menit : " + detik + "Detik");
            System.out.println(" ");
            //Hasil akhir dari perhitungan biaya telfon
            System.out.println("Biaya menelpon selama " +jam + "Jam : " +menit +"Menit : "+detik + "Detik Adalah sebesar : Rp." + biayapulsa(biaya, detik, jam, menit));
            System.out.println("==================================================================================");
            System.out.print("Apakah anda ingin menghitung biaya telfon lain? "); jawab=input.next().toLowerCase();

        }while (jawab.equals("y"));

    }
}