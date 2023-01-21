package mocktest;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AnimalMockTest {

    @Mock
    Animal animal;

    @Test
    public void callGetFoodMethodTest() throws Exception {
        animal.getFood("Травоядное");
        Mockito.verify(animal).getFood(Mockito.anyString());
    }

    @Test
    public void callGetFamilyMethodTest() {
        animal.getFamily();
        Mockito.verify(animal, Mockito.times(1)).getFamily();
    }
}