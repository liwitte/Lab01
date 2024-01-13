import java.math.BigDecimal;

public class Lab1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = new BigDecimal("3");
        BigDecimal d = new BigDecimal("4");
        BigDecimal e = new BigDecimal("5");

        System.out.println(a.add(b));
        System.out.println(b.multiply(c));
        System.out.println(a.subtract(b.subtract(c.subtract(d))));
        System.out.println(a.subtract(b).subtract(c).subtract(d));
        System.out.println(b.multiply(c).subtract(d.multiply(e)));

        System.out.println("     ,,,,,     ");
        System.out.println("    _|||||_    ");
        System.out.println("   {~*~*~*~}   ");
        System.out.println(" __{*~*~*~*}__ ");
        System.out.println("`-------------`");


    }
}
