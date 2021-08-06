public class ListLinked<T> {
	protected Node<T> first;
	
	public ListLinked() {
		this.first=null;
	}
	
	public Node<T>getFirst(){
		return first;
	}
	
	public void setFirst(Node<T> first) {
		this.first=first;
	}
	
	boolean isEmpty() {
		return this.first==null;
	}
	
	public T search(T data) {
		Node<T> nodo=this.first;
		while(nodo!= null && !nodo.data.equals(data))
			nodo=nodo.getNext();
		if(nodo != null)
			return nodo.data;
		return null;
	}
	void insertFirst(T data) {
		this.first=new Node<T>(data, this.first);
	}
	
	public String toString() {
		String r="";
		Node<T> aux = this.first;
		while(aux!=null) {
			r=r+aux.getInfo();
			aux=aux.getNext();
		}
		return r;
	}

}
