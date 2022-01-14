package day05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(45, 6);

    @Test
    void testCreate() {
        assertEquals(45, lottery.getIntervalOfNumbers());
        assertEquals(6, lottery.getLimit());
    }

    @Test
    void testStartLottery() {
        List<Integer> result = lottery.startLottery();
        List<Integer> numbers = new ArrayList<>();
        assertEquals(6, result.size());
        for (int actual : result) {
            assertTrue(0 < actual && actual <= 45);
            assertFalse(numbers.contains(actual));
            numbers.add(actual);
        }
    }

    @Test
    void testInvalidLimit() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Lottery(45, 0));
        assertEquals("Limit is invalid.", iae.getMessage());
        assertThrows(IllegalArgumentException.class,
                () -> new Lottery(45, 46));
    }
}