import java.util.Scanner;

public class matrix {
    Scanner scan = new Scanner(System.in);
    realNumber[][] matrix;

    public matrix(int row, int col) {
        matrix = new realNumber[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = new realNumber(0,1);
            }
        }
        //matrix[1][1] = new realNumber(100,100);
    }

    public int[] getDimension() {return new int[]{matrix.length, matrix[0].length};}
    public realNumber get(int row, int col) {return matrix[row][col];}

    public matrix scalar(int scalar) {
        for (realNumber[] realNumbers : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                realNumbers[j].multiply(scalar);
            }
        }
        return this;
    }

    // make inverse
    //make dot product
    //

    public String toString() {
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += matrix[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }
}
