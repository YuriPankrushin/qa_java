package unittest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void checkThatLionHaveSingleKitten() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals("У льва один детеныш", expected, actual);
    }

    @Test
    public void checkThatMaleLionHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        Assert.assertEquals("У самца льва должна быть грива", expected, actual);
    }

    @Test
    public void checkThatFemaleLionHasNoMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        Assert.assertEquals("У самки льва не должно быть гривы", expected, actual);
    }

//    @Test
//    public void checkThatWrongLionSexThrowsCorrectException() throws Exception {
//        Feline feline = new Feline();
//        Lion lion = new Lion(feline, "non-binary");
//        Assert.assertThrows(Exception, lion.getFood());
//        try {
//            Lion lion = new Lion(feline, "Самец");
//        }
//        catch (Exception e) {
//            String actual = e.getMessage();
//            String expected = "Используйте допустимые значения пола животного - самец или самка";
//            Assert.assertEquals(expected, actual);
//        }
//    }

    @Mock
    Feline feline;
    @Test
    public void checkThatLionEatsMammalsBirdsAndFish() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
    }
}
