package mocktest;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineMockTest {

    @Mock
    Feline feline;

    @Test
    public void checkKittensAmount(){
        feline.getKittens(10);
        Mockito.verify(feline).getKittens(10);
    }
}
