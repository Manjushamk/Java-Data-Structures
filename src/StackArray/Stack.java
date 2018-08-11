package StackArray;

public class Stack<T>{
    private T[] stack;
    private int size;

    public Stack() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T data){
        if (size == this.stack.length){
            resize(2*this.stack.length);
        }
        this.stack[size++] = data;
    }

    private void resize(int capacity) {
        T[] stackCopy = (T[]) new Object[capacity];
        for(int i= 0; i< this.size; i++){
            stackCopy[i] = this.stack[i];
        }
        this.stack = stackCopy;
    }

    public T pop(){
        T popElement = this.stack[--size];
        if(this.size > 0 && this.size == this.stack.length/4){
            resize(stack.length/2);
        }
        return popElement;
    }

    public int size(){
        return this.size;
    }

    public T peek(){
        if(size != 0) return this.stack[size-1];
        return null;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
}

