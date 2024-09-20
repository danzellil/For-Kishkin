import org.example.NumberChecker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckerTest {

        private final NumberChecker checker = new NumberChecker();

        @Test
        void testFilterEvenNumbers() {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> expectedEvenNumbers = Arrays.asList(2, 4, 6, 8, 10);
            List<Integer> actualEvenNumbers = checker.filterEvenNumbers(numbers);
            assertEquals(expectedEvenNumbers, actualEvenNumbers);
        }

        @Test
        void testFilterEvenNumbersEmptyList() {
            List<Integer> numbers = new ArrayList<>();
            List<Integer> expectedEvenNumbers = new ArrayList<>();
            List<Integer> actualEvenNumbers = checker.filterEvenNumbers(numbers);
            assertEquals(expectedEvenNumbers, actualEvenNumbers);
        }

        @Test
        void testFilterOddNumbers() {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> expectedOddNumbers = Arrays.asList(1, 3, 5, 7, 9);
            List<Integer> actualOddNumbers = checker.filterOddNumbers(numbers);
            assertEquals(expectedOddNumbers, actualOddNumbers);
        }

        @Test
        void testFilterOddNumbersEmptyList() {
            List<Integer> numbers = new ArrayList<>();
            List<Integer> expectedOddNumbers = new ArrayList<>();
            List<Integer> actualOddNumbers = checker.filterOddNumbers(numbers);
            assertEquals(expectedOddNumbers, actualOddNumbers);
        }
    }

