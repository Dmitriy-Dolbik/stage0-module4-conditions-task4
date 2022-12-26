package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void main(String[] args) {
        TernaryAssignment ternaryAssignment = new TernaryAssignment();
        ternaryAssignment.assignAndPrintBasedOnWhichBigger(123,232);
    }
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? 10 : -10;
        System.out.println(result);
    }
}
