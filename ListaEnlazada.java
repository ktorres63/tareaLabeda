import java.util.*;

public class ListaEnlazada<E>  {

    private class Enlace{
        public E valor;
        public Enlace siguiente;
        
        
        public Enlace(E val, Enlace sig){	//constructor
            this.valor = val;
            this.siguiente = sig;
        }
    }
    
    private Enlace cabeza;
    
    //constructor
    public ListaEnlazada(){
        this.cabeza = null;
    }
    
    public boolean EstaVacio(){
        return this.cabeza==null;
    }
    
   
    public E valorCabeza(){
        return this.cabeza.valor;
    }

    public boolean contiene(E elemento){
        Enlace actual = this.cabeza;
        while(actual !=null){
            if (actual.valor.equals(elemento)){
                return true;
            }
            else {
                actual=actual.siguiente;
            }
        }
        return false;
    }

   
    public E ObtenerValor(){
        return cabeza.valor;
    }
    public void Agregar(E elemento){
        this.cabeza = new Enlace(elemento, this.cabeza);
    }
    
    public void Remover() throws IllegalStateException{
        if (this.cabeza == null){
            throw new IllegalStateException();
        }
        else {
            this.cabeza = this.cabeza.siguiente;
        }
    }
   
    public int Longitud(){
        Enlace actual = this.cabeza;
        int cantidad = 0;
        while (actual != null){
            actual = actual.siguiente;
            cantidad += 1;
        }
        return cantidad;
    }
    public void InsertToBegin(E elemento) {    	//inserta el elemento x al inicio de la lista.
    	//cabeza es el ultimo elemento
    	//borrar todo y llenar otravez, no funciona 
    	//con un arraylist es posible :) guardo en el arraylist mientras borro la lista enlazada
    	this.Insert(elemento, 0);
    	
    }
    public void Insert(E element, int k) {      // inserta el elemento "element" en la k-ésima posición de la lista.
    	
    	int tam=this.Longitud();
    	ArrayList<E> aux3=new ArrayList<E>();
    	//crear un if x si es 0
    	Enlace actual = this.cabeza;
    	
        for(int i=0;i<tam;i++) {
        	aux3.add(actual.valor);
        	this.Remover();
        	actual=actual.siguiente;
    	}
    	
    	Collections.reverse(aux3);
    	
    	
    	for(int i=0;i<k;i++) {
    		this.Agregar(aux3.get(i));
    	}
    	this.Agregar(element);
    	
    	for(int i=k;i<tam;i++) {
    		this.Agregar(aux3.get(i));
    	}
    	
    }
    public E SearchFor(int k) {	//devuelve el k-ésimo elemento de la lista
    	//crear otra listaenlazada clonar y remover hasta hallar el valor q quierp.
    	//x ahora solo funciona con un arrayList :c
    	ArrayList<E> aux3=new ArrayList<E>();
    	int tam=this.Longitud();
    	
    	Enlace actual = this.cabeza;
    	
         for(int i=0;i<tam;i++) {
        	aux3.add(actual.valor);
         	actual=actual.siguiente;
     	}
       
    	Collections.reverse(aux3);
    	
		return aux3.get(k);
		//deberia crear una excepcion para capturar el error de enviar un k invalido
    }
    public void printList() {
    	int tam=this.Longitud();  
    	for(int i=0;i<tam;i++) {
    		System.out.println(this.SearchFor(i));
    	}
    }
    public void InserttoMidle(E element) {
    	int tam=this.Longitud();
    	int middle=tam/2;
    	
		this.Insert(element, middle);

    	
    }
    public void ObtainNumbersMultipleN( int n) {
    	Enlace actual = this.cabeza;
    	int tam=this.Longitud();
    	
        for(int i=0;i<tam;i++) {
        	
        	if((Integer)(actual.valor)%n==0 ) {
        		System.out.println(actual.valor);
        	}
        	actual=actual.siguiente;
    	}
    	
    }
    public <E extends User> void  BuildUserAccessCode() {
    	Enlace actual = this.cabeza;
    	int tam=this.Longitud();
    	
    	
        for(int i=0;i<tam;i++) {
        	System.out.println(actual.valor);
        	
        	actual=actual.siguiente;
    	}
    }
 
}
