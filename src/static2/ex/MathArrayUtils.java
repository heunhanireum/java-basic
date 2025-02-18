package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        return (double)sum/array.length;
    }

    public static int min(int[] array) {
        int minNum = array[0];
        for (int num : array) {
            if (minNum > num) {
                minNum = num;
            }
        }
        return minNum;
    }

    public static int max(int[] array) {
        int maxNum = array[0];
        for (int num : array) {
            if (maxNum < num) {
                maxNum = num;
            }
        }
        return maxNum;
    }
}
