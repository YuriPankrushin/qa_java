package animalstest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalsKindTest {

    @Test
    public void checkAnimalKindNames(){
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}