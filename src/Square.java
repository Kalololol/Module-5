public class Square extends Rectangle {
    //Korzystając z klasy Rectangle z poprzedniego ćwiczenia, napisz klasę Square, która odziedziczy po tej klasie i dodaj metodę odpowiedzialną za wyliczenie obwodu:
    //public int calculateDiameter();
    private int numA;
    public Square(int numA){
        this.numA = numA;
    }
    public Square(){}

    public void setNumA(int A){
        numA = A;
    }
    public int getNumA(){
        return numA;
    }
    public int calculateDiameter(){
        return 4 * numA;
    }
    @Override
    public int calculateArea(){
        return numA * numA;
    }

}
