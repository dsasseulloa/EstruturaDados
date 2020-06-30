
class NoLista {
    private int info;
    private NoLista prox;

    public void setInfo(int info){
        this.info=info;
    }
    public Integer getInfo(){
        return this.info;
    }
    public void setProx(NoLista prox){
        this.prox=prox;
    }
    public NoLista getProx(){
        return this.prox;
    }
    public String toString(){
        return (getInfo() + " ");
    }

}

public class Lista {
    public Lista() {
    }

    private NoLista prim;

    public void Insere(int info) {
        NoLista no = new NoLista();
        no.setInfo(info);
        no.setProx(this.prim);
        this.prim = no;
    }

    public void Imprime() {
        NoLista p = this.prim;
        while (p != null) {
            System.out.print(p.getInfo()+" ");
            p = p.getProx();
        }

    }

    public String toString() {
        NoLista p = this.prim;
        String listastring = "";
        while (p != null){
            System.out.print(p.getInfo()+" ");
            p=p.getProx();
        }
        return listastring;
    }

    public boolean vazia() {
        if (this.prim == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista busca(int v) {
        NoLista p = this.prim;
        while (p != null) {
            if (p.getInfo() == v) {
                return p;
            }
            p = p.getProx();
        }
        return null;
    }

    public int comprimento() {
        NoLista p = this.prim;
        int contador = 0;
        while (p != null) {
            contador++;
            p = p.getProx();
        }
        return contador;
    }

    public NoLista ultimo() {
        NoLista p = prim;
        NoLista ant = null;
        int contador = 0;
        while (p != null) {
            int res = p.getInfo();
            ant=p;
            p=p.getProx();

        }
        return ant;
    }




    public void retira(int v) {

        NoLista[] nos = buscaComAnterior(v);

        if (nos == null){
            System.out.println("Elemento não pertence à lista");
        } else if (nos[0].getInfo() == null) {
            this.prim = nos[1].getProx();
        } else {
            nos[0].setProx(nos[1].getProx());
        }
    }

    public void libera() {
        this.prim = null;
    }

    public void insereOrdenado(int v) {
        NoLista ant = null;
        NoLista novo;
        NoLista p = prim;

        while (p != null && (int) p.getInfo() < (int) v) {
            ant = p;
            p = p.getProx();
        }

        novo = new NoLista();
        novo.setInfo(v);

        if (ant == null) {
            novo.setProx(prim);
            prim = novo;
        } else {
            novo.setProx(ant.getProx());
            ant.setProx(novo);
        }
    }

    public boolean igual(Lista l) {
        NoLista p1 = this.prim;
        NoLista p2 = l.prim;

        while (p1 != null && p2 != null) {
            if (p1.getInfo() != p2.getInfo()) {
                return false;
            }
            p1 = p1.getProx();
            p2 = p2.getProx();
        }
        return p1 == p2;
    }

    public void imprimeRecursivo() {
        imprimeRecursivoAux(prim);
    }

    private void imprimeRecursivoAux(NoLista p) {
        if (p != null) {
            System.out.print(p);
            imprimeRecursivoAux(p.getProx());
        }
    }

    public void retiraRecursivo(Object v) {
        prim = retiraRecursivoAux(prim, v);
    }

    private NoLista retiraRecursivoAux(NoLista l, Object v) {
        if (l != null) {
            if (l.getInfo() == v) {
                l = l.getProx();
            } else {
                l.setProx(retiraRecursivoAux(l.getProx(), v));
            }
        }
        return l;
    }

    public boolean igualRecursivo(Lista l) {
        return igualRecursivoAux(this.prim, l.prim);
    }

    private boolean igualRecursivoAux(NoLista p1, NoLista p2) {

        if (p1 == null && p2 == null) {
            return true;
        }
        if (p1 == null || p2 == null) {
            return false;
        }
        return (p1.getInfo() == p2.getInfo()
                && igualRecursivoAux(p1.getProx(), p2.getProx()));

    }

    public NoLista buscaRecursiva(Object v) {
        return buscaRecursivaAux(prim,v);
    }

    public NoLista buscaRecursivaAux(NoLista p, Object v){
        if (p == null) {
            return null;
        }
        if (p.getInfo() == v){
            return p;
        }
        return buscaRecursivaAux(p.getProx(), v);
    }

    public int comprimentoRecursivo() {
        NoLista p = prim;
        return comprimentoRecAux(p, 0);
    }

    private int comprimentoRecAux(NoLista p, int count) {
        if (p == null) {
            return count;
        }
        count++;
        return comprimentoRecAux(p.getProx(), count);
    }


    public NoLista ultimoRecursivo() {
        return ultimoRecursivoAux(prim, null);
    }

    private NoLista ultimoRecursivoAux(NoLista p, NoLista ant) {
        if (p == null) {
            return ant;
        }
        return ultimoRecursivoAux(p.getProx(), p);
    }

    public NoLista[] buscaComAnterior(int v) {
        NoLista ant = new NoLista();
        NoLista p = prim;
        NoLista[] nos = {ant, p};

        while (p != null) {
            if (p.getInfo() == v) {
                return nos;
            }
            nos[0] = p;
            nos[1] = p.getProx();
            p = nos[1];
        }
        return null;
    }

    public NoLista buscaPorPosicao(int i) {
        if (i >= comprimento()){
            return null;
        }
        return buscaPorPosicaoAux(i, 0);
    }
    public NoLista buscaPorPosicaoAux(int i, int k){
        if (k > i) {
            return null;
        }

        return buscaPorPosicaoAux(i, ++k);

    }


    public boolean insereEm(int posicao, int v){
        NoLista novo;
        NoLista ult;
        int tam = comprimento();

        if (posicao >= tam){
            ult = ultimoRecursivo();
            for(int i = tam; i < posicao;i++){
                ult.setProx(new NoLista());
                ult = ult.getProx();
            }
            novo = new NoLista();
            novo.setInfo(v);
            novo.setProx(null);
            ult.setProx(novo);
            return true;
        }

        if (posicao >= 0 && posicao < tam){
            novo = new NoLista();
            novo.setInfo(v);
            NoLista[] nos = buscaComAnterior(posicao);

            if(nos == null || nos[0] == null){
                novo.setProx(prim);
                prim = novo;
            } else {
                novo.setProx(nos[1].getProx());
                nos[1].setProx(novo);

            }
            return true;
        }

        return false;
    }
}


