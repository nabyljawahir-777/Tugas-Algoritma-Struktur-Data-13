public class jump {
    public static int jumpSearch(int[] arr, int target){
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;


        while (arr[Math.min(step, n) -1] < target){  
            prev = step;
            step += (int) Math.sqrt(n);
            if(prev >= n){
                return -1; 
            }
        }

        for(int i = prev; i <Math.min(step, n); i++){ 
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        int result = jumpSearch(data, target);

    if(result != -1) {
        System.out.print("Data ditemukan pada index ke-"+result);
    }else{
        System.out.print("Data tidak ditemukan");
    }
    }
}
 
