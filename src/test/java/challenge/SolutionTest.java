package challenge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void beforeEach() {
        solution = new Solution();
    }

    @Test
    void isIsomorphicTest() {
        String s = "foo", t = "bar";
        boolean result = solution.isIsomorphic(s, t);
        assertFalse(result);
    }

}