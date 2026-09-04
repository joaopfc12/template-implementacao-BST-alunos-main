import java.util.LinkedList;

public class BST {
    public No raiz;
    public LinkedList<Integer> preOrdem;
    public LinkedList<Integer> emOrdem;
    public LinkedList<Integer> posOrdem;

    public BST() {
        this.raiz = null;
        this.preOrdem = new LinkedList<>();
        this.emOrdem = new LinkedList<>();
        this.posOrdem = new LinkedList<>();
    }

    public void inserir(Integer chave) {
        this.raiz = inserir(this.raiz, chave);
    }

    private No inserir(No no, Integer chave) {
    if (no == null) {
        return new No(chave);
    }

    if (chave < no.chave) {
        no.esquerda = inserir(no.esquerda, chave);
    } else if (chave > no.chave) {
        no.direita = inserir(no.direita, chave);
    }

    return no;
    }

    public void remover(Integer chave) {
        this.raiz = remover(this.raiz, chave);
    }

    private No remover(No no, Integer chave) {
        if (no == null) {
            return null;
        }

        if (chave < no.chave) {
            no.esquerda = remover(no.esquerda, chave);
        } else if (chave > no.chave) {
            no.direita = remover(no.direita, chave);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            } else {
                No sucessor = menorDireita(no.direita);
                no.chave = sucessor.chave;
                no.direita = remover(no.direita, sucessor.chave);
            }
        }

    return no;
}

    private No menorDireita(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    public void preOrdem() {
        preOrdem.clear();
        preOrdem(raiz);
    }
    
    private void preOrdem(No no) {
        if (no != null) {
            preOrdem.add(no.chave);
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void emOrdem() {
        emOrdem.clear();
        emOrdem(raiz);
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            emOrdem.add(no.chave);
            emOrdem(no.direita);
        }
    }

    public void posOrdem() {
        posOrdem.clear();
        posOrdem(raiz);
    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            posOrdem.add(no.chave);
        }
    }
}