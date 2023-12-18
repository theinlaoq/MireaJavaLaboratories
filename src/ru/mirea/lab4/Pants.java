public class Pants extends Clothes implements ManClothing, WomenClothing{
    public Pants(Sizes size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        String s=String.format("%11s%8s%25s%8s%8.2f%5s%8s%13s","Штаны: ","размер - ",getSize(),", цена = ",getCost()," руб "," цвет - ",getColor());
        return s;
    }
}