public class JavaPracticeOne {

    public static void main(String[] args) {
        // Операторы математические + - * / %
        int numberOne = 5;
        int numberTwo = 10;
        int numberThree = 1000000000;
        double numberFour = 10.5;

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);

        // Операторы условные > < >= <= == != !
        if(numberOne >= numberTwo){
            System.out.println("Первое число больше");
        } else if (numberOne <= numberTwo){
            System.out.println("Второе число больше");
        } else if (numberOne == numberTwo){
            System.out.println("Числа равны");
        }

        // Операторы логические && ||
        if(numberOne == numberTwo || numberOne > numberTwo){
            System.out.println("Первое число точно не меньше второго");
        } else if (numberOne != numberTwo && numberOne < numberTwo){
            System.out.println("А тут я не знаю :)");
        } else {
            System.out.println("Ошибка в условиях");
        }

        //добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль) - верное преположение:) ?
        System.out.println("На уравнение 200 * numberOne * numberThree, в ответ получаем отрицательное число:");
        System.out.println(200 * numberOne * numberThree);

        //попробовать вычисления комбинаций типов данных (int и double)
        System.out.println(numberOne * numberFour);//тут вроде норм или неверно что-то делаю?
        //System.out.println(numberOne * "я теперь строка"); так в питоне можно делать, насколько помню
    }
}
