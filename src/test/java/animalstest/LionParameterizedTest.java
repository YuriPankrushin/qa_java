package animalstest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String lionSex;

    private final boolean doesHasMane;

    public LionParameterizedTest(String lionSex, boolean doesHasMane){
        this.lionSex = lionSex;
        this.doesHasMane = doesHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkThatDoesLionHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, lionSex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("У самца льва должна быть грива, а у самки нет", doesHasMane, actual);
    }
}
