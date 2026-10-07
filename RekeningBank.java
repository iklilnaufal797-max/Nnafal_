public class RekeningBank {
    
    private String noRekening;
    private String namaPemilik;
    private double saldo;
    
    public static int totalRekening = 0;

    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

     
        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("ERROR: Saldo awal minimal Rp 50.000 untuk rekening " + noRekening);
            this.saldo = 0;
        }

        
        totalRekening++;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

   
    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("ERROR: Saldo tidak boleh negatif!");
        }
    }


    public void transfer(double nominal, RekeningBank tujuan) {
        System.out.println("\n--- Proses Transfer ---");
        System.out.println("Pengirim: " + this.namaPemilik + " -> Penerima: " + tujuan.getNamaPemilik());
        System.out.println("Nominal Transfer: Rp " + nominal);

    
        if (nominal > this.saldo) {
            System.out.println("Gagal Transfer: Saldo " + this.namaPemilik + " tidak mencukupi!");
        } else if (nominal <= 0) {
            System.out.println("Gagal Transfer: Nominal transfer harus lebih dari 0!");
        } else {
            this.saldo -= nominal;             
            tujuan.saldo += nominal;           
            System.out.println("Transfer Berhasil!");
        }
    }
}