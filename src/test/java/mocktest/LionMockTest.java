package mocktest;

import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Predator predator;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(predator, "Самец");
        lion.getKittens();
        Mockito.verify(predator, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(predator, "Самец");
        lion.getFood();
        lion.getFood();
        Mockito.verify(predator, Mockito.times(2)).eatMeat();
    }
}
