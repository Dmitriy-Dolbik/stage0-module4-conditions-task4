package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void main(String[] args) {
        TernaryGreatestNumberPrinter ternaryGreatestNumberPrinter = new TernaryGreatestNumberPrinter();
        ternaryGreatestNumberPrinter.printGreatest(2134,2134);
    }
    public void printGreatest(int first, int second) {
        System.out.println(first >= second ? first : second);
    }
}
