package animalstest;

import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AnimalFeedPlanNegativeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkThatWrongAnimalTypeThrowsCorrectException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Animal animal = new Animal();
        animal.getFood("Другое");
    }
}
