package hard;

import java.util.*;

class  MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double answer;
        int[] newList = new int[ nums1.length + nums2.length];
        mergeArrays(nums1, nums2, nums1.length, nums2.length, newList);

        if(newList.length % 2 == 0){
            int a = newList[(int)newList.length / 2];
            int b = newList[((int)newList.length / 2) - 1];

            answer = (a + b )/ 2.0;
        }else{ 

            answer = newList[newList.length /2];
        }

        return answer;

    }
        public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i = 0;  
        int j = 0;  
        int k = 0;  
          
        // traverse the arr1 and insert its element in arr3
        while(i < n1){   
         arr3[k++] = arr1[i++];   
        }   
          
        // now traverse arr2 and insert in arr3
        while(j < n2){   
         arr3[k++] = arr2[j++];   
        }   
          
        // sort the whole array arr3
        Arrays.sort(arr3);   
    }
}