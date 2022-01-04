package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> elevations) {
        double sumOfElevations = 0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            double difference = elevations.get(i + 1) - elevations.get(i);
            if (difference > 0) {
                sumOfElevations += difference;
            }
        }
        return sumOfElevations;
    }

//    public int getPlusElevation(List<Integer> elevations) {
//        int fullElevation = 0;
//        for (int i = 1; i < elevations.size(); i++) {
//            fullElevation += Math.max(elevations.get(i) - elevations.get(i - 1), 0);
//        }
//        return fullElevation;
//    }
}
