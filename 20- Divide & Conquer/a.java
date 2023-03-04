// public class a {
//     public static void printArr(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void mergerSort(int arr[], int si, int ei){
//         // Base Case:
//         if(si >= ei){
//             return;
//         }

//         // kaam
//         int mid = si + (ei - si)/2;
//         mergerSort(arr, si, mid);
//         mergerSort(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei-si+1];
//         int i = si;  // iterator for left part
//         int j = mid+1;  // iterator for Right part
//         int k = 0;  // iterator for temp arr

//         while(i<=mid && j<=ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // For Remaining left part
//         while(i<=mid){
//             temp[k++] = arr[i++];
//         }

//         // For Remaining Right part
//         while(j<=ei){
//             temp[k++] = arr[j++];
//         }

//         // copy temp to orginal arr

//         for(k=0, i=si; k<temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {6, 3, 9, 5, 2, 8, -2};
//         mergerSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }
   



// // for Average case: T.C - O(nlogn)
// // for Worst case: T.C - O(n^2)

// // Space Complexity - O(1)

// // Quick Sort runs in Pivot & Partition approach

// public class a {

//     public static void printArr(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
    
//     public static void quickSort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }
//         // last element(as pivot)
//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx - 1);  // left part
//         quickSort(arr, pIdx + 1, ei);  // Right part
//     }

//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si-1;  // to make place for els smaller than pivot

//         for(int j = si; j<ei; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 // swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];  // don't write here,  pivot = arr[i]  
//         arr[i] = temp;
//         return i;
//     }
//     public static void main(String args[]){
//         int arr[] = {6, 3, 9, 8, 2, 5};
//             quickSort(arr, 0, arr.length-1);
//             printArr(arr);
//     }
// }



// public class a {
//     public static int Search(int arr[], int tar, int si, int ei){
//         // Base Case
//         if(si>ei){
//             return -1;
//         }
//         // kaam
//         int mid = si + (ei - si)/2;
        
//         // 1.
//         if(arr[mid] == tar){
//             return mid;
//         }

//         // 2.
//         if(arr[si] <= arr[mid]){
//             if(arr[si] <= tar && tar < arr[mid]){
//                 return Search(arr, tar, si, mid-1);
//             }
//             else{
//                 return Search(arr, tar, mid+1, ei);
//             }
//         }

//         // 3.
//         else{
//             if(arr[mid] < tar && tar <= arr[ei]){
//                 return Search(arr, tar, mid+1, ei);
//             }
//             else{
//                 return Search(arr, tar, si, mid-1);
//             }
//         }
//     }
// public static void main(String args[]){
//    int arr[] = {4,5,6,7,8,9,0,1,2,3};
//    int target = 0;
//    int tdx = Search(arr, target, 0, arr.length-1);
//    System.out.println(tdx);
// }
// }



// public class a {
//    public static int Search(int arr[], int tar, int si, int ei){

//     int mid = si + (ei - si)/2;
//     while(si<=ei){
//     if(arr[mid] == tar){
//         return mid;
//     }

//     if(arr[si] <= arr[mid]){
//         if(arr[si] <= tar && tar < arr[mid]){
             
//         }
//     }
//    }
//     }
    
//    public static void main(String args[]){
//    int arr[] = {4,5,6,7,8,9,0,1,2,3};
//    int target = 0;
//    int tdx = Search(arr, target, 0, arr.length-1);
//    System.out.println(tdx);
// }     

// }



// public class a {
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int arr[], int si, int ei) {
//         if(si>=ei){
//             return;
//         }
//         //kaam
//         int mid = si + (ei - si)/2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid+1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei-si+1];
//         int i = si;
//         int j = mid+1;
//         int k = 0;

//         while(i <= mid && j <= ei) {
//             if(arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++; 
//             }

//             else{
//                 temp[k] = arr[j];
//                 j++; 
//             }
//             k++;
//         }

//         while(i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         while(j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         for(k=0, i=si; k<temp.length; k++, i++) {
//             arr[i] = temp[k]; 
//         }
//     }
// public static void main(String args[]){
//    int arr[] = {6, 3, 9, 5, 2, 8};    
//    mergeSort(arr, 0, arr.length-1);
//    printArr(arr);
// }

// } 


