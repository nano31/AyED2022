public class Recorridos(){
    public void dfs(Grafo<T> grafo){
        boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()]; //arreglo donde se marca si el vertice esta visitado o no
        for (int i = 1; i <= grafo.listaDeVertices().tamanio(); i++){ //se recorre el arreglo de vertices
            if(!marca[i]){
                this.dfs(i,grafo,marca); //si el vertice actual no esta visitado, se ejecuta el dfs recursivo
            }
        }
    }

    private void dfs(int i;Grafo<T> grafo,boolean[] marca){
        marca[i] = true; //pone el vertice actual en true, es decir, lo marca como visitado en el arreglo
        Vertice<T> v = grafo.listaDeVertices().elemento(i); //tomo el vertice
        ListaGenerica<Arista<T>> ady = grafo.listaDeAdyacentes(v); //se crea una lista de los adyacentes del vertice actual
        ady.comenzar();
        while(!ady.fin()){
            int j = ady.proximo().getVerticeDestino().getPosision(); //mientras no se termine la lista, se obtiene la pos del prox vertice ady
            if(!marca[j]){
                this.dfs(j,grafo,marca); //si el vertice no esta visitado, se llama recursivamente al metodo privado del dfs
            }
        }
    }
    //dfs almacenando costos y vertice
    public ListaEnlazadaGenerica<Vertice<T>> dfsGuardaVertices(Grafo<T> grafo){
        int costo = 0; //se inicializa siempre en el metodo publico, ya que nos aseguramos que se vaya modificando correctamente
        boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()];
        ListaEnlazadaGenerica<Vertice<T>> Recorridos = new ListaEnlazadaGenerica<Vertice<T>>();
        ListaEnlazadaGenerica<Vertice<T>> lis = null;
        for (int i=1 ; i <= grafo.listaDeVertices().tamanio();i++){
            lis = new ListaEnlazadaGenerica<Vertice<T>>();
            marca[i] = true;
            lis.agregarInicio(grafo.listaDeVertices().elemento(i));
            this.dfsRecur(i,grafo,marca,costo);
            marca[i] = false;
        }
        return Recorridos;
    }

    private void dfsRecur(int i, Grafo<T> grafo,ListaEnlazadaGenerica<Vertice<T>> lis,ListaEnlazadaGenerica<Vertice<T>> Recorridos, boolean[] marca, int costo){
        int peso;
        Vertice<T> vDestino = null;
        Vertice<T> v = grafo.listaDeVertices().elemento(v);
        ListaGenerica<Arista<T>> ady = grafo.listaDeAdyacentes(V); 
        ady.comenzar();
        while(!ady.fin()){
            Arista<T> arista = ady.proximo();
            int j = ady.proximo().getVerticeDestino().getPosision();
            if(!marca[j]){
                peso = arista.getPeso();
                if(costo+peso <= 10){
                    vDestino = arista.getVerticeDestino();
                    lis.agregarFinal(vDestino);
                    marca[j] = true;
                    if(costo+peso == 10){
                        lis.clonar(Recorridos);
                    }else{
                        this.dfsRecur(j,grafo,lis,marca,costo);
                    }
                }
                lis.eliminar(vDestino);
                marca[j] = false;
            }
            
        }
    }
    
}