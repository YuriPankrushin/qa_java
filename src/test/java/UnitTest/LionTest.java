package UnitTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void checkThatWrongLionSexThrowsCorrectException() throws Exception {
        Feline feline = new Feline();

        try {
            Lion lion = new Lion(feline, "Non-binary");
        }
        catch (Exception e) {
            String actual = e.getMessage();
            String expected = "Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void checkThatLionEatsMammalsBirdsAndFish() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Должен быть список ['Животные', 'Птицы', 'Рыба']", actual, expected);
    }
}
