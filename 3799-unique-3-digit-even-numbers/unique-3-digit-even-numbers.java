class Solution {
    public int totalNumbers(int[] digits) {
        int[] available = new int[10];
        for (int d:digits) {
            available[d]++;
        }
        
        int count=0;
        
        for (int i=100; i<=998; i+=2) {
            int[] needed = new int[10];
            int temp=i;
        
            while (temp>0) {
                needed[temp%10]++;
                temp/=10;
            }
            
            boolean valid = true;
            for (int d=0;d<10;d++) {
                if (available[d]<needed[d]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                count++;
            }
        }
        
        return count;
    }
}