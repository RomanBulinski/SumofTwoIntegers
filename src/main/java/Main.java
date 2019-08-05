import java.util.Arrays;
import java.util.stream.Stream;

public class Main {


    public static int add(int x, int y) {

        if (x > 0 && y > 0) {
            String[] xxx = new String[x];
            String[] yyy = new String[y];
            String[] both = Stream.concat(Arrays.stream(xxx), Arrays.stream(yyy))
                    .toArray(String[]::new);
            return both.length;
        }

        if (x < 0 && y < 0) {
            String[] xxx = new String[Math.abs(x)];
            String[] yyy = new String[Math.abs(y)];
            String[] both2 = Stream.concat(Arrays.stream(xxx), Arrays.stream(yyy))
                    .toArray(String[]::new);
            return both2.length - 2 * both2.length;
        }

        if (x < 0 && y > 0 && Math.abs(x)>y  ) {
            String[] xxx = new String[Math.abs(x)];
            String[] yyy = new String[(y)];
            int tmpLen = Arrays.copyOfRange(xxx, yyy.length, xxx.length ).length;
            return tmpLen =tmpLen - 2*tmpLen;

        }

        if (x < 0 && y > 0 && Math.abs(x)==y  ) {
            return 0;
        }

        if (x < 0 && y > 0 && Math.abs(x)<y  ) {
            String[] xxx = new String[Math.abs(x)];
            String[] yyy = new String[(y)];
            int tmpLen = Arrays.copyOfRange(xxx,  xxx.length , yyy.length).length;
            return tmpLen;
        }
        return -1;
    }

}
