/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.unam.edd1358;

/**
 *
 * @author aramy
 */
public class LinkedListADT {
    private class Nodo<T>{
        T data;
        Nodo next;
        
        public Nodo ( T valor){
            this.data = valor;
        }
        
        public Nodo ( T valor , Nodo siguiente ){
            this.data = valor;
            this.next = siguiente;
        }
    }
    
    
    private Nodo head;
    
    public LinkedListADT() {
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public Nodo getTail() {
        Nodo curr_node = this.head;
        if(!this.isEmpty()){
           while (curr_node.next != null) {
               curr_node = curr_node.next;
           }
        }
        return curr_node;
    }
    
    public void append(Object valor ){
        if( this.isEmpty() ){
            this.head = new Nodo(valor);
        }else{
            this.getTail().next = new Nodo(valor);
        } 
    }
    
    public void transversal(){
        Nodo currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.data + " -->");
            currNode = currNode.next;
        }
        System.out.println("");
    }
}
 
