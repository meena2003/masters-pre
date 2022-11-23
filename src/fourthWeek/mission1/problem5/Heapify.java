package fourthWeek.mission1.problem5;

import java.util.NoSuchElementException;

public abstract class Heapify {
    private final int DEFAULT_CAPACITY = 10;

    protected Integer[] heap;
    protected int size;

    protected Heapify() {
        heap = new Integer[DEFAULT_CAPACITY];
    }
    protected abstract void printHeap();
    protected abstract void swiftUp(int size, int target);
    protected abstract void swiftDown(int size, int target);

    protected void resizeHeap(int newCapacity) {
        Integer[] newHeap = new Integer[newCapacity];
        System.arraycopy(heap, 0, newHeap, 0, size);
        heap = newHeap;
    }

    protected int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    protected int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    protected int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    protected void insertHeap(Integer value) {
        if (size == heap.length) {
            resizeHeap(heap.length * 2);
        }

        swiftUp(size, value);
    }

    protected int deleteHeap() {
        if (heap[0] == null) {
            throw new NoSuchElementException("가져올 원소가 없습니다.");
        }

        int rootNode = heap[0];
        int target = heap[size - 1];
        heap[size - 1] = null;

        swiftDown(0, target);

        return rootNode;
    }

    protected int getHeapSize() {
        return size;
    }
}
