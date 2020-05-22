package src.InheritanceLab.StackOfString;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String>data=new ArrayList<>();

    private ArrayDeque<String>save=new ArrayDeque<>();

    public void push(String item){
        save.push(item);
    }
    public String pop(){
        return save.pop();
    }
    public String peek(){
        return save.peek();
    }
    public boolean isEmpty(){
        return save.isEmpty();
    }
}
