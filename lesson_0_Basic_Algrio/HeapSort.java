package leetcode.lesson_0_Basic_Algrio;

public class HeapSort {
    public int[] data;
    public int count;

    public void exch(int a, int b){
        int tmp  = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    public void swim(int k){
        while (k > 1 && data[k/2] < data[k]){
            exch(k/2, k);
        }
    }

    public void sink(int k){
        while (2*k <= count){
            int j = 2 * k;
            if (j + 1 <= count && data[j] < data[j + 1]) j ++;
            if (data[j] <= data[k]) break;
            exch(k,j);
            k = j;
        }
    }

    public int size(){
        return count;
    }

}
