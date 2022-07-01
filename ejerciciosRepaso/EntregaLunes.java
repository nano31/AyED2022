public class BuscadorCaminos(){
  Private Grafo<String> bosque;
  
  public BuscadorCaminos(Grafo<String> grafo){
    bosque = grafo;
  }
  
  public ListaGenerica<ListaGenerica<String>> recorridosSeguros(){
    ListaGenerica<ListaGenerica<String>> lista = null;
    ListaGenerica<ListaGenerica<String>> caminos = new ListaGenerica<ListaGenerica<String>>();
    boolean[] marca = new boolean[bosque.listaDeVertices().tamanio()];
    
    for(int i=1; i < bosque.listaDeVertices().tamanio(); i++){
      Vertice<String> vertice = marca[i];
      if(vertice.dato().equals("Casa Caperucita")){
        marca[i] = true;
        lista.agregarFinal(vertice.dato());
        dfsRecursivo(vertice,lista,camino,marca);
      }
    }
    return caminos;
  }
  
  private void dfsRecursivo(Vertice<String> origen,ListaGenerica<ListaGenerica<String>> lista,ListaGenerica<ListaGenerica<String>> caminos, boolean[] marca){
    ListaGenerica<Arista<String> ady = origen.listaDeAdyacentes();
    ady.comenzar();
    while(!ady.fin()){
      Arista<String> arista = ady.proximo();
      Vertice<String> vDest = arista.verticeDestino();
      int j = vDest.posicion();
      if(!marca[j] && arista.peso < 5){
        lista.agregarFinal(vDest.dato());
        marca[j] = true;
        if(vDest.dato().equals("Casa Abuelita")){
          caminos.agregarFinal(lista.clonar());
        }else{
          dfsRecursivo(vDest,lista,caminos,marca);
        }
        marca[j] = false;
        lista.Eliminar(vDest);
      }
    }
  }
}
