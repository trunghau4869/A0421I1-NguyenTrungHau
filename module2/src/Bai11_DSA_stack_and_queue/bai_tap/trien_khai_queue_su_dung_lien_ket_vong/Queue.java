package Bai11_DSA_stack_and_queue.bai_tap.trien_khai_queue_su_dung_lien_ket_vong;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.link = newNode;
        }
        rear = newNode;
        rear.link = front;
    }

    public int dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("Khong co phan tu");
        }
        Node temp = front;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
        return temp.data;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Hang doi rong");
        } else {
            Node temp = front;
            while (temp.link != front) {
                System.out.println(temp.data + " ");
                temp = temp.link;
            }
            System.out.println(temp.data);
        }
    }
}
