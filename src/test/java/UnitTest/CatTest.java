package UnitTest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CatTest {

    @Test
    public void checkThatCatSaysMew() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка должна говорить 'Мяу'", "Мяу", cat.getSound());
    }

    @Test
    public void checkThatCatEatsMammalsBirdsAndFish() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Должен быть список ['Животные', 'Птицы', 'Рыба']", actual, expected);
    }
}