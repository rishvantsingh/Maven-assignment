
import java.util.Scanner;

public final class Application {
    private Application() {
    }

    /**
     * @param args */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {
        System.out.println("A Calculator");
        System.out.println();
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal.add(a, b);
        cal.sub(a, b);
        cal.div(a, b);
        cal.mul(a, b);

        sc.close();
    }
}
