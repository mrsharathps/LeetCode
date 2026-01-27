class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> target = new ArrayList<>();

    for (int i =0; i<=rowIndex; i++){
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int j =1; j<i; j++){
            List<Integer> prevRow = target.get(i-1);
            int val = prevRow.get(j-1) + prevRow.get(j);
            row.add(val);
        }

        if(i>0){
            row.add(1);
        }

        target.add(row);
    }

    return target.get(rowIndex);

    }

    public static void main(String[] args){
        int rowIndex=3;
        System.out.println(getRow(rowIndex));
    }
}