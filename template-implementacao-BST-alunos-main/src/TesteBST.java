public class TesteBST {
    public static void main(String[] args) {
        BST arvore = new BST();
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(8);

        System.out.println("buscar(3): " + arvore.buscar(3));

        arvore.emOrdem();
        System.out.println("emOrdem: " + arvore.emOrdem);
    }
}