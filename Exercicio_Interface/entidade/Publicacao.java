package entidade;

public class Publicacao implements Produto {

    protected String titulo;
    protected int codigo;
    protected int n_paginas;
    protected float custo;
    protected float imposto;

    public Publicacao() {
     
    }

    public Publicacao(String um_livro_ai, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Publicacao(String um_livro_ai, int i, double d, String regia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String aTitulo) {
        this.titulo = aTitulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int aCodigo) {
        this.codigo = aCodigo;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int aN_paginas) {
        this.n_paginas = aN_paginas;
    }

    public float getCusto() {
        return custo;
    }
    
    public void setImposto(float aImposto){
        this.imposto = aImposto;
    }
     
    public float getImposto(){
        return imposto;
    }
    
    public void setCusto(float aCusto) {
        this.custo = aCusto;
    }
    @Override
    public void calculaCusto(){
        if(getN_paginas() > 200){
            this.setCusto(0.85F * this.getN_paginas());
        }
        else{
            this.setCusto(0.2F * this.getN_paginas());
        }
        
    }
    
    @Override
    public void calculaImposto(){
        this.setImposto(0.1F * this.getCusto());
    }

}
