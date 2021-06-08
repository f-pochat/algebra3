package tp3;

import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.VectorDouble;

import java.util.ArrayList;
import java.util.List;

public class Guide7Solution implements Guide7 {

    @Override
    public int exercise_1_a(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_c(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_d(int[][] A, int[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_e(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    //Por la signature del metodo suponemos que el numero de columnas de A es igual al numero de filas de B
    @Override
    public int[][] exercise_1_f(int[][] A, int[][] B) {
        Matrix a = new Matrix(A);
        Matrix b = new Matrix(B);
        int[][] productMatrix = new int[a.getRows()][b.getColumns()];
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getColumns(); j++) {
                for (int k = 0; k < a.getColumns(); k++) {
                    productMatrix[i][j] += a.getValue(i,k)*b.getValue(k,j);
                }
            }
        }
        return productMatrix;
    }

    @Override
    public int[][] exercise_1_g(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_h(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int exercise_1_i(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int[][] exercise_1_j(int[][] A, int c) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean exercise_2_a(int[][] A) {
        Matrix a = new Matrix(A);
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getColumns(); j++) {

                if (a.getValue(i,j) != a.getValue(j,i)){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        Matrix a = new Matrix(A);
        for (int i = 0; i < a.getRows(); i++) {
            int colsNum = 0;
            for (int j = 0; j < a.getColumns() && j != i; j++) {
                colsNum += Math.abs(a.getValue(i,j));
            }
            if (Math.abs(a.getValue(i,i)) <= colsNum){
                return false;
            }
        }
        return true;
    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op) {
        int[][] result = new int[op.getMatrix1().getRows()][op.getMatrix1().getColumns()];
        for (int i = 1; i < op.getMatrix1().getRows()-1; i++) {
           for (int j = i - 1; j <= i + 1; j++) {
               result[i][j] = op.getMatrix1().getValue(i,j) + op.getMatrix2().getValue(i,j);
           }
        }
        result[0][0] = op.getMatrix1().getValue(0,0) + op.getMatrix2().getValue(0,0);
        result[0][1] = op.getMatrix1().getValue(0,1) + op.getMatrix2().getValue(0,1);
        result[op.getMatrix1().getRows()-1][op.getMatrix1().getRows()-1] = op.getMatrix1().getValue(op.getMatrix1().getRows()-1,op.getMatrix1().getRows()-1) + op.getMatrix2().getValue(op.getMatrix1().getRows()-1,op.getMatrix1().getRows()-1);
        result[op.getMatrix1().getRows()-1][op.getMatrix1().getRows()-2] = op.getMatrix1().getValue(op.getMatrix1().getRows()-1,op.getMatrix1().getRows()-2) + op.getMatrix2().getValue(op.getMatrix1().getRows()-1,op.getMatrix1().getRows()-2);
        op.setResult(new Matrix(result));
        return op;
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        List<double[]> result = new ArrayList<>();
        result.add(0,A.get(0));
        for (int i = 1; i < A.size(); i++) {
            result.add(i,ex4Helper(result,A, i));
        }
        return result;
    }


    public double[] ex4Helper(List<double[]> r, List<double[]> A, int i){
        VectorDouble vn = new VectorDouble(A.get(i));
        double[] rightPart = new double[A.get(i).length];
        VectorDouble vd = new VectorDouble(rightPart);
        for (int j = 0; j < i; j++) {
            VectorDouble wi = new VectorDouble(r.get(j));
            double numerator = vn.escalarProd(wi);
            double denominator = wi.squaredModule();
            double scalar = numerator/denominator;
            VectorDouble newVector = wi.productByScalar(scalar);
            vd.addVectors(newVector);
        }
        VectorDouble vr = vn.subsractVectors(vd);
        return vr.getVector();
    }
}
