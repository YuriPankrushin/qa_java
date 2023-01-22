package unittest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;

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

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void checkThatWrongLionSexThrowsCorrectException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Non-binary");
    }


    @Mock
    Feline feline;
    @Test
    public void checkThatLionEatsMammalsBirdsAndFish() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
    }
}
