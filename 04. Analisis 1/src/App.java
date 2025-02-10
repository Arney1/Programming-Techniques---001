public class App {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2);

        System.out.println("Hasil 1 " + hasil);
    }
}

/*
 * Berapa output yang keluar:
 * 1 output saja
 * 
 * Output:
 * Hasil 1 -125
 * 
 * Alasan:
 * Byte adalah tipe data numerik yang menyimpan angka dari -128 sampai 127
 * angka1 adalah variabel bertipe byte dengan nilai 125
 * angka2 adalah variabel bertipe byte dengan nilai 6
 * angka1+angka2 menghasilkan nilai 131, tapi ini melebihi batas atas tipe data byte, sehingga terjadi overflow.
 * ketika nilainya melebihi 127, nilai kembali ke batas bawah, dan operasi tetap berlanjut.
 * Jadi seperti ini
 * 125 -> 126 -> 127 -> -128 -> -127 -> -126 -> -125
 * 
 * Referensi:
 * https://www.w3schools.com/java/java_data_types.asp
 */
