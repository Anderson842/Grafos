
public class Test {
	public static void main(String []args) {
	Graph<String> g= new Graph<String>();
	
	g.insertVertex("A");
	g.insertVertex("B");
	g.insertVertex("C");
	g.insertVertex("D");
	g.insertVertex("E");
	g.insertVertex("F");
	g.insertVertex("G");
	g.insertVertex("H");
	g.insertVertex("I");
	
	
	g.insertEdge("A", "B",18);
	g.insertEdge("B", "D",10);
	g.insertEdge("C", "E",8);
	g.insertEdge("G", "F",9);
	
	
	System.out.println(g);
	}
	

}
