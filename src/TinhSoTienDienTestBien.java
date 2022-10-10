import org.junit.Test;

import static org.junit.Assert.*;

public class TinhSoTienDienTestBien {


    // Tính tien dien bien muc 3
    //Bien min
    @Test
    public void soTienDienMin() {
        //sodien = 100
        int expectedResult = 170600;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(100);
        assertEquals(expectedResult, actualValue);
    }

    //Bien min + 1
    @Test
    public void soTienDienMin1() {
        //sodien = 101
        int expectedResult = 172614;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(101);
        assertEquals(expectedResult, actualValue);
    }

    // nom
    @Test
    public void soTienDiennom() {
        //sodien = 150
        int expectedResult = 271300;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(150);
        assertEquals(expectedResult, actualValue);
    }

    // Bien max - 1
    @Test
    public void soTienDienmax1() {
        //sodien = 199
        int expectedResult = 369986;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(199);
        assertEquals(expectedResult, actualValue);
    }

    @Test
    public void soTienDienmax() {
        //sodien = 200
        int expectedResult = 372000;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(200);
        assertEquals(expectedResult, actualValue);
    }
}