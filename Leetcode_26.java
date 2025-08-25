//26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int temp[]=new int[n];
        int count =0;
        for(int i=0;i<n;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                temp[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={1,1,2};
        Solution s=new Solution();
        int res=s.removeDuplicates(arr);
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }
}
