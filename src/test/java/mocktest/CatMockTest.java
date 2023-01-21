package mocktest;

import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Mock
    Cat cat;

    @Test
    public void callGetSoundOnce() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }

    @Test
    public void callGetFoodThreeTimes() throws Exception {
        cat.getFood();
        cat.getFood();
        cat.getFood();
        Mockito.verify(cat, Mockito.times(3)).getFood();
    }
}