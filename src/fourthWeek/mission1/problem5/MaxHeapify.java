package fourthWeek.mission1.problem5;

import java.util.NoSuchElementException;

public class MaxHeapify extends Heapify {

    @Override
    protected void swiftUp(int targetIdx, int target) {
        while (targetIdx > 0) {
            int parentIdx = getParentIndex(targetIdx);
            int parentVal = heap[parentIdx];

            if (target - parentVal <= 0) {
                break;
            }
            heap[targetIdx] = parentVal;
            targetIdx = parentIdx;
        }

        size++;
        heap[targetIdx] = target;
    }

    @Override
    protected void swiftDown(int parentIdx, int target) {
        heap[parentIdx] = null;
        size--;
        int childIdx;

        while ((childIdx = getLeftChildIndex(parentIdx)) < size) {
            int rightChildIndex = getRightChildIndex(parentIdx);
            int childVal = heap[childIdx];

            if (rightChildIndex < size && childVal - heap[rightChildIndex] < 0) {
                childVal = heap[rightChildIndex];
                childIdx = rightChildIndex;
            }

            if (target - childVal >= 0) {
                break;
            }

            heap[parentIdx] = childVal;
            parentIdx = childIdx;
        }

        heap[parentIdx] = target;
    }

    @Override
    protected void printHeap() {
        System.out.print("Max Heap : ");
        for (Integer value : heap) {
            if (value == null) {
                continue;
            }
            System.out.print("[" + value + "] ");
        }
        System.out.println();
    }
}