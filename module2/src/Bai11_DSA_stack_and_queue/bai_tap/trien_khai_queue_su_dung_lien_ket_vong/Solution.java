package Bai11_DSA_stack_and_queue.bai_tap.trien_khai_queue_su_dung_lien_ket_vong;

public class Solution {

    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;

        else
            q.rear.link = temp;

        q.rear = temp;
        q.rear = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Quêu is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Các phần tử trong hàng đợi hình tròn là: ");
        while (temp.link != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
