import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week5.Solution;

public class BoundaryTest {

    @Test
    @DisplayName("nom age  -  nom dist")
    void test1() {
        int age = 75;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("nom age  -  min dist")
    void test2() {
        int age = 75;
        int dist = 1;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("nom age  -  min+ dist")
    void test3() {
        int age = 75;
        int dist = 2;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("nom age  -  max- dist")
    void test4() {
        int age = 75;
        int dist = 19;
        int actual = Solution.calCharge(age, dist);
        int expected = 90;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("nom age  -  max dist")
    void test5() {
        int age = 75;
        int dist = 20;
        int actual = Solution.calCharge(age, dist);
        int expected = 90;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("min age  -  nom dist")
    void test6() {
        int age = 0;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("min+ age  -  nom dist")
    void test7() {
        int age = 1;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("max- age  -  nom dist")
    void test8() {
        int age = 149;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("max age  -  nom dist")
    void test9() {
        int age = 150;
        int dist = 10;
        int actual = Solution.calCharge(age, dist);
        int expected = 60;
        assertEquals(expected, actual);
    }
}
