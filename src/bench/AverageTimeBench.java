package bench;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import Interfaces.IntKeyObject;
import Interfaces.Numerical;
import Sorts.CountingSort;
import Sorts.HeapSort;
import Sorts.LSDSort;
import Sorts.MergeSort;
import Sorts.QuickSort;
import Sorts.SortUtils;
import Sorts.ThreeWayQuickSort;

/**
 * Created by Nechaev Mikhail
 * Since 20/11/16.
 */

//@State(Scope.Benchmark)
//@BenchmarkMode(Mode.AverageTime)
//@OutputTimeUnit(TimeUnit.MICROSECONDS)
//@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
//@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
//@Fork(1)
    public class AverageTimeBench {

    Integer[][] data;
    Integer[] curr;
    IntKeyObject<Integer>[][] intKeyData;
    IntKeyObject<Integer>[] intKeyCur;
    Numerical[][] numericalData;
    Numerical[] numericalCur;
    int index;

    CountingSort countingSort = new CountingSort();
    HeapSort heapSort = new HeapSort();
    LSDSort lsdSort = new LSDSort();
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();
    ThreeWayQuickSort quick3 = new ThreeWayQuickSort();

//    @Setup(value = Level.Trial)
//    public void setUpTrial() {
//        data = new Integer[10][100];
//        intKeyData = new IntKeyObject[10][100];
//        numericalData = new Numerical[10][100];
//        for (int i = 0; i < 10; i++) {
//            define arrays here
//            data[i] = SortUtils.generateArray(100);
//            intKeyData[i] = SortUtils.generateArrayIntKeyObjects(100);
//            numericalData[i] = SortUtils.generateSimpleString(100);
//        }
//    }
//
//    @Setup(value = Level.Invocation)
//    public void setUpInvocation() {
//        curr = Arrays.copyOf(data[index], data[index].length);
//        intKeyCur = Arrays.copyOf(intKeyData[index], intKeyData[index].length);
//        numericalCur = Arrays.copyOf(numericalData[index], numericalData[index].length);
//        index = (index + 1) % 10;
//    }
//
//    @Benchmark
//    public void measureHeapSort() {
//        heapSort.sort(curr);
//    }
//
//    @Benchmark
//    public void measureQuickSort() {
//        quickSort.sort(curr);
//    }
//
//    @Benchmark
//    public void measureQuick3Sort() {
//        quick3.sort(curr);
//    }
//
//    @Benchmark
//    public void measureMergeSort() {
//        mergeSort.sort(curr);
//    }
//
//    @Benchmark
//    public void measureCountingSort() {
//        countingSort.sort(intKeyCur);
//    }
//
//    @Benchmark
//    public void measureLSDSort() {
//        lsdSort.sort(numericalCur);
//    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(AverageTimeBench.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
