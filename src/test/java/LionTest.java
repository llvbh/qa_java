import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void checkGetFoodLionReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        var expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lion.getFood());
    }
    @Test
    public void checkGetKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
       int expectedKittens = 1;
       int actualKittens = lion.getKittens();
       Assert.assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void checkGetKittensReturnsNewValueWithMock() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int expectedKittens = 5;
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void checkDoesHaveManeReturnsCorrectValue() throws Exception{
        Lion lion = new Lion("Самец", new Feline());
        boolean expectedMane = true;
        Assert.assertEquals(expectedMane, lion.doesHaveMane());
    }



}
