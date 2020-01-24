/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriver;

import java.util.*;

/**
 * @inv isEmpty() implies elements.size() == 0
 */
public class StackImp implements Stack {
    private  Object peek;
    private final LinkedList elements = new LinkedList();
    @Override
    
    public void push(Object o) {
        if (o != null) {
            elements.add(o);
               peek=o;
        } else {
            throw new RuntimeException("");
        }
    }

    @Override
    public Object pop() {
        final Object popped = top();
        elements.removeLast();
        return popped;
    }

    @Override
    public Object top() {
        return elements.getLast();
    }

    @Override
    public boolean isEmpty() {
        return elements.size() == 0;
    }

    @Override
    public int size() {
        return elements.size();
    }
    
    @Override
    public Object peek(){
        return elements.peekFirst();
    }
}
