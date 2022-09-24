package org.example;


import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String str1 = "Cat"; // две переменные созданные с обьявлением значения на прямую
        String str2 = "Cat";
        String str3 = new String("Cat"); // Переменная созданная с помощью конструктора
        String str4 = null; //полное отсутствие ссылки если есть null

        System.out.println("str1 == str2: " + str1.equals(str2)); // чтобы строки сравнивались только по своему значению метод(equalse)
        System.out.println("str1 == str3: " + str1.equals(str3));// обестроки теперь даю trur  значения равны
        System.out.println("str4 == str3: " + Objects.equals(str3, str4)); // с помощью класса objects сравнивает str3 b str4




        final int[] testArr = {1, 1, 1, 1, 1, 1};

//        testLinkArray(testArr);
//        testLinkArray(testArr.clone());

        int[] copyArr = new int[(int)(testArr.length * 1.5)]; //создаём массив и увеличиваем его в 1.5 полтара раза было 6 ячеек стало 9 ячеек

        System.arraycopy(testArr/* откуда берём*/, 0, copyArr, 0, testArr.length); // будет копировать один массив в другой массив
//        testLinkArray(copyArr);      /*с нулевой позиции*/ /*куда копируем с какой позиции, и сколько ячеек копируем */

        System.out.println(Arrays.toString(Arrays.copyOf(testArr, testArr.length))); // оздаётся копия массива, с какого массива будем брать и какую длину

        System.out.println(Arrays.toString(testArr));
    }

    private static void testLinkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //увеличиваем каждый массив на еденицу и выводим в консоль и массив изменяется
            arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
