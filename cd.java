public class CDs {
    String identificacao;
    String nome;
    String dataAquisicao;
    String Autores;
    String generoMusical;
    String nomeMusica;
    public CDs(String identificacao,String nome, String dataAquisicao,String Autores,String generoMusical,String nomeMusica){
        this.identificacao= identificacao;
        this.nome=nome;
        this.dataAquisicao=dataAquisicao;
        this.Autores=Autores;
        this.generoMusical=generoMusical;
        this.nomeMusica=nomeMusica;
    }
    public String getIdentificacao(){
        return identificacao;
    }
    public void setIdentificacao(String identificacao){
        this.identificacao=identificacao;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getDataAquisicao(){
        return dataAquisicao;

    }
    public void setDataAquisicao(String dataAquisicao){
        this.dataAquisicao=dataAquisicao;
;
    }
    public String getAutores(){
        return Autores;
    }
    public void setAutores(String Autores){
        this.Autores=Autores;
    }
    public String getGeneroMusical(){
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical){
        this.generoMusical=generoMusical;
    }
    public String getNomeMusica(){
        return nomeMusica;
    }
    public void setNomeMusica(String nomeMusica){
        this.nomeMusica=nomeMusica;
    }
    public String toString(){
        return "Identificação: " + identificacao + "\n Nome:" +nome + "\n Data de aquisição: "+ dataAquisicao+"\n Autores: "+Autores+"\n Genero musical: "+generoMusical+ "\n Nome da musica: "+ nomeMusica;
    }

}
