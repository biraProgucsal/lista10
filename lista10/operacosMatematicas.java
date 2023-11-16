package Model;

public class OperacoesMatematicas {
    private int a, b, c;

    public OperacoesMatematicas(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int soma() {
        return a + b + c;
    }

    public int subtracao() { // Defina conforme a lógica desejada
        return a - b - c;
    }

    public int multiplicacao() {
        return a * b * c;
    }

    public float divisao() { // Atenção para divisão por zero
        if (b != 0 && c != 0) {
            return (float) a / b / c;
        }
        return 0; // ou outra lógica para erro
    }

    public int restoDivisao() { // Atenção para divisão por zero
        if (b != 0 && c != 0) {
            return a % b % c;
        }
        return 0; // ou outra lógica para erro
    }
}
