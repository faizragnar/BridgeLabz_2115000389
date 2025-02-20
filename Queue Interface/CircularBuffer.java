import java.util.*;
class CircularBuffer {
    int[] buffer;
    int size, start, end;
    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = start = end = 0;
    }
    public void insert(int value) {
        buffer[end] = value;
        end = (end + 1) % buffer.length;
        if (size < buffer.length) size++;
        else start = (start + 1) % buffer.length;
    }
    public List<Integer> getBuffer() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) list.add(buffer[(start + i) % buffer.length]);
        return list;
    }
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);
        System.out.println(buffer.getBuffer());
    }
}