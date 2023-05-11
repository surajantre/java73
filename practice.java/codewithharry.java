public void display() {
    if (isEmpty())
        System.out.println("Queue is empty");
    else {
        for (int index = front; index & lt; = rear; index++) {
            System.out.println(arr[index]);
        }
    }
}
class Tester {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.dequeue();
        queue.dequeue();
        
        if (queue.isEmpty()) {
            queue.enqueue("4");
        } else {
            queue.dequeue();
        }
        queue.display();
    }
}
