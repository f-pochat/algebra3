package tp3.utils;

public class VectorDouble {
    private double[] vector;
    private int counter;

    public VectorDouble(double[] vector) {
        this.vector = vector;
    }

    public double getValue(int i) {
        counter += 1;
        return vector[i];
    }

    public double[] getVector() {
        return vector;
    }

    public int getCounter() {
        return counter;
    }

    public int getVectorSize() {
        return vector.length;
    }

    public VectorDouble subsractVectors(VectorDouble toSubsract){
        double[] result = new double[getVectorSize()];
        for (int i = 0; i < getVectorSize(); i++) {
            result[i] = getValue(i) - toSubsract.getValue(i);
        }
        return new VectorDouble(result);
    }

    public void addVectors(VectorDouble toAdd){
        double[] result = new double[getVectorSize()];
        for (int i = 0; i < getVectorSize(); i++) {
            result[i] = getValue(i) + toAdd.getValue(i);
        }
        vector = result;
    }

    public double escalarProd(VectorDouble toMultiply){
        double result = 0;
        for (int i = 0; i < getVectorSize(); i++) {
            result += getValue(i)*toMultiply.getValue(i);
        }
        return result;
    }

    public double squaredModule(){
        double result = 0;
        for (int i = 0; i < getVectorSize(); i++) {
            result += getValue(i)*getValue(i);
        }
        return result;
    }

    public VectorDouble productByScalar(double k){
        double[] result = new double[getVectorSize()];
        for (int i = 0; i < getVectorSize(); i++) {
            result[i] = getValue(i)*k;
        }
        return new VectorDouble(result);
    }

}
