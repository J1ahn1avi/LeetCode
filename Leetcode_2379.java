//2379. Minimum Recolors to Get K Consecutive Black Blocks
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int currCount=0;
        int minCount=Integer.MAX_VALUE;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                currCount++;
            }
        }

        minCount=currCount;

        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(left)=='W'){
                currCount--;
            }
            if(blocks.charAt(i)=='W'){
                currCount++;
            }

            minCount=Math.min(minCount,currCount);
            left++;
        }
        return minCount;
    }
}
