/*
package 未分类;

import java.util.LinkedList;

public class T2_两数相加 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        LinkedList<Integer> l4 = new LinkedList<Integer>();
        int sum = 0;
        int sum1 = 0;
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println("=====================");
        for (int i = 0; i < l1.size(); i++) {
            Integer first = l1.get(l1.size() - i - 1);
            System.out.println(first);
            l3.addFirst(first);
            sum = (int) (sum + Math.pow(10, ((l1.size() - i - 1))) * first);
        }
        System.out.println(l3);
        for (int i = 0; i < l2.size(); i++) {
            Integer first = l2.get(l2.size() - i - 1);
            System.out.println(first);
            l4.addFirst(first);
            sum1 = (int) (sum1 + Math.pow(10, ((l2.size() - i - 1))) * first);

            sum+sum1
        }


    }

}

*/
