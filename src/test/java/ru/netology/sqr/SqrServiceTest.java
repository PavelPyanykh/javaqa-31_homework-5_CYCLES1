package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {

    @Test
    void shouldSqrCountInsideRange() {
        SqrService service = new SqrService();
        int bottom = 200;
        int top = 300;
        int expected = 3;

        int actual = service.sqrCount(bottom, top);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCountOutsideRange() {
        SqrService service = new SqrService();
        int bottom = 0;
        int top = 100;
        int expected = 1;

        int actual = service.sqrCount(bottom, top);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCountBorderLineRangeUnder() {
        SqrService service = new SqrService();
        int bottom = 199;
        int top = 299;
        int expected = 3;

        int actual = service.sqrCount(bottom, top);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrCountBorderLineRangeOver() {
        SqrService service = new SqrService();
        int bottom = 201;
        int top = 301;
        int expected = 3;

        int actual = service.sqrCount(bottom, top);

        assertEquals(expected, actual);
    }
}
