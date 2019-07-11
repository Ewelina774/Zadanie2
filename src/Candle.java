public class Candle {
    String color;
    double height;
    double diameter;

    Candle (String c, double h, double d) {

        color = c;
        height = h;
        diameter = d;

    } void show(){
            System.out.println("Informacje o świeczce:");
            System.out.println("Kolor: " +  color);
            System.out.println("Wysokość: " + height);
            System.out.println("Średnica: " + diameter + "\n");
        }
    }

