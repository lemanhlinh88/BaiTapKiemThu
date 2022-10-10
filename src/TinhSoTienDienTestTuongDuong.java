import static org.junit.Assert.*;

public class TinhSoTienDienTestTuongDuong {
    // Kiểm thử lớp tương đương
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    //Test muc 1
    @org.junit.Test
    public void soTienDienMuc1() {
        //sodien = 30
        int expectedResult = 50340;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(30);
        assertEquals(expectedResult, actualValue);
    }

    //Test muc 2
    @org.junit.Test
    public void soTienDienMuc2() {
        //sodien = 70
        int expectedResult = 118580;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(70);
        assertEquals(expectedResult, actualValue);
    }

    //Test muc 3
    @org.junit.Test
    public void soTienDienMuc3() {
        //sodien = 150
        int expectedResult = 271300;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(150);
        assertEquals(expectedResult, actualValue);
    }

    //Test muc 4
    @org.junit.Test
    public void soTienDienMuc4() {
        //sodien = 250
        int expectedResult = 498800;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(250);
        assertEquals(expectedResult, actualValue);
    }

    //Test muc 5
    @org.junit.Test
    public void soTienDienMuc5() {
        //sodien = 350
        int expectedResult = 767300;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(350);
        assertEquals(expectedResult, actualValue);
    }

    //Test muc 6
    @org.junit.Test
    public void soTienDienMuc6() {
        //sodien = 500
        int expectedResult = 1201700;
        TinhSoTienDien tstd = new TinhSoTienDien();
        int actualValue = tstd.soTienDien(500);
        assertEquals(expectedResult, actualValue);
    }
}