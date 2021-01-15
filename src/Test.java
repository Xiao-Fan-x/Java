/**
 * @auther Wuyifan
 * @create 2020-11-15-20:44
 */
public class Test {


    public static void main(String[] args) {
        int num = 0;
        int[][] gezi=new int[2100+2100+2100+1][6301];

        for (int x = 0; x < 6300; x++) {
            for (int y = 0; y < 6300; y++) {
                gezi[x][y] = 0;
            }
        }
        gezi[2100][2100] = 1;
        gezi[4120][2111] = 1;
        gezi[2111][2114] = 1;
        gezi[4100][4100] = 1;

        for (int i = 1; i <= 2020; i++) {
            for (int x = 0; x < 6300; x++) {
                for (int y = 0; y < 6300; y++) {
                    if (gezi[x][y] == 1) {

                        gezi[x - 1][y] = 1;
                        gezi[x + 1][y] = 1;
                        gezi[x][y - 1] = 1;
                        gezi[x][y + 1] = 1;
                    }
                }
            }
        }

        for (int x = 0; x < 6300; x++) {
            for (int y = 0; y < 6300; y++) {
                if (gezi[x][y] == 1)
                    num++;
            }
        }
        System.out.println(num);
    }
}


