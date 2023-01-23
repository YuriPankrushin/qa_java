package animalstest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    /** Exception test in Lion sex branching */
    @Test
    public void checkThatWrongLionSexThrowsCorrectException() throws Exception {
        Feline feline = new Feline();
        Assert.assertThrows("Используйте допустимые значения пола животного - самец или самка",
                Exception.class, () -> new Lion(feline, "Non-binary"));
    }

    /** Tests with mocks further */
    @Mock
    Feline feline;

    @Test
    public void checkThatGetKittensCallsMethodFromAnotherClass() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void checkThatGetFoodCallsMethodFromAnotherClass() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void checkThatLionEatsMammalsBirdsAndFish() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Список должен содержать 'Животные', 'Птицы', 'Рыба'", Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void checkThatLionHaveSingleKitten() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals("У льва один детеныш", 1, lion.getKittens());
    }
}