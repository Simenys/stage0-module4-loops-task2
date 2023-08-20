package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        int i = 0;
        int answer = 1;
        while (i <= power) {
            System.out.println(answer);
            answer *= 2;
            i += 1;
        }

    }
}
