class Solution {
    public char kthCharacter(int k) {
        int pow;
        for (pow = 1; pow < k; pow *= 2);
        pow /= 2;
        int jump = 0;
        while (k != 1){
            if (k - pow > 0){
                k = k - pow;
                jump++;
            }
            pow /= 2;
        }
        return (char) ('a' + jump);
    }
}