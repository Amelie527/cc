package cp1;

/**
 * Created with IntelliJ IDEA.
 * User: rxiao
 * Date: 6/8/14
 * Time: 12:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Matrix {
    int[][] matrix;

    public Matrix(int x, int y) {
        createMatrix(x, y);
    }

    public int[][] createMatrix(int x, int y) {
        matrix = new int[x][y];
        int count = 0;
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                matrix[i][j] = count;
                count ++;
            }
        }
        return matrix;
    }

    public void printMatrix() {
        for(int i=0; i<matrix.length; i++) {
            String row = "";
            for(int j=0; j<matrix[i].length; j++) {
                if(j != matrix[i].length -1) {
                    row += matrix[i][j] + ",";
                } else {
                    row += matrix[i][j];
                }
            }
            System.out.println(row);
        }
    }

    public int getHeight() {
        return this.matrix.length;
    }

    public int getWidth() {
        return this.matrix[0].length;
    }

    public int getValue(int x, int y) {
        return this.matrix[x][y];
    }

    public void setValue(int x, int y, int value) {
        this.matrix[x][y] = value;
    }
}
