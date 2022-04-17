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
public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void checkEatMeatReturnsCorrectValue() throws Exception {
        Feline feline = new Feline();
        List <String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, feline.getFood("Хищник"));
    }
    @Test
    public void checkGetFamilyReturnsCorrectValue(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, feline.getFamily());
    }
    @Test
    public void checkGetKittensNoParametersReturnsCorrectValue(){
        Feline feline = new Feline();
        short expectedKittens = 1;
        Assert.assertEquals(expectedKittens, feline.getKittens());
    }
    @Test
    public void checkGetKittensWithParametersReturnsCorrectValue(){
        Feline feline = new Feline();
        short expectedKittens = 1;
        Assert.assertEquals(expectedKittens, feline.getKittens(1));
    }
}
