package TH4.Hau;

import static org.junit.jupiter.api.Assertions.*;

import TH4.NguyenTrung.Calculator3;
import org.junit.jupiter.api.Test;


class Calculator3Test {

    @Test
    void test_add_1() {
        Calculator3 c = new Calculator3(2,3);
        assertEquals(6,c.mul() );

    }
    @Test
    void test_add_2() {
        Calculator3 c = new Calculator3(2000000000,2);
        assertEquals(4000000000.0,c.mul() );

    }
    @Test
    void test_add_3() {
        Calculator3 c = new Calculator3(2000000000,-2);
        assertEquals(-4000000000.0,c.mul() );

    }
}
