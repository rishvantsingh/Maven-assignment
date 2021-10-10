public class Calculator {
    /**
     * @param firstno this takes first number
     * @param secondno this takes second number
     * @return it returns sum
     */
    public final int add(final int firstno, final int secondno) {
        int res = firstno + secondno;
        System.out.println("Addition is = " + (res));
        return res;
    }

    /**
     * @param firstno this takes first number
     * @param secondno this takes second number
     * @return it returns the product
     */
    public final int mul(final int firstno, final int secondno) {
        int res = firstno * secondno;
        System.out.println("Product is = " + (res));
        return res;
    }

    /**
     * @param firstno  this takes first number
     * @param secondno  this takes second number
     * @return it returns division
     */
    public final double div(final double firstno, final double secondno) {
        if (secondno != 0) {
            double res = firstno / secondno;
            System.out.println("Division is = " + (res));
            return res;
        } else {
            System.out.println("Division by 0 is not possible");
            return 0;
        }
    }

    /**
     * @param firstno this takes the first number
     * @param secondno  this takes the second number
     * @return it returns difference
     */
    public final int sub(final int firstno, final int secondno) {
        int res = firstno - secondno;
        System.out.println("Difference is = " + (res));
        return res;
    }

}
