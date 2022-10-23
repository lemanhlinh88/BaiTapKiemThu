

public class TinhSoTienDien {
    public TinhSoTienDien() {

    }

    public int soTienDien(int sodien) {
        if(sodien < 50)
            return sodien * 1678;
        if(sodien < 100)
            return 50 * 1678 + (sodien - 50) * 1734;
        if(sodien < 200)
            return 50 * 1678 + 50 * 1734 + (sodien - 100) * 2014;
        if(sodien < 300)
            return 50 * 1678 + 50 * 1734 + 100 * 2014 + (sodien - 200) * 2536;
        if(sodien < 400)
            return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (sodien - 300) * 2834;
        if(sodien < 400)
            return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (sodien - 400) * 2927;

        return 0;
    }
}
