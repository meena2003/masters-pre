package fourthWeek.mission1.problem5;

public class HeapSort {
    public static void main(String[] args) {
        System.out.println();
        Heap minHeap = new Heap(new MinHeapify());
        minHeap.insertHeap(80);
        minHeap.insertHeap(50);
        minHeap.insertHeap(70);
        minHeap.insertHeap(10);
        minHeap.insertHeap(60);
        minHeap.insertHeap(20);

        minHeap.printHeap();

        int n, data;
        n = minHeap.getHeapSize();
        for (int i = 1; i <= n; i++) {
            data = minHeap.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data);
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println();

        Heap maxHeap = new Heap(new MaxHeapify());
        maxHeap.insertHeap(80);
        maxHeap.insertHeap(50);
        maxHeap.insertHeap(70);
        maxHeap.insertHeap(10);
        maxHeap.insertHeap(60);
        maxHeap.insertHeap(20);

        maxHeap.printHeap();

        int n2, data2;
        n2 = maxHeap.getHeapSize();
        for (int i = 1; i <= n2; i++) {
            data2 = maxHeap.deleteHeap();
            System.out.printf("\n 출력 : [%d]", data2);
        }
    }
}
