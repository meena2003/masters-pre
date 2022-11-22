package fourthWeek.mission1.problem5;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class Heap<E> {


    private Object[] array;

    public Heap() {
        this(null);
    }

    public Heap(Comparator<? super E> comparator) {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.comparator = comparator;
    }

    public Heap(int capacity) {
        this(capacity, null);
    }

    public Heap(int capacity, Comparator<? super E> comparator) {
        this.array = new Object[capacity];
        this.size = 0;
        this.comparator = comparator;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChild(int index) {
        return index * 2 + 1;
    }

    private int getRightChild(int index) {
        return index * 2 + 2;
    }

    private void resize(int newCapacity) {
        Object[] newArray = new Object[newCapacity];

        System.arraycopy(this.array, 0, newArray, 0, size);

        this.array = null;
        this.array = newArray;
    }

    public void insertHeap(E value) {
        if (size == array.length) {
            resize(array.length * 2);
        }

        siftUp(size, value);
        size++;
    }

    private void siftUp(int index, E value) {
        if (comparator != null) {
            siftUpComparator(index, value, comparator);
            return;
        }
        siftUpComparable(index, value);
    }

    private void siftUpComparator(int index, E target, Comparator<? super E> comp) {

        while (index > 0) {
            int parent = getParent(index);
            Object parentVal = array[parent];

            if (comp.compare(target, (E) parentVal) >= 0) {
                break;
            }
            array[index] = parentVal;
            index = parent;
        }
        array[index] = target;
    }

    private void siftUpComparable(int index, E target) {
        Comparable<? super E> comp = (Comparable<? super E>) target;

        while (index > 0) {
            int parent = getParent(index);
            Object parentVal = array[parent];

            if (comp.compareTo((E) parentVal) >= 0) {
                break;
            }
            array[index] = parentVal;
            index = parent;
        }
        array[index] = target;
    }

    public E deleteHeap() {
        if (array[0] == null) {
            throw new NoSuchElementException("힙에 원소가 없습니다.");
        }

        E rootNode = (E) array[0];
        E target = (E) array[size - 1];
        array[size - 1] = null;

        shipDown(0, target);


        return rootNode;
    }

    private void shipDown(int index, E target) {
        if (comparator != null) {
            shipDownComparator(index, target, comparator);
            return;
        }
        siftDownComparable(index, target);
    }

    private void shipDownComparator(int index, E target, Comparator<? super E> comp) {
        array[index] = null;
        size--;

        int parent = index;
        int child;

        while ((child = getLeftChild(parent)) <= size) {
            int right = getRightChild(parent);
            Object childVal = array[child];

            if (right <= size && comp.compare((E) childVal, (E) array[right]) > 0) {
                child = right;
                childVal = array[child];
            }

            if (comp.compare(target, (E) childVal) <= 0) {
                break;
            }
        }

        array[parent] = target;

        if (array.length > DEFAULT_CAPACITY && size < array.length / 4) {
            resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
        }
    }

    private void siftDownComparable(int index, E target) {
        Comparable<? super E> comp = (Comparable<? super E>) target;

        array[index] = null;
        size--;

        int parent = index;
        int child;

        while ((child = getLeftChild(parent)) <= size) {
            int right = getRightChild(parent);
            Object childVal = array[child];

            if (right <= size && ((Comparable<? super E>) childVal).compareTo((E) array[right]) > 0) {
                child = right;
                childVal = array[child];
            }

            if (comp.compareTo((E) childVal) <= 0) {
                break;
            }
            array[parent] = childVal;
            parent = child;
        }
        array[parent] = comp;

        if (array.length > DEFAULT_CAPACITY && size < array.length / 4) {
            resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
        }
    }

    public void printHeap() {
        StringBuilder sb = new StringBuilder();
        sb.append("Min Heap : ");
        for (Object element : array) {
            if (element == null) {
                continue;
            }
            sb.append("[" + (E) element + "] ");
        }
        System.out.println(sb);
    }

    public int getHeapSize() {
        return size;
    }
}
