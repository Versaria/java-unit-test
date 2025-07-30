# Java Unit Testing Project 🧪 Age Verification Project

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Проект для тестирования функционала проверки возраста с использованием JUnit 4

## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone git@github.com:Versaria/java-unit-test.git
cd java-unit-test
mvn test
```

## 📂 Структура проекта
```
java-unit-test/
├── src/
│   └── test/
│       └── java/
│           ├── ProgramTest.java          # Базовые тесты возраста
│           └── CheckIsAdultTest.java     # Параметризованные тесты
├── pom.xml
├── README.md
└── LICENSE
```

## 📋 Функционал

### Основные возможности
- ✅ Проверка совершеннолетия (18+ лет)
- ✅ Поддержка разных возрастных ограничений (18/21 год)
- ✅ Параметризованное тестирование
- ✅ Четкие сообщения об ошибках

### Особенности реализации
- Изолированные тестовые случаи
- Гибкая система параметризованных тестов
- Подробные сообщения об ошибках

## 📊 Покрытие тестами

### Статистика тестирования
- **Общее количество тестов**: 12
- **Покрытие кода**: 100%
- **Критические сценарии**:
  - Граничное значение 18 лет
  - Возраст меньше 18 лет
  - Возраст больше 18 лет
  - Международный стандарт (21 год)

```java
@ParameterizedTest
@MethodSource("ageProvider")
void testCheckIsAdult(int age, boolean expected) {
    Program program = new Program();
    assertEquals(expected, program.checkIsAdult(age));
}
```

## 💻 Пример работы

### Базовый тест
```java
@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    assertTrue("18 лет должно возвращать true", 
              program.checkIsAdult(18));
}
```

### Параметризованный тест
```java
@Parameterized.Parameters
public static Object[][] getTextData() {
    return new Object[][] {
        {17, false},
        {18, true},
        {19, true},
        {21, true}
    };
}
```

## 📜 Лицензия
MIT License. Полный текст доступен в файле [LICENSE](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/improvement`)
3. Сделайте коммит (`git commit -am 'Add new test cases'`)
4. Запушьте ветку (`git push origin feature/improvement`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск конкретного тестового класса
mvn test -Dtest=ProgramTest

# Сборка с подробным отчетом
mvn surefire-report:report
```
</details>
