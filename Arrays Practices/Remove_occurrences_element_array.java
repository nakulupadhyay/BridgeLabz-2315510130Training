package Bridge_Labz;

public class Remove_occurrences_element_array {

	public static void main(String[] args) {
		int[] arr = {0,1,3,0,2,2,4,2};
        int ele = 2;
        
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ele) {
                arr[k] = arr[i];  
                
                k++;             
            }              
        }
		
		System.out.println(k);
		}
	}


