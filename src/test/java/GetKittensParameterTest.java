import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GetKittensParameterTest {

    private final int countOfKittens;

    public GetKittensParameterTest(int countOfKittens){
        this.countOfKittens = countOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {5},
                {7},
                {34},
        };
    }

    @Test
    public void shouldCheckKittensCount(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertNotEquals("Количество не соответствует:", countOfKittens, actual);
    }
}
