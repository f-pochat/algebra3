package tp2;

import tp2.utils.Infraction;
import tp2.utils.Survey;

import java.util.List;

public class Guide6Solution implements Guide6 {

    @Override
    public int exercise_1_a(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int[] a, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_e(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int[] a) {
        int counter = 0;
        for(int i = 0; i < a.length; i += 2){
            if (a[i] % 2 == 1){
                counter += a[i];
            }
        }
        return counter;
    }

    @Override
    public int[] exercise_1_g(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_h(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_i(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_j(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_k(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_2(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_3(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] a) {
        int sum = 0;
        boolean isGaspariforme = true;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if (sum == 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < i; j++) {
                    sum += a[j];
                }
                if (sum < 0) {
                    isGaspariforme = false;
                    break;
                } else {
                    sum = 0;
                }
            }
        } else {
            isGaspariforme = false;
        }
        return isGaspariforme;
    }

    @Override
    public List<Integer> exercise_5_a(Infraction[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_5_b(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_5_c(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_6(int[] infraction) {
        int[] s = new int[infraction.length];
        for (int i = 0; i < infraction.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += infraction[j];
            }
            s[i] = sum;
        }
        return s;
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        int counterOfFiction = 0;
        int counterOfWomenWhoReadsFiction = 0;
        for (Survey survey: surveys){
            if (survey.type == 1){
                counterOfFiction++;
                if (survey.sex == 2){
                    counterOfWomenWhoReadsFiction++;
                }
            }
        }
        return (double) counterOfWomenWhoReadsFiction/counterOfFiction;
    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        int counter = 0;
        for (Survey survey: surveys){
            counter += survey.age;
        }
        return (double)counter/surveys.length;
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        int counter = 0;
        for (Survey survey: surveys){
            if (survey.age > 21 && survey.type == 2){
                counter++;
            }
        }
        return counter;
    }
}
