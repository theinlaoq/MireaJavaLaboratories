public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Pants(Sizes.XS, "темно-серый", 350),
                new TShirt(Sizes.L, "черный", 250),
                new Pants(Sizes.M, "голубой", 500),
                new Pants(Sizes.XXS, "синий", 225),
                new Skirt(Sizes.S, "розовый", 400),
                new Skirt(Sizes.M, "красный", 520),
                new Tie(Sizes.L, "синий", 300),
                new Tie(Sizes.L, "красный", 280),
        };

        Atelier studio = new Atelier();
        studio.dressMan(clothes);
        System.out.println();
        studio.dressWomen(clothes);
    }
}
