package tp1;

import java.util.List;

public class Guide1IterativeSolution implements Guide1 {

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
    public int exercise_1_f(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
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
        int value1 = 0;
        int value2 = 1;
        int counter = 0;
        while(counter < n){
            int value3 = value1 + value2;
            value1 = value2;
            value2 = value3;

            counter++;
        }

        return value1;
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
    public boolean exercise_4(int[] elements){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != elements[elements.length-i-1]) {
                return false;
            }
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
    public int exercise_6_b_iii(int num){
        int amount = 0;
        int factor = 2;
        do {
            if (num % factor == 0) {
                num = num/factor;
                amount++;
            } else if(factor > 2){  // como el unico numero primo par es el 2, se saltea los numeros pares mayores a este.
                factor += 2;
            }else{
                factor++;
            }
        }while(factor <= num);
        return amount;
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n){
        int result = 0;
        for (int i = coefs.length-1 ; i >= 0; i--) {
            result = result*n + coefs[i];
        }
        return result;
    }
}
