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
    @Test
    public void stoneGameIITest3() {
        int[] piles = {8270,7145,575,5156,5126,2905,8793,7817,5532,5726,7071,7730,5200,5369,5763,7148,8287,9449,7567,4850,1385,2135,1737,9511,8065,7063,8023,7729,7084,8407};
        Assert.assertEquals(98008, new Solution().stoneGameII(piles));
    }
}
