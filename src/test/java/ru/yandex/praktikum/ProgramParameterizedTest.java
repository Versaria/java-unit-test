package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ProgramParameterizedTest {
    private int age;
    private boolean expected;
    private Program program = new Program();

    public ProgramParameterizedTest(int age, boolean expected) {
        this.age = age;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {17, false},
            {18, true},
            {21, true}
        });
    }

    @Test
    public void testAgeCases() {
        assertEquals(expected, program.checkIsAdult(age));
    }
}
