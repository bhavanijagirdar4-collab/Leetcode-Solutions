class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        ArrayList<int []> matrix = new ArrayList<>();
        int k=intervals[0][0];
        int l=intervals[0][1];
        int m=1;
        while(m<intervals.length){
            if(intervals[m][0]<=l){
                l=Math.max(l,intervals[m][1]);
            }

            else{
                matrix.add(new int[]{k,l});
                k=intervals[m][0];
                l=intervals[m][1];
            }
            m++;
        }
        matrix.add(new int[]{k,l});
        return matrix.toArray(new int[matrix.size()][]);
    }
}