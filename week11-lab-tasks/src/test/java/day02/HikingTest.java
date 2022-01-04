package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation() {
        double result = new Hiking().getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0, 13.0));
        assertEquals(13.0, result);
    }

    @Test
    void testGetPlusElevationIncreasing() {
        double result = new Hiking().getPlusElevation(List.of(10.5, 14.0, 16.3, 20.1, 22.8));
        assertEquals(12.3, result);
    }

    @Test
    void testGetPlusElevationDecreasing() {
        double result = new Hiking().getPlusElevation(List.of(42.6, 30.0, 28.5, 24.9, 15.5, 14.2));
        assertEquals(0, result);
    }
}