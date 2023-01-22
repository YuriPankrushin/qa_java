package unittest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFeedPlanTest {

    private final String animalType;

    private final List<String> expectedOutput;

    public AnimalFeedPlanTest(String animalType, List<String> expectedOutput){
        this.animalType = animalType;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
                {"Другое", List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")},
        };
    }

    @Test
    public void checkAnimalFeedPlan(){
        try {
            Animal animal = new Animal();
            List<String> actualOutput = animal.getFood(animalType);
            Assert.assertEquals(expectedOutput, actualOutput);
        }
        catch (Exception e){
            String actualOutput = e.getMessage();
            Assert.assertEquals(String.join("", expectedOutput), actualOutput);
        }
    }
}
