package leetcode.queue;

public class ArrayQueue {
    int [] arr;
    int head;
    int tail;
    int maxCapacity;


    public ArrayQueue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        arr = new int[this.maxCapacity];
        head = 0;
        tail = 0;
    }
    public boolean isFull(){
        return tail==maxCapacity;
    }
    public boolean isEmpty(){
        return head ==tail;
    }
    public void add(int n){
        if(!isFull()){
            arr[tail]=n;
        }
    }
    public int get(){
        if(isEmpty()){
            return  -1;
        }
        int result = arr[head];
        head++;
        return result;

    }
}
