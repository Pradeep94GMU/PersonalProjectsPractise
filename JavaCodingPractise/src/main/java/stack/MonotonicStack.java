package stack;

import java.util.Arrays;

public class MonotonicStack {

    int top;
    int[] arr;
    int[] minArr;
    int size;
    int index;
    int minTop;
    int minVal;
    MonotonicStack(int size){
        this.size = size;
        arr = new int[size];
        minArr = new int[size];
        top = -1;
        index = 0;
        minTop = -1;

    }

    void display(){
        System.out.println(Arrays.toString(arr));
    }

    int push(int data){
        if(top >= size -1){
            System.out.println("Stack overflow");
            return -1;
        }
        top++;
        arr[top] = data;

       minVal = min(data);

        return data;
    }

    int minValue(){
        return minVal;
    }

    public int min(int data){
        if(minTop >= size -1){
            System.out.println("Stack overflow");
            return - 1;
        }
        minTop++;
        minArr[minTop] = data;
        Arrays.sort(minArr);

        return minArr[index++];


    }

    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return - 1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top];
    }


    boolean isEmpty(){
        if(top == -1){
            return true;
        }

        return false;
    }


}


class Main{
    public static void main(String[] args) {
        MonotonicStack monotonicStack = new MonotonicStack(5);

        monotonicStack.push(2);
        monotonicStack.push(5);
        monotonicStack.push(1);
        monotonicStack.push(12);
        monotonicStack.push(7);
        monotonicStack.push(2);

        //monotonicStack.display();

        System.out.println("Is Empty: "+monotonicStack.isEmpty());

        System.out.println(monotonicStack.peek());


        System.out.println("one item deleted "+monotonicStack.pop());
        System.out.println("peek value "+monotonicStack.peek());
        System.out.println("Min value in stack: "+monotonicStack.minValue());


    }
}
