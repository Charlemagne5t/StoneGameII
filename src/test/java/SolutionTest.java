import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void stoneGameIITest1() {
        int[] piles = {2, 7, 9, 4, 4};
        Assert.assertEquals(10, new Solution().stoneGameII(piles));
    }

    @Test
    public void stoneGameIITest2() {
        int[] piles = {1, 2, 3, 4, 5, 100};
        Assert.assertEquals(104, new Solution().stoneGameII(piles));
    }
}
