package unittest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFeedPlanPositiveTest {

    private final String animalType;

    private final List<String> expectedOutput;

    public AnimalFeedPlanPositiveTest(String animalType, List<String> expectedOutput){
        this.animalType = animalType;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void checkAnimalFeedPlan() throws Exception {
        Animal animal = new Animal();
        List<String> actualOutput = animal.getFood(animalType);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
