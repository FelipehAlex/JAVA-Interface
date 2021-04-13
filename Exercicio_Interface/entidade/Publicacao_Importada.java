
package entidade;

public class Publicacao_Importada extends Publicacao {
    private String regiao_origem;    

    public Publicacao_Importada(){
    }
    
    public String getRegiaoOrigem(){
        return regiao_origem;
    }
    
    public void setRegiaoOrigem(String aRegiaoOrigem){
        this.regiao_origem = aRegiaoOrigem;
    }
    
    
    @Override
    public void calculaCusto(){
        if(this.getN_paginas() < 50){
            this.setCusto(0.3F * this.getN_paginas());
        }
        else{
            this.setCusto(0.4F * this.getN_paginas());
        }
        if(this.getRegiaoOrigem().equals("Europa")){
            this.setCusto(this.getCusto() + 100);
        }
    }
    
    @Override
    public void calculaImposto(){
        this.setImposto(0.2F * this.getCusto());
    }
}
