

public class TinhSoTienDien {
    public TinhSoTienDien() {

    }

    public int soTienDien(int sodien) {
        int tongsotien = 0;

        int tienmuc1 = sodien > 50 ? 50 * 1678 : sodien * 1678;
        tongsotien += tienmuc1 > 0 ? tienmuc1 : 0;
        int tienmuc2= sodien > 100 ? 50 * 1734 : (sodien - 50) * 1734;
        tongsotien += tienmuc2 > 0 ? tienmuc2 : 0;
        int tienmuc3 = sodien > 200 ? 100 * 2014 : (sodien - 100) * 2014;
        tongsotien += tienmuc3 > 0 ? tienmuc3 : 0;
        int tienmuc4 = sodien > 300 ? 100 * 2536 : (sodien - 200) * 2536;
        tongsotien += tienmuc4 > 0 ? tienmuc4 : 0;
        int tienmuc5 = sodien > 400 ? 100 * 2834 : (sodien - 300) * 2834;
        tongsotien += tienmuc5 > 0 ? tienmuc5 : 0;
        int tienmuc6 = sodien > 400 ? (sodien - 400) * 2927 : 0;
        tongsotien += tienmuc6 > 0 ? tienmuc6 : 0;
        return tongsotien;
    }
}
