public class Triangle implements GeometricFigure{
    private int numA;
    private int numB;
    public Triangle(){}
    public Triangle(int A, int B){
        this.numA = A;
        this.numB = B;
    }
    public void setNumA(int numParamA){
        numA = numParamA;
    }

    public int getNumA() {
        return numA;
    }
    public void setNumB(int numParamB){
        numB = numParamB;
    }

    public int getNumB() {
        return numB;
    }
    @Override
    public int calculateArea() {
        return (numA/2) * numB;
    }
}
