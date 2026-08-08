class Solution {
    public int maxVowels(String s, int k) {

       int n = s.length();
       int maxVowels = 0;
       int count = 0;

       for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
       }
       maxVowels = count;

       for (int i=k ; i<n; i++){
             if (isVowel(s.charAt(i))) {
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }

            maxVowels = Math.max(maxVowels, count);
       }

       return maxVowels;
    }

    private boolean isVowel(char ch){
        if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        else return false;
    }
}