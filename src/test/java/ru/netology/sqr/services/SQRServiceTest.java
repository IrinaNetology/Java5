package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testMinimumSquare() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSquares(90, 110);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllSquares() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.countSquares(90, 99 * 99 + 10);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoSquares() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(10, 40);

        Assertions.assertEquals(expected, actual);

        actual = service.countSquares(99 * 99 + 10, 99 * 99 + 20);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOutOfRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(1, 5);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMiddleRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(200, 300);

        Assertions.assertEquals(expected, actual);
    }

}
