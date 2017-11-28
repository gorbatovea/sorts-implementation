package Sorts;

import java.util.Comparator;

public class ThreeWayQuickSort<T> extends AbstractSortOnComparisons<T>{
    private final int TRASH_HOLD = 15;
    private final InsertionSort<T> nestedSort;

    public ThreeWayQuickSort(){
        super();
        nestedSort = new InsertionSort<>();
    }

    public ThreeWayQuickSort(Comparator<? super T> comparator){
        super();
        setComparator(comparator);
        nestedSort = new InsertionSort<>(comparator);
    }

    public void sort(T[] list){
        sort(list, 0, list.length - 1);
    }

    private void sort(T[] a, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, gt = hi;
        T v = a[lo];
        int i = lo;
        while (i <= gt) {
            int cmp = compare(a[i],v);
            if      (cmp < 0) swap(a, lt++, i++);
            else if (cmp > 0) swap(a, i, gt--);
            else              i++;
        }

        // a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
    }

}
