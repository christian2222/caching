package SingleLinkedList;                                                                                                                                                                                                                                                                                                                                                                                                          
/**
 * 
 * @author C.Marquardt
 *                               
 * Diese Klasse repr�sentiert eine eine Node
 * einer Single Linked List.
 */
public class SLLNode {

    /**
     * �ber den Next-Zeiger werden die Elemente
     * der Liste miteinander verbunden
     */
    private SLLNode next;
    /**
     * als Inhalt ist ein beliebiges Object m�glich.
     * Zu beachten ist hierbei da� in Java alle Klassen !
     * die Object Klasse als Vaterklasse haben.
     * Hierdurch k�nnen aufgrund von Vererbungseigenschaften
     * und late binding Objekte einer beliebigen Klasse
     * in diese Liste eingef�gt werden.
     */
    private Object content;
    
    /**
     * 
     * @param o enthaltenes Objekt
     * @param next Zeiger auf weiteres Element
     */
    public SLLNode(Object o, SLLNode next) {
	this.content = o;
	this.next = next;
    }
    
    /**
     * 
     * @param o enthaltenes Object
     * 
     * der next Zeiger zeigt auf null und repr�sentiert
     * damit das Ende der Liste.
     */
    public SLLNode(Object o) {
	this.content = o;
	this.next = null;
    }
    
    
    // getters und Setters
    
    public SLLNode getNext() {
        return next;
    }
    public void setNext(SLLNode next) {
        this.next = next;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    
    
}