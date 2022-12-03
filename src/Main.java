import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int [] array = arrayRandom (30);

        // Задание 1
        //
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Сумма трат за месяц составила … рублей».
        System.out.println( " Задача 1") ;

        int sum = 0;
        for( int i : array){
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей. ");

        // Задание 2
        // Следующая задача — найти минимальную и максимальную трату за день.
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        System.out.println( " Задача 2") ;

        Arrays.sort(array);
        System.out.println( " Минимальная сумма трат за день составила " + array[0] + " рублей. Максимальная сумма трат за день составила " + array [ array.length - 1] + " рублей .");




    }

    private static int[] arrayRandom(int length) {
        Random random = new Random();
        int [] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;

    }





}