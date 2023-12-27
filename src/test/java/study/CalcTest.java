package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalcTest {

    @DisplayName("")
    @Test
    public void string_calc() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");

        int result = 0;
        String operation = "";
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (i == 0) {
                result += Integer.parseInt(s);
            }

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operation = s;
            } else {
                int num = Integer.parseInt(s);
                if (operation.equals("+")) {
                    result += num;
                } else if (operation.equals("-")) {
                    result -= num;
                } else if (operation.equals("*")) {
                    result *= num;
                } else if (operation.equals("/")) {
                    result /= num;
                }
            }
        }

        System.out.println("result = " + result);
    }

    @DisplayName("")
    @Test
    public void test() {
        // given

        // when

        // then

        char c = '4';

        System.out.println("c = " + (int) c);
    }
}
