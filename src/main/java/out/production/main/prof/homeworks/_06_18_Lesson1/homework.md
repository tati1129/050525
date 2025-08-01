## Домашнее задание

### Инкапсуляция

Инкапсуляция - это принцип ООП, который заключается в сокрытии внутреннего состояния объекта и защите его от прямого
доступа извне. Это достигается с помощью модификаторов доступа и методов доступа (геттеров и сеттеров).

#### Задача 1: Банковский счет

Создайте класс `BankAccount`, который инкапсулирует баланс счета. Баланс не должен быть доступен для прямого изменения
извне, а изменяться только с помощью методов `deposit` (для внесения средств) и `withdraw` (для снятия средств).

#### Задача 2: Управление учетными записями пользователей

Создайте класс `User`, который инкапсулирует данные пользователя: логин, пароль и email. Обеспечьте безопасное изменение
и доступ к этим полям через геттеры и сеттеры. Пароль должен изменяться только если старый пароль введен верно и новый
пароль соответствует определенным требованиям безопасности.

#### Задача 3: Конфигурация системы

Разработайте класс `SystemConfiguration`, который хранит конфигурационные параметры системы (например, уровень
логирования, путь к файлам логов). Доступ к изменению этих параметров должен быть строго контролируемым через методы,
предотвращающие установку некорректных значений.

### Наследование

Наследование позволяет создавать новый класс на основе уже существующего, перенимая его свойства и методы, что облегчает
повторное использование кода.

#### Задача 1: Транспортное средство

Создайте базовый класс `Vehicle` с общими свойствами и методами для транспортных средств. Затем создайте производные
классы `Car` и `Bicycle`, расширяющие класс `Vehicle`, добавляя специфические свойства и методы (например, количество
дверей для автомобиля).

#### Задача 2: Фигуры

Определите абстрактный класс `Shape` с методом для вычисления площади. Создайте классы `Circle`, `Rectangle` и
`Triangle`, наследующие `Shape` и реализующие метод вычисления площади в соответствии с формой каждой фигуры.

#### Задача 3: Сотрудники

Создайте класс `Employee`, содержащий общую информацию о сотрудниках компании. От него наследуйте классы `Manager` и
`Developer`. В классе `Manager` добавьте список подчиненных - массив сотрудников (экземпляры класса Employee), а в
классе `Developer` - список проектов, над которыми работает разработчик - массив String[].

### Абстракция

Абстракция - это принцип сокрытия сложности, представляя пользователям только необходимую информацию. В Java абстракция
реализуется с помощью абстрактных классов и интерфейсов.

Абстрактные классы в Java используются для создания классов, которые не могут быть инстанциированы сами по себе, и для
определения общего поведения, которое могут наследовать подклассы.

### Задача 1: Устройства ввода

Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect, а также может
содержать поля или неабстрактные методы, общие для всех устройств ввода.
От этого абстрактного класса наследуйте классы Keyboard и Mouse, реализуя абстрактные методы.

### Задача 2: Музыкальные инструменты

Определите абстрактный класс MusicalInstrument с абстрактным методом playNote, который должен имитировать звучание ноты.
От этого класса создайте производные классы Guitar, Piano, и Violin, реализующие метод playNote для имитации звука
соответствующего инструмента.

### Задача 3: Системы навигации

Создайте абстрактный класс NavigationSystem с абстрактными методами для старта навигации startNavigation и завершения
навигации stopNavigation.
Этот класс может также включать общие поля и методы, применимые ко всем системам навигации. Наследуйте от него классы
CarNavigationSystem и MarineNavigationSystem,
реализуя абстрактные методы для конкретных типов навигации.



