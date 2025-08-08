class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Arraylist to store the resulting list of list which forms pascals triangle
        List<List<Integer>> result = new ArrayList<>();
        
        //checks if the rows are zero if yes then returns empty list(result)
        if(numRows==0){return result;}

        //creating arraylist for firstrow
        ArrayList<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);    //adding first element in first row which is 1
        result.add(firstrow);   //adding this firstrow to our pascalstree list which is result

        //checks if numrow is only one if yes it returns only 1 in the list(result)
        if(numRows==1){ return result;}

        //for loop for the next rows(2nd row) which will iterate till numRows
        for(int i=1; i<numRows; i++) {

            //Creating new list for storing previous row
            List<Integer> prevRow = result.get(i - 1);

            //Creating new list which will store the elements of current list
            ArrayList<Integer> Row = new ArrayList<>();
            Row.add(1);   //addding first element 1 in the current list

           // loop for middle element j<i-1 because last elements space should be empty where will add 1 after completing the loop
            for (int j = 0; j < i - 1; j++) {
                
                //this is for second element as first we already added before loop
                //previous row's jth element + j's next element
                Row.add(prevRow.get(j) + prevRow.get(j + 1));
            }

            //for last element which should be 1 thats why return outside the loop
            Row.add(1);

            //adding all the elements to our final list which is result;
            result.add(Row);
        }
        return result;
        
    }
}