
package linearsearch;
public class LinearSearch {
 for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
 public static void main(String[] args) {
 int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
 intarget = 23;
   int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
  System.out.println("Element not found in the array");
        }
    }
}