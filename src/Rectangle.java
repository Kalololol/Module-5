public class Rectangle implements GeometricFigure{
    private int numA;
    private int numB;
    public Rectangle(){}
    public Rectangle(int numA, int numB)
    {
        this.numA = numA;
        this.numB = numB;
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
        return numA * numB;
    }
}
