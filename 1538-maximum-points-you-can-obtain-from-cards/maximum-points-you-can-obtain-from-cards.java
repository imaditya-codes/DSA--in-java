class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int leftPoint=0;
        int rightPoint=0;
        int maxScore=0;

        for(int i=0; i <= k-1; i++){
            leftPoint += cardPoints[i];
        }

        maxScore=leftPoint;

        int rightIndex=n-1;
        for(int i=k-1; i>=0; i--){
            leftPoint -= cardPoints[i];
            rightPoint += cardPoints[rightIndex];
            rightIndex = rightIndex - 1;

            maxScore = Math.max(maxScore,(rightPoint+leftPoint));
            
        }

        return maxScore;
    }
}