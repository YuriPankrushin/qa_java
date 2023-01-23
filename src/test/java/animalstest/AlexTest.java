package animalstest;

import com.example.Alex;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlexTest {

    @Test
    public void checkThatAlexLivesInNYZoo() throws Exception {
        Predator predator = new Feline();
        Alex alex = new Alex(predator);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = alex.getPlaceOfLiving();
        Assert.assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void checkAlexFriends() throws Exception {
        Predator predator = new Feline();
        Alex alex = new Alex(predator);
        List<String> actual = alex.getFriends();
        List<String> expected = Arrays.asList("Марти", "Глории", "Мелман");
        Assert.assertEquals("Должен быть список ['Марти', 'Глории', 'Мелман']", actual, expected);
    }

    @Test
    public void checkAlexHasNoKittens() throws Exception {
        Predator predator = new Feline();
        Alex alex = new Alex(predator);
        int actual = alex.getKittens();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
