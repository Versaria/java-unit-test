import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
    private final int age;
    private final boolean result;
    private final Program program = new Program();

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
            {17, false},
            {18, true},
            {21, true}
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        assertEquals(result, program.checkIsAdult(age));
    }
    
    static class Program {
        public boolean checkIsAdult(int age) {
            return age >= 18;
        }
    }
}
