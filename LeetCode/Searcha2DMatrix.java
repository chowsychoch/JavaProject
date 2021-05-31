package udemy.LeetCode;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if ( matrix[0][0] > target) return false;
        int start = 0 ;
        int end = matrix.length - 1 ;
        int mid = 0 ;
        //System.out.println("end "  +end);

        while ( start <= end){
            mid  = start + ( end -start ) /2 ;
            if ( matrix[mid][0] == target){
                return true;
            }else if ( matrix[mid][0] < target){
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }
        }

        //get mid point
        //System.out.println("end " + end );
        int targetRow = end;
        //Reset all
        start = 0;
        end = matrix[end].length -1 ;
        mid = 0;
        //System.out.println("length" + end);


        while (start <= end ){
            mid = start + ( end -start) / 2 ;
            if ( matrix[targetRow][mid] == target){
                //System.out.println("T");
                return true;
            }else if ( matrix[targetRow][mid] < target){
                start = mid +1 ;
            }else {
                end = mid - 1;
            }
        }
        //System.out.println("F");
        return false;

    }
}
