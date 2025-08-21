package Bridge_Labz;
import java.util.*;

public class Rearrange_element {
	    public static void rearrange(int arr[], int n) {
	        List<Integer> pos = new ArrayList<>();
	        List<Integer> neg = new ArrayList<>();
	        
	        for (int num : arr) {
	            if (num >= 0) {
	                pos.add(num);
	            } else {
	                neg.add(num);
	            }
	        }
	        int i = 0, j = 0, k = 0;
	        boolean turnPositive = true;  
	        
	        while (i < pos.size() && j < neg.size()) {
	            if (turnPositive) {
	                arr[k++] = pos.get(i++);
	            } else {
	                arr[k++] = neg.get(j++);
	            }
	            turnPositive = !turnPositive; 
	        }
	        while (i < pos.size()) {
	            arr[k++] = pos.get(i++);
	        }
	        while (j < neg.size()) {
	            arr[k++] = neg.get(j++);
	        }
	    }
	    public static void main(String[] args) {
	        int arr1[] = {1, 2, 3, -4, -1, 4};
	        rearrange(arr1, arr1.length);
	        System.out.println(Arrays.toString(arr1));

	        int arr2[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
	        rearrange(arr2, arr2.length);
	        System.out.println(Arrays.toString(arr2));
	    }
	}


