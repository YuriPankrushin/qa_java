package unittest;

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

    @Test
    public void checkThatCatSaysMew() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка должна говорить 'Мяу'", "Мяу", cat.getSound());
    }


    @Mock
    Feline feline;

    @Test
    public void checkThatCatEatsMammalsBirdsAndFish() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
    }
}