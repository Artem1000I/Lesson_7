package org.example;

public class TestStringBuilder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String s = "1" + "f" + "f";
        s += "g";
        s += "r";

        System.out.println(convertArrayToString(arr));
    }

    private static String convertArrayToString(int[] data) {
//        String str = "[";
        StringBuilder sb = new StringBuilder("[");  //указываем первый символ который будет
        for (int i = 0; i < data.length; i++) {
//            str += data[i];
            sb.append(data[i]);
            if (i != data.length - 1) { // будем добавлять элемент массива
//                str += ", ";
                sb.append(", "); // в массив добавляем запятую
            }
        }
//        str += "]";
        sb.append("]"); // возвращаем все через ретёрн
        return sb.toString();
    }

}
