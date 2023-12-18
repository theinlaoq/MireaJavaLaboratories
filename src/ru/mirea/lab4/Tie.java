public class Tie extends Clothes implements ManClothing{
    public Tie(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        String s=String.format("%11s%8s%25s%8s%8.2f%5s%8s%13s","Галстук: ","размер - ",getSize(),", цена = ",getCost()," руб "," цвет - ",getColor());
        return s;
    }
}