package com.yuans.algorithm.sparsearray;

/**
 * 稀疏数组
 *
 * @author yuans
 * @create 2019-09-27-9:28
 */
public class SparseArray {

    public static void main(String[] args) {

        //创建一个11*11的原始数组，0表示空，1为黑子，2为蓝子
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[3][4] = 2;
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //数组转稀疏数组
        //1.稀疏数组有3列，行数遍历原数组不等于0的数据个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    sum++;
                }
            }
        }
        //2.遍历原有数组,将非0数据放入稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr[i][j];
                }
            }
        }

        //3.输出稀疏数组
        System.out.println();
        System.out.println("-----------输出稀疏数组-----------");
        for (int[] aSparseArray : sparseArray) {
            System.out.printf("%d\t%d\t%d\t", aSparseArray[0], aSparseArray[1], aSparseArray[2]);
            System.out.println();
        }

        //4.将稀疏数组还原成原数组
        //4.1读取稀疏数组第一行，得到原数组大小
        //4.2读取稀疏数组第二行，赋值给原数组
        int[][] chessArr2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            chessArr2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        System.out.println();
        System.out.println("-----------输出原数组-----------");

        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
