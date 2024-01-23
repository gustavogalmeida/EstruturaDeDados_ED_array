package Array;

public class Array {
    private String[] elements;
    private int size;
    public Array(int length){
        this.elements = new String[length];
    }
    public void addV1(String element){
        for (int i = 0; i <= this.elements.length -1; i++){
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
    }
    public void addV2 (String element) throws Exception{
        if (this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
        } else {
            throw new Exception("The Array is full. Cannot add new elements");
        }
    }
    public boolean addV3(String element){
        if(this.size < this.elements.length){
            elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
