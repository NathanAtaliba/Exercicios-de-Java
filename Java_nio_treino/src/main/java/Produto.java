public class Produto
{
    private String nome;
    private String descricao;
    private float valor;
    private int quantidade;
    public int getQuantidade(){return this.quantidade;}
    public void setQuantidade(int quantidade){quantidade = this.quantidade;}
    public String getNome(){return this.nome;}
    public String getDescricao(){return this.descricao;}
    public float getValor(){return this.valor;}
    public void setNome(String nome){this.nome =  nome;}
    public void setDescricao(String descricao){this.descricao = descricao;}
    public void setValor(float valor){this.valor = valor;}
    public String json(){

        return "nome: "+ this.nome +" /" + " Valor: " + this.valor+"\n";
    }
    public Produto(String nome,String descricao ,float valor,int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}