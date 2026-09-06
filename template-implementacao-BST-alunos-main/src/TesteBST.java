public class TesteBST {
    public static void main(String[] args) {
        BST vazia = new BST();
        System.out.println("Vazia -> altura: " + vazia.altura() + ", contarNos: " + vazia.contarNos());

        BST umNo = new BST();
        umNo.inserir(5);
        System.out.println("1 nó -> altura: " + umNo.altura() + ", contarNos: " + umNo.contarNos());

        BST completa = new BST();
        int[] valores = {4, 2, 6, 1, 3, 5, 7};
        for (int v : valores) completa.inserir(v);
        System.out.println("7 nós -> altura: " + completa.altura() + ", contarNos: " + completa.contarNos());
    }
}