# Java Unit Testing Project 🧪 Age Verification Project

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![Maven](https://img.shields.io/badge/Maven-3.6+-orange)
![JUnit](https://img.shields.io/badge/JUnit-4-red)

Проект для тестирования функционала проверки возраста с использованием JUnit 4

## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (опционально)

### Установка и запуск
```bash
git clone https://github.com/Versaria/java-unit-test.git
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
├── pom.xml                               # Конфигурация Maven
├── README.md                             # Документация
└── LICENSE                               # Лицензия MIT
```

## 🧪 Тестовые сценарии

### Базовые тесты
```java
@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Для 18 лет должен возвращаться true", true, isAdult);
}
```

### Параметризованные тесты
```java
@Parameterized.Parameters
public static Object[][] getTextData() {
    return new Object[][] {
        {17, false},  // Несовершеннолетний
        {18, true},   // Граничный случай
        {21, true}    // Для стран с повышенным возрастом
    };
}
```

## 📊 Покрытие тестами
- Стандартные граничные значения (17, 18, 19 лет)
- Поддержка разных возрастных ограничений (18+ и 21+)
- Параметризованное тестирование
- Четкие сообщения об ошибках

## 🛠 Технологический стек
- **Язык**: Java 11
- **Тестирование**: JUnit 4
- **Сборка**: Maven
- **CI/CD**: Готов к интеграции с GitHub Actions

## 📜 Лицензия
Этот проект распространяется под лицензией MIT. Полный текст см. в [LICENSE](LICENSE).
```text
MIT License

Copyright (c) 2023 Versaria

Разрешается свободное использование, копирование, модификация и 
распространение программного обеспечения при условии сохранения 
уведомления об авторских правах.
```

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/your-feature`)
3. Сделайте коммит (`git commit -am 'Add some feature'`)
4. Запушьте ветку (`git push origin feature/your-feature`)
5. Откройте Pull Request

---
<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск конкретного тестового класса
mvn test -Dtest=ProgramTest

# Сборка с отчетом о тестах
mvn clean test surefire-report:report
```
</details>

