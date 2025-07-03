class Compute extends Library {
    int d;
    double f;

    Compute(String n, String a, double pr, int da) {
        super(n, a, pr);
        d = da;
        f = 0.0;
    }

    void fine() {
        int extra = d - 7;
        if (extra <= 0)
            f = 0.0;
        else if (extra <= 5)
            f = extra * 2;
        else if (extra <= 10)
            f = 5 * 2 + (extra - 5) * 3;
        else
            f = 5 * 2 + 5 * 3 + (extra - 10) * 5;
    }

    void display() {
        fine();
        double amt = (0.02 * p) * d + f;
        super.show();
        System.out.println("Days = " + d);
        System.out.println("Fine = " + f);
        System.out.println("Amount = " + amt);
    }
}