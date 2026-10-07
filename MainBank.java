public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== SISTEM INFORMASI AKUN BANK ===");

        // 1. Membuat 2 Objek Rekening
        RekeningBank rek1 = new RekeningBank("101", "Jhon", 100000);
        RekeningBank rek2 = new RekeningBank("102", "Dungdi", 50000);

        // Cetak saldo awal
        System.out.println("\n--- Saldo Awal ---");
        System.out.println("Saldo " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());

        // 2. Pengujian Gagal: Percobaan transfer melebihi saldo (Bukti Validasi Enkapsulasi)
        rek1.transfer(150000, rek2);

        // 3. Pengujian Berhasil: Transfer nominal yang sesuai saldo
        rek1.transfer(30000, rek2);

        // 4. Cetak Saldo Akhir
        System.out.println("\n--- Saldo Akhir ---");
        System.out.println("Saldo " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());

        // 5. Akses RekeningBank.totalRekening (Variabel Static)
        System.out.println("\n--- Info Sistem ---");
        System.out.println("Total Rekening Dibuat: " + RekeningBank.totalRekening);
    }
}