public class Persediaan {

    public static int kurangiStok(int stok, int jumlah) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok awal tidak boleh bernilai negatif.");
        }
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah pengeluaran harus lebih besar dari nol.");
        }
        if (jumlah > stok) {
            throw new IllegalArgumentException("Jumlah pengeluaran melebihi stok yang tersedia.");
        }
        
        return stok - jumlah;
    }
}