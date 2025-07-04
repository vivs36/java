import java.util.*;

class Record {
    String name[];
    int rnk[];
    int size;

    Record(int n) {
        size = n;
        rnk = new int[size];
        name = new String[size];
    }

    void readvalues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        System.out.println("Enter " + size + " ranks:");
        for (int i = 0; i < size; i++) {
            rnk[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Name \t Rank");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i] + "\t" + rnk[i]);
        }
    }
}