import java.util.Date;

public class Main {
    public static void main(String[] args) {
    /*1
    Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
    На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
    Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    Не забудьте выполнить переход на новую строку между двумя циклами.
    В результате программы вывод должен получиться следующий:
    1 2 3 4 5 6 7 8 9 10
    10 9 8 7 6 5 4 3 2 1
    * */
        int i = 1;
        while (i<=10){
            System.out.print(i + " ");
           if (i == 10){
               System.out.println(" ");
               for (;i > 0;i--){
                   System.out.print(i + " ");
               }
               break;
           }
            i++;
        }

        /*2
        В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет,
        какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        * */

        System.out.println(" ");
        int firstFridayInMonth = 6;
        for (; firstFridayInMonth < 31; firstFridayInMonth += 7){
            System.out.println("Сегодня пятница," + firstFridayInMonth +"-е число. Необходимо подготовить отчет");
        }

        /*3
        Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
        * */

        int flightComet = 0;
        int year = 200;
        int date = 2022;
        int age = 79;
        for (;flightComet < date; flightComet += age){
            if (flightComet > date - year ) {
                System.out.println(flightComet);
            }
        }
        flightComet += age;
        System.out.println(flightComet);

    }
}