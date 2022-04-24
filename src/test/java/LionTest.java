import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
    public void checkDoesHaveManeReturnsCorrectValue() throws Exception{
        Lion lion = new Lion("Самец", new Feline());
        boolean expectedMane = true;
        Assert.assertEquals(expectedMane, lion.doesHaveMane());
    }

    @Test
    public void checkDoesHaveManeReturnsCorrectValueForFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        boolean expectedMane = true;
        Assert.assertNotEquals(expectedMane, lion.doesHaveMane());
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void checkExceptionDoesHaveMane() throws Exception {
        exception.expect(Exception.class);
        exception.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Несамец", new Feline());
        lion.doesHaveMane();
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
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 5;
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void checkGetFoodLionReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List <String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}
