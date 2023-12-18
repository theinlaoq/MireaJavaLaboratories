import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        System.out.println("1.Задание\nНеобходимо реализовать консольное приложение, позволяющее манипулировать строкой, разбив" +
                "\nеё на элементы путем использования регулярных выражений");
        System.out.println("Введите строку: ");
        Scanner scan=new Scanner(System.in);
        String stroka=scan.nextLine();
        System.out.println("Введите паттерн: ");
        String patt=scan.nextLine();
        System.out.println(Arrays.toString(stroka.split(patt)));
        System.out.println("2. Задание\nДан текст, необходимо проверить есть ли в тексте цифры, перед которыми не стоит" +
                "\nзнак <<+>>.");
        System.out.println("Введите выражение: ");
        String expression=scan.nextLine();
        if( Pattern.compile("\\d+\\s*\\+").matcher(expression).find()){
            System.out.println("В тексте есть цифра, перед которой стоит знак <+>");
        }else{
            System.out.println("В тексте нет цифр, перед которой стоит знак <+>");
        }
        System.out.println("3. Задание\nПроверить надежно ли составлени пароль. Пароль считается надежным, если" +
                "\nон состоит из 8 или более символов. Где символом может быть цифра, английская буква и знак подчеркивания." +
                "\nПароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру");
        System.out.println("Введите пароль: ");
        String password=scan.nextLine();
        if(Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_){8,}").matcher(password).find()){
            System.out.println("Пароль надежен");
        }else{
            System.out.println("Пароль не надежен");
        }
    }
}
