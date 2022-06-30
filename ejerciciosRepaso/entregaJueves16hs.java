public class CaminoSinControles{
    private Grafo<String> mapa;

    public ListaGenerica<ListaGenerica<string>> devolverCaminos(Strign origen, String destino){
        ListaGenerica<ListaGenerica<String>> lista = null;
        ListaGenerica<ListaGenerica<String>> caminos = new ListaGenerica<ListaGenerica<String>>();
        boolean[] marca = new boolean[mapa.listaDeVertices().tamanio()];

        for(int i=1; i<= mapa.listaDeVertices().tamanio(); i++){
            Vertice<String> vertice = mapa.listaDeVertices().elemento(i);
            if(vertice.dato().equals(origen)){
                marca[vertice.posicion()] = true;
                lista.agregarFinal(vertice.dato());
                dfsRecursivo(vertice,destino,lista,caminos,marca);
            }
        }
        return caminos;
    }

    private void dfsRecursivo(Vertice<String> ciudad, String destino, ListaGenerica<ListaGenerica<String>> lista,
    ListaGenerica<ListaGenerica<String>> caminos, boolean[] marca){
        int peso;
        Vertice<String> vDest = null;
        Verice<String>> vert = marca[ciudad.posicion()].listaDeVertices().elemento(vert);
        ListaGenerica<Arista<String>> ady = marca[ciudad.posicion()].listaDeAdyacentes();
        ady.comenzar();
        
        while(!ady.fin()){
            Arista<String> arista = ady.proximo();
            int j = ady.proximo().getVerticeDestino().getPosicion();
            if(!marca[j]){
                peso = arista.getPeso();
                vDest = arista.getVerticeDestino();
                lista.agregarFinal(vDest);
                marca[j] = true;

                if(peso == 0 && ciudad.dato().equals(destino)){
                    caminos.agregarFinal(lista.clonar());
                }

                if(peso == 0){
                    dfsRecursivo(ciudad,destino,lista,caminos,marca);
                }
                lista.eliminar(vDest);
                marca[j] = false;
            }
        }
    }
}