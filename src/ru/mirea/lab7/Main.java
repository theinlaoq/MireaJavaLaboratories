
public class Main {
    public static void main(String[] args){
        System.out.println("4.Разработайте интерфейс MathCalculable,который содержит объявления математических функциях:" +
                "\nвозведения в степень и модуль комплексного числа, также содержит число PI. Напишите класс MathFunc," +
                "\n который  реализует этот интерфейс. Например, вычисление длинны окуржности, для чего используйте" +
                "\nчисло PI из интерфейса. Протестируйте класс");
        double randomradius1=Math.random()*100;
        double randomradius2=Math.random()*100;
        double real1=Math.random()*100;
        double real2=Math.random()*100;
        double imagin1=Math.random()*100;
        double imagin2=Math.random()*100;
        MathFunc example1=new MathFunc();
        MathFunc example2=new MathFunc();
        Circle c1=new Circle();
        Circle c2=new Circle();
        ComplexNumber n1=new ComplexNumber();
        ComplexNumber n2=new ComplexNumber();
        c1.setRadius(randomradius1);
        c2.setRadius(randomradius2);
        n1.setImaginAndReal(real1,imagin1);
        n2.setImaginAndReal(real2,imagin2);
        example1.setComplexAndCircle(n1,c1);
        example2.setComplexAndCircle(n2,c2);
        String lenght1=String.format("%5.3f",example1.lenghtCircle());
        String square1=String.format("%5.3f",example1.squareCircle());
        String lenght2=String.format("%5.3f",example2.lenghtCircle());
        String square2=String.format("%5.3f",example2.squareCircle());
        System.out.println(c1+" ,площадь= "+lenght1+" ,длина= "+square1);
        System.out.println(c2+" ,площадь= "+lenght1+" ,длина= "+square1);
        String modulNumber=String.format("%5.3f",example1.modul());
        System.out.println(n1+" ,модуль= "+modulNumber+"\nТестирование умножения и возведение в степень комплексных чисел:" +
                "\nво второй степени: "+ example1.degree(n1,2) + "\nумножение числа на число"+example1.multi(n1,n1)+
                "\nв трейтей степени: "+ example1.degree(n1,3)+"\nтри раза умножить число на число"+example1.multi(n1,(example1.multi(n1,n1))));
    }

}
