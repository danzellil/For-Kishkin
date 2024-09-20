package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker {

    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
