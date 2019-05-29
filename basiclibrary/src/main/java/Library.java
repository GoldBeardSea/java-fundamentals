/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.util.HashSet;
import java.util.Set;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] rollArray = new int[n];
        int i = 0;

        while (i < rollArray.length) {
            int dieRoll = (int) Math.ceil(6 * Math.random());
            rollArray[i] = dieRoll;
            i++;
        }
        return rollArray;
    }

    public static boolean containsDuplicates(int[] array) {
        Set<Integer> test = new HashSet<>();
        for (int i : array) {
            if (test.contains(i))
                return true;
            test.add(i);
        }
        return false;
    }

    public static int averageArray(int[] array) {
        int averageHolder = 0;
        for (int i = 0; i < array.length; i++) {
            averageHolder = averageHolder + array[i];
        }
        averageHolder = averageHolder / array.length;
        return averageHolder;
    }

    public static int averageOfArrays(int[][] weeklyMonthTemperatures) {
        int averageHolder = 0;
        int minVal = 1000;
        int index = 0;
        for (int row = 0; row < weeklyMonthTemperatures.length; row++) {
            averageHolder = 0;
            for (int col = 0; col < weeklyMonthTemperatures[row].length; col++) {
                averageHolder = averageHolder + weeklyMonthTemperatures[row][col];
            }
            averageHolder = averageHolder / weeklyMonthTemperatures[row].length;
            if(averageHolder < minVal) {
                minVal = averageHolder;
                index = row;

            }

        }
        return index;
    }
}
