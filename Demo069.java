public class Demo069 {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 26, 40, 21 };
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        System.out.println("sum of elements in an array: " + sum);
    }
}

