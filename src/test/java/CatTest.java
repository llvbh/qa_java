import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {
    @Test
    public void checkGetSoundReturnsCorrectValue() throws Exception {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, cat.getSound());
    }
    @Test
    public void checkGetFoodCatReturnsCorrectValue() throws Exception {
        Cat cat = new Cat(new Feline());
        List <String> expectedFoodCat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFoodCat, cat.getFood());
    }

}
