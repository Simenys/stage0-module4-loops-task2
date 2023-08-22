package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int answer = 1;
        for (int i = 0; i <= printToInclusive; i++) {
            if (i > 0) {
                answer *= i;
            }
            System.out.println(answer);
        }
    }
}
