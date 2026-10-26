import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class PersediaanTest {

    @Test
    @DisplayName("Kasus Normal: Stok berkurang sesuai jumlah pengeluaran")
    void testPengeluaranNormal() {
        int sisaStok = Persediaan.kurangiStok(10, 3);
        assertEquals(7, sisaStok);
    }

    @Test
    @DisplayName("Nilai Batas: Stok dikurangi hingga tepat bernilai 0")
    void testPengeluaranMaksimalBatas() {
        int sisaStok = Persediaan.kurangiStok(10, 10);
        assertEquals(0, sisaStok);
    }

    @Test
    @DisplayName("Tidak Valid: Jumlah pengeluaran bernilai 0")
    void testJumlahNolDitolak() {
        assertThrows(IllegalArgumentException.class, () -> Persediaan.kurangiStok(10, 0));
    }

    @Test
    @DisplayName("Tidak Valid: Jumlah pengeluaran bernilai negatif")
    void testJumlahNegatifDitolak() {
        assertThrows(IllegalArgumentException.class, () -> Persediaan.kurangiStok(10, -1));
    }

    @Test
    @DisplayName("Tidak Valid: Jumlah pengeluaran melebihi stok yang ada")
    void testJumlahMelebihiStokDitolak() {
        assertThrows(IllegalArgumentException.class, () -> Persediaan.kurangiStok(10, 11));
    }

    @Test
    @DisplayName("Tidak Valid: Stok awal bernilai negatif")
    void testStokAwalNegatifDitolak() {
        assertThrows(IllegalArgumentException.class, () -> Persediaan.kurangiStok(-1, 1));
    }
}