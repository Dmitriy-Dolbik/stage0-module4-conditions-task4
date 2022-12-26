package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void main(String[] args) {
        MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();
        maxNumberPrinter.printGreatest(26,36,17);
    }
    public void printGreatest(int first, int second, int third) {
        if (first >= second) {
            if (first >= third) {
                System.out.println(first);
            }
        } else if (second >= third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
