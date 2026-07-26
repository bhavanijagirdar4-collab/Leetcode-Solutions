class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        if(numRows<=0){
            return tri;
        }

        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{

                    //Take the previous row to get the elements , For computation of the elements in current row
                    List<Integer> li = tri.get(i-1);
                    int val = li.get(j-1)+li.get(j);
                    row.add(val);
                }


            }
            tri.add(row);
        }

        return tri;
    }
}