package unittest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    @Test
    public void checkThatFelineHasCorrectFamilyName(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }
}