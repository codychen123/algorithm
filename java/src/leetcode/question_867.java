package leetcode;

import java.util.Arrays;

public class question_867 {
    public static void main(String[] args) {
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = transpose(test);
        System.out.println(Arrays.deepToString(res));
    }
    /**
     * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
     * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
     * 示例 1
     * 输入：matrix = [[1,2,3],
     *                [4,5,6],
     *                [7,8,9]]
     * 输出：         [[1,4,7],
     *                [2,5,8],
     *                [3,6,9]]
     * 示例 2：
     * 输入：matrix = [[1,2,3],
     *                [4,5,6]]
     * 输出：         [[1,4],
     *                [2,5],
     *                [3,6]]
     */
    public static int[][] transpose(int[][] matrix) {
        int iLength = matrix.length, jLength = matrix[0].length;
        int[][] newArray = new int[jLength][iLength];
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                newArray[j][i] = matrix[i][j];
            }
        }
        return newArray;
    }
}
