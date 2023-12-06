/*Pada praktikum 1 ini kita akan mendapatkan
 * Object
 * Attribut
 * Method*/

class Manusia {
    String warnaRambut, warnaKulit, nama; // <--- Atribut (berupa variabel)
    int Umur;

    int tampilUmur() { // <--- Method dalam bentuk fungsi (dengan nilai kembalian)
        return Umur;
    }

    void tampilCiri() { // <--- Method dalam bentuk prosedur (tanpa nilai kembalian)
        System.out.println("Nama : " + nama);
        System.out.println("Warna Kulit : " + warnaKulit);
        System.out.println("Warna Rambut : " + warnaRambut);
        System.out.println("Umur : " + tampilUmur());
    }

}

/*
 * Untuk menggunakan seluruh isi dari class, maka diperlukan object yang akan
 * memuat dan mempresentasikan keseluruhan nilai dari class.
 * Berikut merupakan penulisan dari deklarasi object :
 */

public class Basic {
    public static void main(String[] args) {
        Manusia mantanTerindah = new Manusia(); // Struktur : NamaClass NamaObject = new NamaObject();
        Manusia bismillahJodoh = new Manusia();

        // Inisialisasi value attribut yang ada dalam class Manusia
        mantanTerindah.nama = "Fakhri";
        mantanTerindah.warnaKulit = "Sawo Matang";
        mantanTerindah.warnaRambut = "Hitam";
        mantanTerindah.Umur = 22;

        bismillahJodoh.nama = "Member JKT48";
        bismillahJodoh.warnaKulit = "Putih";
        bismillahJodoh.warnaRambut = "Coklat";
        bismillahJodoh.Umur = 21;

        // Cara Memanggil Method :
        mantanTerindah.tampilCiri();
        bismillahJodoh.tampilCiri();
    }
}