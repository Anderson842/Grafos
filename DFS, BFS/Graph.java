
public class Graph{
	 private final int max_verts = 20; // Número máximo de vértices
	 Vertex vertexList []; // colección Vertex - clase Vertex
	 private int adjMat [] []; // Matriz de adyacencia
	 private int nVerts; // tabla vertexList [] a continuación, registre el número de vértices
	 private Stack theStack; // Proceso de grabación de almacenamiento cuando se usa para dfs
	 private Queue theQueue;
	 
	public Graph(){
		vertexList = new Vertex[max_verts];
		adjMat = new int [max_verts][max_verts];
		 nVerts = 0; // Comienza desde 0
		for(int j=0; j<max_verts; j++)
			for(int k=0;k<max_verts; k++)
				 adjMat [j] [k] = 0; // Matriz de adyacencia - todo inicializado a 0;
		 theStack = new Stack (); // Inicializa la pila
	}
	
	 // Agrega un nuevo vértice al conjunto de vértices
	public void addVertex(char lab){
		 vertexList [nVerts ++] = new Vertex (lab); // El nuevo vértice (Vertex) inicializado por lab se almacena en el conjunto de vértices
	}
	
	 // Crea una nueva arista y establece una relación de adyacencia para cada vértice en la matriz de adyacencia
	public void addEdge(int start,int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	 // Para salida
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
 // ---- DFS algoritmo de búsqueda de profundidad primero -------------------------------------- --------------------------
	public void dfs(){
		 vertexList [0] .wasVisited = true; // Comienza desde el primer vértice y marca
		 displayVertex (0); // salida
		 theStack.push (0); // Empuje en la pila ----- Coloque el subíndice de vértice en la pila
		
		while(!theStack.isEmpty()){
			 int v = getAdjUnvisitedVertex_dfs (theStack.peek ()); // Se saca el índice de vértice en la parte superior de la pila
			if(v == -1){
				 // No hay una relación adyacente entre el vértice y el vértice superior de la pila, y la pila aparece
				theStack.pop();
			}else{
				 // Vértice existente y su relación de adyacencia, marca y salida, push
				vertexList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}		//end while
	}
	
	//
	
	public int getAdjUnvisitedVertex_dfs(int v){
		 for (int j = 0; j <nVerts; j ++) // atraviesa los vértices existentes, si hay una adyacencia con el vértice superior de la pila, devuelve su subíndice
			if(adjMat[v][j]==1 && vertexList[j].wasVisited == false)
				return j;
		 return -1; // Si no, return -1
	}	//end getAdjUnvisitedVertex()
 
 // ---- BFS algoritmo de búsqueda de profundidad primero -------------------------------------- --------------------------
 
	public void bfs(){
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theQueue.insert(0);
		int v2;
		
		while(!theQueue.isEmpty()){
			int v1 = theQueue.remove();
			while((v2 = getAdjUnvisitedVertex_bfs(v1))!=-1){
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				theQueue.insert(v2);
			}//end while
		}//end while(queue ont empty)
		
		for(int j=0;j<nVerts;j++)
			vertexList[j].wasVisited = false;
	}//end bfs
	
	public int getAdjUnvisitedVertex_bfs(int v){
		for(int j=0;j<nVerts;j++)
			if(adjMat[v][j]==1&&vertexList[j].wasVisited == false)
				return j;
		return -1;
	}//end getAdjUnvisitedVertex()
 
}