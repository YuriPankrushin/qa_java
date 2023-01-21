package mocktest;

import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PredatorMockTest {

    @Mock
    Predator predator;

    @Test
    public void callPredatorsGetFoodMethod() throws Exception {
        predator.getFood("Хищник");
        Mockito.verify(predator).getFood("Хищник");
    }
}
