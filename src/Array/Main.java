package Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(2);
        array.setSize(0);

        try {
            array.addV2("element 1");
            array.addV2("element 2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}