class lc2106 {
    public  int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int maxFruits = 0;
        int left = 0, sum = 0;
        for (int right = 0; right < n; right++) {
            sum += fruits[right][1]; 
            while (left <= right && stepsNeeded(fruits, startPos, left, right) > k) {
                sum -= fruits[left][1];
                left++;
            }
            maxFruits = Math.max(maxFruits, sum); 
        }

        left = n - 1;
        sum = 0;
        for (int right = n - 1; right >= 0; right--) {
            sum += fruits[right][1]; 
            while (left >= right && stepsNeeded(fruits, startPos, right, left) > k) {
                sum -= fruits[left][1]; 
                left--;
            }
            maxFruits = Math.max(maxFruits, sum); 
        }

        return maxFruits;
    }
    private int stepsNeeded(int[][] fruits, int startPos, int leftIdx, int rightIdx) {
        int leftPos = fruits[leftIdx][0];
        int rightPos = fruits[rightIdx][0];

        if (startPos <= leftPos) {
            return rightPos - startPos; 
        } else if (startPos >= rightPos) {
            return startPos - leftPos; 
        } else {
            return Math.min(
                (startPos - leftPos) + (rightPos - leftPos), 
                (rightPos - startPos) + (rightPos - leftPos)
            );
        }
    }
}
