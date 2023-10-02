public class Hexagon implements GeometricFigure{
    private int num;

    public Hexagon(){}
    public Hexagon (int num){
        this.num = num;
    }
    public void setNum(int numParam){
        num = numParam;
    }
    public int getNum(){
        return num;
    }
    @Override
    public int calculateArea() {
        return 6 * num * num ;
    }
}
