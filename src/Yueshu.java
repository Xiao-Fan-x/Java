import java.util.ArrayList;

/**
 * @auther Wuyifan
 * @create 2020-11-15-21:47
 */
public class Yueshu {

    public static void main(String[] args) {
        int arr[] = new int[101];

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int j = 2; j < 100; ++j) {
            if (yinshu(j)) {
                primes.add(j);
            }
        }

        for (int i = 2; i <= 100; i++) {
            int j = i;
            for (;;) {
                for (int p : primes) {
                    if (j % p==0) {
                        arr[p]++;
                        j = j / p;
                        break;
                    }
                }
                if (j == 1)
                    break;
            }
        }

        long count = 1;
        for (int j = 2; j <= 100; ++j) {
            if (arr[j]!=0) {
                count *= (arr[j] + 1);
            }
        }
        System.out.println(count);
    }

    static boolean yinshu(int n) {
        if (2 == n)
            return true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}