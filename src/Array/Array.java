package Array;

import java.util.Arrays;

public class Array {
    private final String[] elements;
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
    public int getSize (){
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");

        for (int i=0; i<this.size-1; i++){
            str.append(this.elements[i]);
            str.append(", ");
        }
        if (size > 0){
            str.append(this.elements[this.size-1]);
        }
        str.append("]");

        return str.toString();
    }
}
