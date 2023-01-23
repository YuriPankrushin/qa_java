package animalstest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void checkThatCatEatsMammalsBirdsAndFish() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Список должен содержать 'Животные', 'Птицы', 'Рыба'", Arrays.asList("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test
    public void checkThatCatSaysMew() {
        Cat cat = new Cat(feline);
        cat.getSound();
        Assert.assertEquals("Кошка должна говорить 'Мяу'", "Мяу", cat.getSound());
    }

    @Test
    public void callEatMeatFromGetFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}