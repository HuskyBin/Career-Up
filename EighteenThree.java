/*
Reservoir Sampling
*/

import java.util.Random;

public class EighteenThree {
    public int[] generateSampling(int[] A, int m) {
        if (A == null || A.length <= m || m <= 0) {
            return A;
        }

        int[] subSet = new int[m];
        generateSamplingCore(A, A.length - 1, m);
        for (int i = 0; i < m; i++) {
            subSet[i] = A[i];
        }
        return subSet;
    }

    private void generateSamplingCore(int[] A, int index, int m) {
        if (index == 0) {
            return;
        }
        if (index + 1 == m) {
            return;
        }
        generateSamplingCore(A, index - 1, m);
        int randomIndex = new Random().nextInt(index + 1);
        if (randomIndex < m) {
            int temp = A[randomIndex];
            A[randomIndex] = A[index];
            A[index] = temp;
        }
    }

    public int[] generateSamplingLoop(int[] A, int m) {
        if (A == null || A.length < m || m <= 0) {
            return A;
        }
        int[] subSet = new int[m];
        for (int i = 0; i < m; i++) {
            subSet[i] = A[i];
        }
        for (int i = m; i < A.length; i++) {
            int randomIndex = new Random().nextInt(i + 1);
            if (randomIndex < m) {
                subSet[randomIndex] = A[i];
            }
        }
        return subSet;
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        EighteenThree obj = new EighteenThree();
        int[] result = obj.generateSamplingLoop(A, 5);
        for (int i : result) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
