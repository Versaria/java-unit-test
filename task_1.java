@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
   Program program = new Program();
   boolean isAdult = program.checkIsAdult(19);
   // Проверяем, что для возраста 19 лет возвращается true
   assertEquals("Ожидается, что для возраста 19 лет метод вернет true",
true, isAdult);
}

