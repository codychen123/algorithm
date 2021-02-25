package leetcode;

import java.util.Arrays;

/*
* 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
示例 1：
输入：[[1,1,0],[1,0,1],[0,0,0]]
输出：[[1,0,0],[0,1,0],[1,1,1]]
解释：首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/flipping-an-image
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class question_832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int iLength = A.length, jLength = A[0].length;
        for (int i = 0; i < iLength; i++) {
            if (jLength%2==1) {
                A[i][jLength/2] = (A[i][jLength/2]==1)?0:1;
            }
            for (int j = 0; j < jLength/2; j++) {
                int tempj = (A[i][j]==1?0:1);
                A[i][j] = (A[i][jLength - 1 - j]==1)?0:1;
                A[i][jLength - 1 - j] = tempj;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(res));
    }
}
