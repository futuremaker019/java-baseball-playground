import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
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
}
