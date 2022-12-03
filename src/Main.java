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