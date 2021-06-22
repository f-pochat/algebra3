package tp4;

import tp4.answers.utils.MatrixContainer;

public class Guide8Solution implements Guide8 {

    // Exercise 5
    @Override
    public double[] exercise_5_a(double[][] A, double[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public double[] exercise_5_b(double[][] A, double[] b) {
        throw new UnsupportedOperationException("TODO");
    }


    // Exercise 6
    @Override
    public double[] exercise_6(double[][] A, double[] b) {
        int n = b.length;
        //proceso descendente
        double aux;
        for (int k = 0; k < n-1 ; k++){
            aux = A[k][k];
            for (int j = k; j < n; j++ )
                A[k][j]=A[k][j]/aux;
            b[k] = b[k]/aux;
            aux = A[k+1][k];
            for (int j = k; j < n; j++)
                A[k+1][j]=A[k+1][j] - aux*A[k][j];
            b[k+1]= b[k+1]-aux*b[k];
        }
        b[n-1] = b[n-1]/A[n-1][n-1];
        A[n-1][n-1] = 1;
        // proceso ascendente
        double[] x = new double[n];
        double suma;
        x[n-1] = b[n-1];
        for (int i = n-2; i >= 0 ; i--){
            suma =0;
            for (int j = i+1; j < n; j++ )
                suma = suma + A[i][j]*x[j];
            x[i]= b[i]-suma;
        }
        return x;
    }

    // Exercise 7
    @Override
    public double[] exercise_7(double[][] A, double[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    // Exercise 9
    @Override
    public double[][] exercise_9(double[][] A) {throw new UnsupportedOperationException("TODO");}

    @Override
    public MatrixContainer exercise_10(double[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

}
