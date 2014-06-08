package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/8/14
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class setMatrixZeros {
    public static void main(String args[]) {
        Matrix matrix = new Matrix(5, 8);
        matrix.printMatrix();

        matrix.setValue(0, 0, 0);
        matrix.setValue(0, 2, 0);
        matrix.setValue(0, 0, 0);
        matrix.setValue(2, 5, 0);
        matrix.setValue(3, 5, 0);
        matrix.printMatrix();

        Matrix newMatrix = setZeros(matrix);
        newMatrix.printMatrix();
    }

    public static Matrix setZeros(Matrix matrix) {
        boolean[] row = new boolean[matrix.getHeight()];
        boolean[] column = new boolean[matrix.getWidth()];

        for(int i=0; i<matrix.getHeight(); i++) {
            for(int j=0; j<matrix.getWidth(); j++) {
                if(matrix.getValue(i, j) == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0; i<row.length; i++) {
            if(row[i] == true) {
                for(int j=0; j<matrix.getWidth(); j++){
                    matrix.setValue(i, j, 0);
                }
            }
        }

        for(int i=0; i<column.length; i++) {
            if(column[i] == true) {
                for(int j=0; j<matrix.getHeight(); j++){
                    matrix.setValue(j, i, 0);
                }
            }
        }
        return matrix;
    }

}
