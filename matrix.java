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
    public realNumber set(int row, int col, realNumber val) {return matrix[row][col] = val;}

    public matrix scalar(int scalar) {
        for (realNumber[] realNumbers : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                realNumbers[j].multiply(scalar);
            }
        }
        return this;
    }

    // make inverse
    public matrix inverse() {
        matrix ans = new matrix(getDimension()[1], getDimension()[0]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //ans[j][i] = matrix[i][j];
                ans.set(j, i, get(i, j).copy());
            }
        }
        return ans;
    }
    //make dot product (confused on the most inner loop and which varieble to use
//    public matrix dotProduct(matrix partner) {
//        // ex. 3x2 multiply 2x3 = 3x3 dimension wise
//        matrix product = new matrix(getDimension()[0], partner.getDimension()[1]);
//        // 2 outer for loops iterate for the products creation
//        for (int i = 0; i < product.getDimension()[1]; i++) {
//            for (int j = 0; j < product.getDimension()[0]; j++) {
//                // inner for loop iterates for the left matrix row and add up all the products
//                String thi = "";
//                for (int z = 0; z < this.getDimension()[1]; z++) {
//                    System.out.println(this.get(i,j) + "*" + partner.get(z,i));
//                    product.set(i,j, product.get(z,j).add(this.get(z,j).multiply(partner.get(i,z))));
//                    thi += " " + this.get(z,j).multiply(partner.get(i,z));
//                }
//                System.out.println("line " + thi);
//            }
//        }
//        return product;
//    }

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
