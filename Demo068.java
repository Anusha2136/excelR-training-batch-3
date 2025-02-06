public class Demo068 {
 
    public static void main(String[] args) {
        int [] arr ={20,40,80,21,23};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 ==0){
                count ++;
            }
           
        }
        System.out.println("the final count of the even numbers in an array: "+count);
    }
}
