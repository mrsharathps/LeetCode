class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j=1; j< i; j++){
                List<Integer> prevRow = result.get(i-1);
                int val = prevRow.get(j-1)+prevRow.get(j);
                row.add(val);
            }

            if(i>0){
                row.add(1);
            }

            result.add(row);
        }
        return result;
        
    }

    public static void main(String[] args){
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}