package Array;

public class Array {
    private String[] elements;
    public Array(int size){
        this.elements = new String[size];
    }
    public void add(String element){
        for (int i = 0; i <= this.elements.length; i++){
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
    }
}
