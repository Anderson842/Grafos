
public class Vertex<E>{
	protected E data;
	protected ListLinked<Edge<E>> listAdj;
	protected int label;
	protected Vertex<E>path;
	
	public Vertex (E data) {
		this.data=data;
		listAdj=new ListLinked<Edge<E>>();
	}
	
	public E getData() {
		return data;
	}
	public boolean equals(Object o) {
		if(o instanceof Vertex<?>) {
			Vertex<E> v=(Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
	public String toString() {
		return this.data+" --> "+this.listAdj.toString()+"\n";
	}

}
