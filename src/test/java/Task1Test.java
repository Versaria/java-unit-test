import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Ожидается true для возраста 19 лет", true, isAdult);
    }
}
