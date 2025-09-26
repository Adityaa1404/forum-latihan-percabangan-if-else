import java.util.Scanner;
public class forum_latihan_ifelse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int jumlah_barang, harga_satuan, total_biaya, diskon, total_setelahdiskon, nominal_diskon;

        System.out.print("Masukkan jumlah barang: ");
        jumlah_barang = input.nextInt();
        System.out.print("Masukkan harga satuan barang: ");
        harga_satuan = input.nextInt();
        total_biaya = jumlah_barang * harga_satuan;
        System.out.println("Total biaya sebelum diskon: " + total_biaya);

        // Menghitung diskon
         
        if (total_biaya > 0 && total_biaya<= 100_000) {
        diskon = 0;
        } else if (total_biaya > 0 && total_biaya <= 200_000) {
        diskon = 5;
        } else if (total_biaya > 0 && total_biaya <= 300_000) {
        diskon = 10;
        } else if (total_biaya > 0 && total_biaya <= 400_000) {
        diskon = 15;
        } else if (total_biaya > 0 && total_biaya <= 500_000) {
        diskon = 20;
        } else if (total_biaya > 500_000) {
        diskon = 25;
        } else {
        diskon = 0;
        } // Tidak ada diskon untuk total biaya negatif atau nol
        nominal_diskon = (diskon * total_biaya) / 100;
        total_setelahdiskon = total_biaya - nominal_diskon;
        System.out.println("Diskon yang diberikan: " + diskon + "%");
        System.out.println("Nominal diskon: " + nominal_diskon);        
        System.out.println("total setelah diskon: " + total_setelahdiskon);

        // Input uang dan output kembalian
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        int uang_dibayar = input.nextInt();

        if (uang_dibayar < total_setelahdiskon) {
            System.out.println("Uang yang dibayarkan tidak cukup.");
            return; // Keluar dari program jika uang tidak cukup
        }
        else if (uang_dibayar == total_setelahdiskon) {
            System.out.println("Uang yang dibayarkan pas, tidak ada kembalian.");
            return; // Keluar dari program jika uang pas
        }
        else {
            int kembalian = uang_dibayar - total_setelahdiskon;
            System.out.println("Uang kembalian: " + kembalian);
        }  
    }
}
