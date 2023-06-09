# Шаблоны программных платформ языка Java

## Практическая работа №1  
```java
Знакомство со встроенными функциональными интерфейсами Java. Возможности Java 8. 
Лямбда-выражения. Области действия, замыкания. Предикаты. Функции. Компараторы.  
3.2. Задание. Создать свои потокобезопасные имплементации интерфейсов в соответствии 
с вариантом индивидуального задания.  
8) List с использованием Semaphore, Map с использованием ключевого слова synchronized.
```

## Практическая работа №2  

```java
Работа со Stream API в Java 8.  
2.2. Задание. В ходе выполнения практической работы должно быть реализовано: 
1) класс Human (int age, String firstName, String lastName, LocalDate birthDate, int weight); 
2) приложение, которое создает список из объектов класса Human, а затем производит действия в 
соответствии с вариантом индивидуального задания (список после каждого этапа должен выводиться в консоль).
Все действия должны производиться только с использованием Stream API.  
8) Фильтрация по возрасту больше, чем 20, сортировка по последней букве имени, увеличение 
возраста каждого на 3, вычисление среднего возраста всех элементов.
```

## Практическая работа №3  
  
```java
Знакомство с конкурентным программированием в Java. Потокобезопасность, ключевое слово syncrhonized, 
мьютексы, семафоры, мониторы, барьеры.
```

## Практическая работа №4  
```java
Работа с ExecutorService, CompletableFuture.  
4.2. Задание. Реализовать собственную имплементацию ExecutorService с единственным параметром 
конструктора – количеством потоков
```

## Практическая работа №5  
```java
Познакомиться с паттернами проектирования, их определением и классификацией. Обзор паттернов GoF. 
Паттерн Синглтон.  
5.2. Задание. Реализовать паттерн Singleton как минимум 3-мя способами.
```

## Практическая работа №6  
```java
Знакомство с реализацией порождающих паттернов проектирования.  
6.2. Задание. Написать реализацию паттернов «Фабричный метод», «Абстрактная фабрика», «Строитель», «Прототип».
```

## Практическая работа №7  
```java
Реализация структурных паттернов проектирования.  
7.2. Задание. Написать реализацию паттерна в соответствии с вариантом индивидуального задания.    
8) Адаптер, Декоратор.
```

## Практическая работа №8  
```java
Реализация поведенческих паттернов проектирования.  
8.2. Задание. Написать реализацию паттерна в соответствии с вариантом индивидуального задания.  
8) Стратегия, Шаблонный метод.
```

## Практическая работа №9  
```java
Знакомство с системой сборки приложения. Gradle  
9.2. Задание. Создать приложение, которое выводит какое-то сообщение в консоль. Создать Gradle Task, 
который создает jar-файл приложения, переносит его в отдельную папку, в которой хранится Dockerfile для jar,
а затем создает Docker контейнер из данного jar-файла и запускает его.
```

## Практическая работа №10  
```java
Введение в Spring. Container. Bean. Внедрение зависимостей, основанных на конструкторах и сеттерах. 
Конфигурация бинов. Автоматическое обнаружение и связывание классов.  
10.2. Задание. Создать приложение, в котором создается ApplicationContext и из него берётся бин 
с названием, переданным в качестве аргумента к приложению, и вызывается метод интерфейса, 
который он имплементирует. Нужно создать по одному бину для каждого класса, определить им название. 
Проверить, что вызывается при вводе названия каждого из бинов. Классы и интерфейс 
определяются в соответствии с вариантом индивидуального задания.
```

## Практическая работа №11  
```java
Разобраться с использованием Spring boot  
11.2. Задание. Создать приложение с использованием Spring Boot Starter Initializr 
(https://start.spring.io/) с такими зависимостями:  
– Spring Web;  
– Lombok;  
– Validation;  
– Spring boot Actuator. Запустить приложение и удостовериться, что не появилось никаких ошибок.
Добавить все эндпоинты в Actuator, 
сделать HTTP-запрос на проверку состояния приложения. Собрать jar-файл приложения, запустить и 
проверить состояние при помощи REST-запроса
```

## Практическая работа №12  
```java
Работа с жизненным циклом компонентов. Аннотации PostConstruct, PreDestroy.  
12.2. Задание. Создать приложение, которое при запуске берет данные из одного файла, хеширует, 
а при остановке приложения удаляет исходный файл, оставляя только файл с захешированными данными. 
Названия первого и второго файла передаются в качестве аргументов при запуске. 
При отсутствии первого файла создает второй файл и записывает в него строку null. 
Реализовать с использованием аннотаций PostConstruct, PreDestroy.
```

## Практическая работа №13  
```java
Конфигурирование приложения. Environment.  
13.2. Задание. Создать файл application.yml в папке resources, добавить в него такие свойства:  
 – student.name – имя студента;  
 – student.last_name – фамилия студента;  
– student.group – название группы студента. При запуске приложения выведите данные свойства 
в консоль при помощи интерфейса Environment или аннотации Value.
```

## Практическая работа №14  
```java
Знакомство со Spring MVC. Работа с Rest API в Spring.  
14.2. Задание. Создать отдельный репозиторий Git. Создать простой html-документ, который будет содержать 
вашу фамилию, имя, номер группы, номер варианта. Создать контроллер, который будет возвращать данный 
статический документ при переходе на url «/home». 
Выполнить задание в зависимости с вариантом индивидуального задания.
8) Создать класс Level с полями complexity, levelName. Создать класс Game с полями name, creationDate. 
Создать классы-контроллеры для создания, удаления объектов и получения всех объектов каждого типа. 
Сами объекты хранить в памяти. 
```

## Практическая работа №15-16  
```java
Использование Hibernate в Spring framework  
15.2. Задание. Изменить программу с предыдущего задания так, чтобы объекты хранились в базе данных PostgreSQL
вместо памяти компьютера.  
Изучение видов связей между сущностями в Hibernate. Использование транзакций.  
16.2. Задание. Создать связь Один-ко-многим между сущностями из предыдущего задания и 
проверить работу lazy loading.
```

## Практическая работа №17-21  
```java
Знакомство с Criteria API в Hibernate.  
17.2. Задание. Добавить возможность фильтрации по всем полям всех классов с использованием Criteria API
в Hibernate для программы из предыдущего задания. Добавить эндпоинты для каждой фильтрации.
```

## Практическая работа №22  
```java
Планирование заданий. Scheduler в Spring.  
22.2. Задание. Для приложения из предыдущего задания создать класс-сервис с методом, который будет 
вызываться каждые 30 минут и очищать определённую директорию, а затем создавать по файлу для каждой 
из сущностей и загружать туда все данные из базы данных. Также добавить возможность вызывать данный 
метод с использованием Java Management Extensions (JMX). 
```

## Практическая работа №23  
```java
Использование Spring Security для аутентификации и авторизации пользователей.  
23.2. Задание. В приложении из предыдущего задания добавить возможность регистрации и авторизации 
пользователей, хранение cookie сессий в базе данных PostgreSQL, хеширование паролей алгоритмом Bcrypt, 
защиту всех запросов, кроме запросов на авторизацию и регистрацию, от неавторизированных пользователей.
```

## Практическая работа №24  
```java
Тестирование в Spring Framework с использованием Junit.  
24.2. Задание. Написать модульное тестирование для всех классов 
сервисов приложения из предыдущего задания.
```
