public class Calculator
{public static void main (String [] args ) {
    long first;
    long second;
    long next;
    long result;
    Console console = new Console();
    System.out.println("здравствуйте,это сумматор для сложения введите первое число, а потом второе. удачи в счете!");

    first = console.askNumber();
    second = console.askNumber();
    result = first + second;
    System.out.println(first + " + " + second + " ... I suggest.. = " + (result));

    while (console.askContinue() == true){
            System.out.println("введите число для суммирования");
            next = console.askNumber();
            result = result + next;
        System.out.println("результат: " + result);
    }
    System.out.println("итоговый результат: " + result);
}
}
