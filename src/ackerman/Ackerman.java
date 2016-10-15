/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ackerman;

import java.util.Stack;

/**
 *
 * @author dunkelheit
 */
public class Ackerman {

    
   public static int ack(int m, int n) {
       if (m == 0) {
           return n + 1;
       } else if(n == 0) {
           return ack(m-1, 1);
           
       } else {
          return ack(m - 1, ack(m, n -1));
       }
       
   }
   
   public static int ackIterativo(int m, int n){
    Stack<Integer> s = new Stack();
    s.add(m);
    while(!s.isEmpty()){
        m=s.pop();
        if(m==0)
            n++;
        else if(n == 0) {
            n = 1;
            s.add(m-1);
        }
        else {
            s.add(--m);
            s.add(++m);
            n--;
        }
    }
    return n;
}
   
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ackIterativo(4,1));
    }
    
}
