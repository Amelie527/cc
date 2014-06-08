package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/7/14
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
import cp1.Matrix;

public class rotateMatrix {
    public static void main(String args[]) {
        Matrix matrix = new Matrix(5, 5);
        Matrix newMatrix = rotateMatrix(matrix);
        newMatrix.printMatrix();
    }

    public static Matrix rotateMatrix(Matrix matrix) {
        int length = matrix.getHeight();
        Matrix newMatrix = new Matrix(5, 5);
        for(int i=0; i<matrix.getHeight(); i++) {
            for(int j=0; j<matrix.getHeight(); j++) {
                newMatrix.setValue(i, j, matrix.getValue(length - 1 - j, i));
            }
        }
        return newMatrix;
    }


}
