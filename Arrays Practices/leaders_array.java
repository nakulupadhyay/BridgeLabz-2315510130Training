package Bridge_Labz;
import java.util.*;

public class leaders_array {
	    public static List<Integer> findLeaders(int[] arr) {
	        int n = arr.length;
	        List<Integer> leaders = new ArrayList<>();
	        int max_from_right = arr[n - 1]; 
	        leaders.add(max_from_right);
	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] >= max_from_right) {
	                leaders.add(arr[i]);
	                max_from_right = arr[i];
	            }
	        }
	        Collections.reverse(leaders);
	        return leaders;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {16, 17, 4, 3, 5, 2};
	        int[] arr2 = {1, 2, 3, 4, 5, 2};

	        System.out.println(findLeaders(arr1)); 
	        System.out.println(findLeaders(arr2)); 
	 }
}


