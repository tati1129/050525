### Задача 1: **Класс "Телефон" с изменением режима работы**

#### Описание:

Создайте класс **Phone** с полями:

* **model** (модель телефона)
* **color** (цвет)
* **isSilent** (режим без звука: да/нет)

##### Задача:

Напишите метод, который:

1. Запрашивает у пользователя, включить или отключить режим "без звука".
2. Изменяет значение поля **isSilent** в зависимости от введенного ответа.
3. Выводит текущее состояние режима.

##### Реализуйте два варианта:

1. Внутри самого класса **Phone**.
2. С использованием сервисного класса **PhoneService**.

---

### Задача 2: **Класс "Освещение" с переключением состояния света**

#### Описание:

Создайте класс **Light** с полями:

* **location** (местоположение лампы)
* **brightness** (яркость)
* **isOn** (включена/выключена)

##### Задача:

Напишите несколько методов, которые могут:

1. Запросить у пользователя, включить или выключить свет.
2. Изменить значение поля **isOn** в зависимости от ответа.
3. Выводит текущий статус освещения.

1. Запросить у пользователя величину яркости (например по шкале от 0-100).
2. Изменить значение поля **brightness** в зависимости от ответа.
3. Выводит текущий статус освещения.

##### Реализуйте вариант с использованием сервисного класса **LightService**.
