public class Operadores {
    private int resultado;
    private int num1;
    private int num2;
    private boolean status = true;

    //construtor
    public Operadores(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    
    //método get
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    public int getResultado(){
        return resultado;
    }


    //operadores de atribuição
    public void adicionando(){
        resultado = num1;
        resultado += num2;
    }

    public void removendo(){
        resultado = num1;
        resultado -= num2;
    }

    public void multiplicando(){
        resultado = num1;
        resultado *= num2;
    }


    //operador lógico !=
    public void dividindo(){
        if (num2 != 0) {
            resultado = num1;
            resultado /= num2;
        }else{
            System.out.println("Não é possível dividir por 0");
        }
    }


    //operadores de comparação
    public void maiorMenor(){
        if (num1 > num2) {
            System.out.println("O num1 é maior que o num2");
        }else if (num1 < num2) {
            System.out.println("O num1 é menor que o num2");
        }else{
            System.out.println("O num1 e o num2 são iguais");
        }
    }


    //operadores lógicos
    public void multiplicarSeDiferentes(int a, int b){
        if (a != b) {
            resultado = a * b;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else{
            System.out.println("Os números precisam ser diferentes para a operação ser feita");
        }
    }

    public void verificarConta(){
        if (status && num1 > 0 && num2 > 0){
            System.out.println("O status da conta está ativo e os números são maiores que 0");
        }else{
            System.out.println("O status da conta está inativo ou algum número não é maior que 0");
        }
    }
}