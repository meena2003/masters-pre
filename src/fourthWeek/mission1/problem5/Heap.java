package fourthWeek.mission1.problem5;

public class Heap {
    private Heapify heapify;

    public Heap(Heapify heapify) {
        this.heapify = heapify;
    }

    public void insertHeap(int value) {
        heapify.insertHeap(value);
    }

    public int deleteHeap() {
        return heapify.deleteHeap();
    }

    public void printHeap() {
        heapify.printHeap();
    }

    public int getHeapSize() {
        return heapify.getHeapSize();
    }
}
