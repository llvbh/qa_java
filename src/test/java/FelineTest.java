import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

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
}
