package StackActivity;
import java.util.ArrayList;
import java.util.Stack;

public class MyStack {
    ArrayList <Integer> numbs = new ArrayList<>();
    void push(int element){
        numbs.add(element);
    }
    int pop(){
        numbs.remove(numbs.size() -1);
        System.out.print(numbs.get(numbs.size()-1));
        return numbs.get(numbs.size() -1);
    }

    Object peek(){
        if(numbs.isEmpty()){
            return "Can not peek into empty stack";
        }else{
            return numbs.get(numbs.size()- 1);
        }
    }

    boolean isEmpty(){
        if (numbs.size() == 0){
            return true;
        }else{
            return false;
        }

    }

}












