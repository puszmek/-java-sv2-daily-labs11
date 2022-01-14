package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public int intervalOfNumbers;
    public int limit;
    Random random;

    public Lottery(int intervalOfNumbers, int limit) {
        if (intervalOfNumbers < limit || limit <= 0) {
            throw new IllegalArgumentException("Limit is invalid.");
        }
        this.intervalOfNumbers = intervalOfNumbers;
        this.limit = limit;
        random = new Random();
    }

    public int getIntervalOfNumbers() {
        return intervalOfNumbers;
    }

    public int getLimit() {
        return limit;
    }

    public List<Integer> startLottery() {
        List<Integer> listOfNumbers = new ArrayList<>();
        while (listOfNumbers.size() != intervalOfNumbers) {
            int number = random.nextInt(1, limit + 1);
            if (!listOfNumbers.contains(number)) {
                listOfNumbers.add(number);
            }
        }
        return listOfNumbers;
    }
}
