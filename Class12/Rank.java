    class Rank extends Record {
    int index;

    Rank(int n) {
        super(n);
        index = 0;
    }

    void highest() {
        int small = rnk[0];
        for (int i = 1; i < size; i++) {
            if (rnk[i] < small) {
                small = rnk[i];
                index = i;
            }
        }
    }

    void display() {
        readvalues();
        super.display();
        highest();
        System.out.println("The student holding Highest rank");
        System.out.println(name[index] + "\t" + rnk[index]);
    }
}