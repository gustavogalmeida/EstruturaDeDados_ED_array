package Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        Array array2 = new Array(10);

        //option1
        try {
            array.addV2("element 1");
            array.addV2("element 2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        array2.addV3("Test 1");
        array2.addV3("Test 2");
        array2.addV3("Test 3");
        array2.addV3("Test 4");
        System.out.println(array2.getSize());
        System.out.println(array2);
    }
}