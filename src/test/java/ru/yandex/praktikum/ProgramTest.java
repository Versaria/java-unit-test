package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    @Test
    public void checkAdultFor19YearsOld() {
        Program program = new Program();
        assertTrue(program.checkIsAdult(19));
    }
}
