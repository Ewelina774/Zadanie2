public class Main {
    public static void main(String[] args) {

        Candle candle1 = new Candle("biały", 7, 7.5 );

        System.out.println("Informacje o świeczce:");
        System.out.println("Kolor: " +  candle1.color);
        System.out.println("Wysokość: " + candle1.height);
        System.out.println("Średnica: " + candle1.diameter + "\n");

        Candle candle2 = new Candle("czerwony", 8.5, 6 );

        System.out.println("Informacje o świeczce:");
        System.out.println("Kolor: " +  candle2.color);
        System.out.println("Wysokość: " + candle2.height);
        System.out.println("Średnica: " + candle2.diameter + "\n");

        Candle candle3 = new Candle("szary", 6, 10 );

        System.out.println("Informacje o świeczce:");
        System.out.println("Kolor: " +  candle3.color);
        System.out.println("Wysokość: " + candle3.height);
        System.out.println("Średnica: " + candle3.diameter);
    }


}
