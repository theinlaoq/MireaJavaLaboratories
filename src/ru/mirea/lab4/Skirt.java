public class Skirt extends Clothes implements WomenClothing {

    public Skirt(Sizes size, String color, double cost) {
        super(size, color, cost);//в отличие от this, ссылается на класс Одежда
    }

    @Override
    public String toString() {
        String s=String.format("%11s%8s%25s%8s%8.2f%5s%8s%13s","Юбка: ","размер - ",getSize(),", цена = ",getCost()," руб "," цвет - ",getColor());
        return s;
    }
}