public class Livros {
    String identificacao;
    String nome;
    String dataAquisicao;
    String Autores;
    String nomeEditora;
    int anoPublicacao;
    public Livros(String identificacao,String nome, String dataAquisicao,String Autores,String nomeEditora,int anoPublicacao){
        this.identificacao= identificacao;
        this.nome=nome;
        this.dataAquisicao=dataAquisicao;
        this.Autores=Autores;
        this.nomeEditora=nomeEditora;
        this.anoPublicacao=anoPublicacao;
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
    public String getNomeEditora(){
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora){
        this.nomeEditora=nomeEditora;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao=anoPublicacao;
    }
public String toString(){
        return "Identificação: " + identificacao + "\n Nome:" +nome + "\n Data de aquisição: "+ dataAquisicao+"\n Autores: "+Autores+"\n Nome da editora: "+ nomeEditora+"\n Ano de publicação: "+anoPublicacao;
    }
}

