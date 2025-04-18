public class App {
    public static void main(String[] args) throws Exception {
        //objetos instanciados
        Operadores op = new Operadores(10, 5);
        Operadores op1 = new Operadores(7, 0);

        System.out.println("Operações matemáticas");
        op.adicionando();
        System.out.println("A soma é: " + op.getResultado());

        op.removendo();
        System.out.println("A subtração é: " + op.getResultado());
        
        op.multiplicando();
        System.out.println("A multiplicação é: " + op.getResultado());

        op1.dividindo();
        System.out.println("A divisão é: " + op1.getResultado());

        System.out.println("");

        System.out.println("Utilizando operadoes de comparação");
        op.maiorMenor();

        System.out.println("");

        System.out.println("Utilizando operadores lógicos");
        op.multiplicarSeDiferentes(3, 9);
        op1.verificarConta();
    }
}
