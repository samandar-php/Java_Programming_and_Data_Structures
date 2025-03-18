package task10_5;

public class StackOfIntegers {
    private int[] elements;
    private int size;


    public StackOfIntegers() {
        elements = new int[16]; // Initial size
        size = 0;
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }


    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
