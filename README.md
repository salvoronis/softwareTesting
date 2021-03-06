# Лабораторная работа №1

1. Функция arccos(x)
2. Программный модуль для сортировки массива по алгоритму Шелла
3. Описание предметной области:
>Артур, нервничая, вошел следом и был ошеломлен, увидев развалившегося в кресле человека, положившего ноги на пульт управления и ковыряющего левой рукой в зубах правой головы. Правая голова, казалось, была всецело занята этим, но зато левая улыбалась широко и непринужденно. Количество вещей, видя которые, Артур не верил своим глазам, все росло. Его челюсть отвисла.
---
Отчет
# Задание 1
Для arccos(x) были выбраны точки x= 0, 0.1, -0.1, 0.5, -0.5, 1, -1, 1.1, -1.1
Тесты для точек 0, 0.1, -0.1, 0.5, -0.5 проходят
Для точек 1 и 0 тесты не проходят из-за большой погрешности
В точках 1.1 и -1.1 тестируется код на получение ошибки
#### Пример тестов
```kotlin
    @Test fun testFunction1() = assertAll(
        {assertEquals(1.5707963267949, _acos(0.0), 0.00001)},
        {assertEquals(1.47062891, _acos(0.1), 0.001)},
        {assertEquals(1.67096375, _acos(-0.1), 0.001)}
    )
```
# Задание 2
Для проверки работы алгоритма Шелла алгоритм был разбит на 2 части:
1. основная
2. шаг

Тестировались как результаты работы алгоритма, так и промежуточные шаги

#### Пример тестов
```kotlin
    val midTestArr: IntArray = intArrayOf(23, 12, 1, 8, 34, 54, 2, 3)

    @Test fun middleTest() = assertAll(
        {
            val expected: IntArray = intArrayOf(23, 12, 1, 3, 34, 54, 2, 8)
            stepShellSort(midTestArr, 4, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        },{
            val expected: IntArray = intArrayOf(1, 3, 2, 8, 23, 12, 34, 54)
            stepShellSort(midTestArr, 2, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        },{
            val expected: IntArray = intArrayOf(1, 2, 3, 8, 12, 23, 34, 54)
            stepShellSort(midTestArr, 1, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        }
    )
```

# Задание 3
Для тесторивания доменной модели пришлось перехватывать системный поток вывода и менять на свой, после чего проверять выводы работы функций. Так же были особые фунции, которые приходилось тестировать отдельно

#### Пример теста
```kotlin
    @Test fun roomEnterTests() {
        val room: Room = Room()
        val person: Person = Person("Артур", "Голова Артура", "левая рука Артура", "правая рука Артура", "левая нога Артура", "правая нога Артура")
        room.enter(person)
        assertTrue(room.persons.contains(person))
    }
```

---
I use arch btw
