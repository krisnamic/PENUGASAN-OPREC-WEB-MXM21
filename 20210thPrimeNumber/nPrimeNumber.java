import java.util.ArrayList;
import java.util.Scanner;

public class nPrimeNumber {
    static int MAX_SIZE = 1000005;
    static ArrayList<Integer> primelist = new ArrayList<Integer>();

    static void findPrimeNumber() {
        boolean[] IsPrime = new boolean[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < MAX_SIZE; p++) {
            if (IsPrime[p] == true) {
                for (int i = p * p; i < MAX_SIZE; i += p)
                    IsPrime[i] = false;
            }
        }

        for (int p = 2; p < MAX_SIZE; p++)
            if (IsPrime[p] == true)
                primelist.add(p);
    }

    public static void main(String[] args) {
        int n = 20210;
        System.out.println("Angka prima ke: " + n);
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        input.close();

        findPrimeNumber();
        System.out.println("Angka prima ke-" + n + " adalah " + primelist.get(n - 1));
    }
}