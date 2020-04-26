package leetcode.lesson_5_binaryTree;

public class ArrIsSeqOfBst {
    public boolean verfitySeqOfBst(int[] seq, int length) {
        if (seq == null || length <= 0) return false;
        int root = seq[length - 1];
        int i = 0;
        for (; i < length - 1; ++i) {
            if (seq[i] > root) break;
        }
        int j = i;
        for (; j < length - 1; ++j) {
            if (seq[j] < root) return false;
        }
        boolean left = true;
        if (i > 0)
            left = verfitySeqOfBst(seq, i);
        boolean right = true;
        if (i < length - 1)
            right = verfitySeqOfBst(seq, length - i - 1);
        return left & right;
    }
}