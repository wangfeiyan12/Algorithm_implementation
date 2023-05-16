// 此类用于实现：Dota2参议院

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Dota2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(); // create an ArrayList for the players and a match to fill in the
                                                 // details of.
        System.out.println("你在哪里");
    }

    public static String getWinner(String input) {
        // 首先需要将两个派别对应的字符想象成两个队列
        // 此代码的关键是将"删除人"等价为从从队列中取出头元素，并放在该该队列的末尾
        // 将宣布胜利等价为某一个队列变为空队列

        Queue<String> qr=new LinkedList<>();
        Queue<String> qd=new LinkedList<>(); // create two empty queues for the two teams to compete in.  They will be filled in the order they are given.

        // 首先需要根据输入String input对两个队列进行初始化
        n = input.

        return "R";
    }

}
