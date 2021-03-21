package tp1;

import java.util.List;

public class Guide1RecursiveSolution implements Guide1 {

    @Override
    public int exercise_1_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int p, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_e(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int n) {
        return auxexercise_1_f(n,0,0);
    }

    public int auxexercise_1_f(int n, int i, int sum){
        if (i <= n) {
            sum += Math.pow(i, 3);
            return auxexercise_1_f(n, i+1, sum);
        }
        return sum;
    }

    @Override
    public int exercise_2_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_c(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return exercise_2_c(n-1) + exercise_2_c(n-2);
        }
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] array) {
        return auxexercise_4(array,0);
    }

    public boolean auxexercise_4(int[] elements, int i){
        if (i < elements.length) {
            if (elements[i] != elements[elements.length-i-1]) {
                return false;
            }
            return auxexercise_4(elements, i+1);
        }
        return true;
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_ii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_iii(int n) {
        return auxexercise_6_b_iii(n,0,2);
    }

    public int auxexercise_6_b_iii(int n, int amount, int factor){
        if(factor > n){
            return amount;
        }else if (n % factor == 0){
            n = n/factor;
            return auxexercise_6_b_iii(n,amount+1, factor);
        }else if(factor > 2) {  // como el unico numero primo par es el 2, se saltea los numeros pares mayores a este.
            return auxexercise_6_b_iii(n, amount, factor + 2);
        }else return auxexercise_6_b_iii(n, amount, factor + 1);
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        return auxexercise_8(coefs,n,coefs.length-1,0);
    }

    private int auxexercise_8(int[] coefs, int n, int i, int result){
        if (i < 0){
            return result;
        }else {
            result = result*n + coefs[i];
            return auxexercise_8(coefs,n,i-1,result);
        }
    }
}
