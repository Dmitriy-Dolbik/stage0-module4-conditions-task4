package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {
        TernaryMaxNumberPrinter ternaryMaxNumberPrinter = new TernaryMaxNumberPrinter();
        ternaryMaxNumberPrinter.printGreatest(10,12,8);
    }

    public void printGreatest(int first, int second, int third) {
        System.out.println(first >= second ? (first >= third ? first : third) : (second >= third ? second : third));
    }
}
