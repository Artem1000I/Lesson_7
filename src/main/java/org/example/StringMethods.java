package org.example;

import java.io.IOException;

public class StringMethods {

    public static void main(String[] args) throws IOException { //методы уоторые есть у строки
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2;
//        a3 = a1.concat(a2).concat("!").concat(" (c)").concat("Safronov T."); // конкатинация через методы

        String b1 = "Число";
        int b2 = 10;
        String b3 = b1 + b2;
        b3 = b1.concat(String.valueOf(b2));

        System.out.println(a1.equals(a2));       // чтобы сравнить строки
        System.out.println(a1.compareTo(a2));    // чтобы сравнить строки больше или меньше на 4 позиции H cтоит дальше

        String spaces = "   \n\t\s   ";  //    убрать все ненужные пробелы
        System.out.println(spaces.trim());
        System.out.println(spaces == null); //"" - false  если строка пустая даст false

        System.out.println(spaces.isEmpty()); //"" - true, "   " - false проверяет строку есть ли в ней хоть что-то.
        System.out.println(!(spaces.length() > 0)); //"" - true, "   " - false  проверка длины

        System.out.println(spaces.trim().isEmpty()); //"" - true, "   " - true пустые строки будут отсекаться
        System.out.println(spaces.isBlank()); //"" - true, "   " - true

        System.out.println(a3.substring(10)); //от какого символа до конца вырезаем
        System.out.println(a3.substring(10, 15));  // символ с какого по какой будем вырезать
        System.out.println(a3.toLowerCase()); //сделать все буквы заглавные
        System.out.println(a3.toUpperCase());
        //TODO Сделать в строке заглавной только первую букву

        System.out.println(a3.charAt(10));   //обратиться к конкретному символу
        System.out.println(a3.indexOf('e', 2)); // найти позицию символа, указываем с какой позиции начинаем проверку

        for (String s : a3.split("\s+", 3)) { //деление строки на подстроки, сплит деление строки,будем искать пробелы и после пробела делим на подстроки
            System.out.println("Строка: " + s);          //лимит строки 3
        }

        System.out.println(a3.replaceAll("My", "Our")); //заменяет одну группу символов на другую группу символов
        System.out.println(a3.startsWith("/auth"));      // проверка с чего начинается строка
        System.out.println(a3.endsWith(".txt"));         //нужный файл содержит .txt

        System.out.println(String.join(", ", a1, a2, b1));   // берёт несколько элементов строк , чем будем делаить строки далее экземпляры строки которые мы обьеденим и будут разделены через запятую
    }
}
