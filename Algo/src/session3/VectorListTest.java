package session3;

public class VectorListTest {
    public static void main(String[] args) {
        VectorList vectorList = new VectorList();
        vectorList.add(1);
        vectorList.add(2);
        vectorList.add(2);
        vectorList.add(3);
        vectorList.add(3);
        vectorList.add(3);
        vectorList.add(4);
        vectorList.add(4);
        vectorList.add(4);
        vectorList.add(7);
        vectorList.add(5);
        vectorList.add(8);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.remove(1);
        System.out.println(vectorList);
    }
}