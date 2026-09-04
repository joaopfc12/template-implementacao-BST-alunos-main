public class No {
    public Integer chave;
    public No esquerda;
    public No direita;

    public No(Integer valor) {
        this.chave = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
