import org.example.SetIntersectionChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

class SetIntersectionCheckerTest {

    private final SetIntersectionChecker checker = new SetIntersectionChecker();

    @Test
    void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        assertFalse(checker.isIntersecting(set1, set2));
    }

    @Test
    void testNoIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        assertFalse(checker.isIntersecting(set1, set2));
    }

    @Test
    void testIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        assertTrue(checker.isIntersecting(set1, set2));
    }

    @Test
    void testOneSetEmpty() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        assertFalse(checker.isIntersecting(set1, set2));
    }

    public static void main(String[] args) {
        SetIntersectionCheckerTest test = new SetIntersectionCheckerTest();
        test.testEmptySets();
        test.testNoIntersection();
        test.testIntersection();
        test.testOneSetEmpty();
        System.out.println("All tests passed.");
    }
}