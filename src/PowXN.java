public class PowXN {

    static double powhelper(double x, int n)
    {
        if (n == 0)
            return 1;

        double res = powhelper(x, n / 2);

        if (n % 2 == 0)
            return res * res;
        else
            return res * res * x;
    }

    double myPow(double x, int n)
    {
        // 二分实现 logn
        if (n == 0)
            return 1;
        else if (n < 0)
            return 1.0 / powhelper(x, -n);

        return powhelper(x, n);
    }

    public static void main(String[] args) {

    }
}
