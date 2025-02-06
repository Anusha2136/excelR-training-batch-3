public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Swap the first and last elements
        if (arr.length > 1) {  // Ensure the array has more than one element
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }

        // Printing the array after swap
        System.out.println("\nArray After Swap: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
