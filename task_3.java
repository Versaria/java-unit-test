import org.junit.Test
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
   private final int age;
   private final boolean result;
   public CheckIsAdultTest(int age, boolean result) {
       this.age = age;
       this.result = result;
   }

   @Parameterized.Parameters
   public static Object[][] getTextData() {
       return new Object[][] {
           {17, false},  // Меньше 18 - несовершеннолетний
           {18, true},   // Ровно 18 - совершеннолетний
           {20, true},   // Между 18 и 21 (зависит от страны)
           {21, true}    // Стандарт для стран с повышенным возрастом
       };
   }

   @Test
   public void checkIsAdultWhenAgeThenResult() {
       Program program = new Program();
       boolean isAdult = program.checkIsAdult(age);
       assertEquals("Для возраста " + age + " ожидается " + result,
                   result, isAdult);
   }
}
