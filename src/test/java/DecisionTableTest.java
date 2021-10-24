import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.InputMismatchException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week5.Solution;

public class DecisionTableTest {

    @Test
    @DisplayName("rule 1")
    void test1() {
        int age = 75;
        int dist = 0;
        String expectedMsg = "Invalid value: distance must be positive";
        try {
            Solution.calCharge(age, dist);
            fail();
        } catch (Exception e) {
            assertEquals(InputMismatchException.class, e.getClass());
            assertEquals(expectedMsg, e.getMessage());
        }
    }

    @Test
    @DisplayName("rule 2")
    void test2() {
        int age = -1;
        int dist = 5;
        String expectedMsg = "Invalid value: age must not be negative";
        try {
            Solution.calCharge(age, dist);
            fail();
        } catch (Exception e) {
            assertEquals(InputMismatchException.class, e.getClass());
            assertEquals(expectedMsg, e.getMessage());
        }
    }

    @Test
    @DisplayName("rule 3")
    void test3() {
        int age = 160;
        int dist = 5;
        String expectedMsg = "Invalid value: re-check age";
        try {
            Solution.calCharge(age, dist);
            fail();
        } catch (Exception e) {
            assertEquals(InputMismatchException.class, e.getClass());
            assertEquals(expectedMsg, e.getMessage());
        }
    }

    @Test
    @DisplayName("rule 4")
    void test4() {
        int age = 2;
        int dist = 100;
        int actual = Solution.calCharge(age, dist);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 5")
    void test5() {
        int age = 3;
        int dist = 3;
        int actual = Solution.calCharge(age, dist);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 6")
    void test6() {
        int age = 24;
        int dist = 7;
        int actual = Solution.calCharge(age, dist);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 7")
    void test7() {
        int age = 80;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 8")
    void test8() {
        int age = 10;
        int dist = 15;
        int actual = Solution.calCharge(age, dist);
        int expected = 75;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 9")
    void test9() {
        int age = 50;
        int dist = 20;
        int actual = Solution.calCharge(age, dist);
        int expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("rule 10")
    void test10() {
        int age = 100;
        int dist = 30;
        int actual = Solution.calCharge(age, dist);
        int expected = 90;
        assertEquals(expected, actual);
    }
}
