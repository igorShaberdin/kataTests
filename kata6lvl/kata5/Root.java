
public class Root {
    public static int showRoot(int n) {
        int[] x = new int[20];
        int[] s = new int[5];
        int[] z = new int[5];
        int result = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = n % 10;
            n /= 10;
            count += x[i];
            result = count;
        }
        if (count > 9) {
            for (int y = 0; y < s.length; y++) {
                s[y] = count % 10;
                count /= 10;
                count1 += s[y];
                result = count1;
            }
        }
        if (count1 > 9) {
            for (int j = 0; j < z.length; j++) {
                z[j] = count1 % 10;
                count1 /= 10;
                count2 += z[j];
                result = count2;
            }
        }
        return result;
    }
}

