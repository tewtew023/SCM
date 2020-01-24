/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdriver;

/**
 *
 * @author STD-PC
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape sphere = new Sphere(1);
        
        Shape cube = new Cube(5);
        
        
        System.out.println("Sphere area :"+sphere.area()+"  Sphere volume:"+sphere.volume());       
        System.out.println("Cube area :"+cube.area()+"  Cube volume:"+cube.volume());
        
        Stack stack = new StackImp();
        stack.push("item 1");
        stack.push("item 2");
        stack.push(8);
        stack.push(0.5);

        System.out.println("pop: "+stack.pop()); 
        System.out.println("top: "+stack.top());
        System.out.println("isEmpty: "+stack.isEmpty());
        System.out.println("Size: "+stack.size());
        System.out.println("Peek: "+stack.peek());
        

    }
    
}
