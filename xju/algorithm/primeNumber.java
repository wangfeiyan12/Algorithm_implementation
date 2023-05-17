package xju.algorithm;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println(getNumber(100));
    }

    public static int getNumber(int x) {
        // 埃氏筛选，中心指导思想是利用一个标记数组来减少筛检次数
        // 初始值设置为false，表示所有的值都预先确定为prime素数
        // 由于需要遍历从2到x共x-1个数，因此数组的长度定义为x-1
        boolean[] flag = new boolean[x - 1];
        int count = 0;

        // 对2到x的各个数进行遍历，
        for (int i = 2; i <= x; i++) {
            // 注意只有对质数，才以其为基数进行合数的搜寻
            if (!flag[i - 2]) {
                count++;
                for (int j = i * i; j <= x; j += i) {
                    flag[j - 2] = true;
                }
            }
        }

        return count;
    }
}
