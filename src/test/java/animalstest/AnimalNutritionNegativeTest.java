package animalstest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalNutritionNegativeTest {

    /** Exception test of animal type branching */
    @Test
    public void checkThatWrongAnimalTypeThrowsCorrectException() throws Exception {
        Animal animal = new Animal();
        Assert.assertThrows("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                Exception.class, () -> animal.getFood("Другое"));
    }
}
