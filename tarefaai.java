import javax.swing.JOptionPane;
public class tarefaai {
    public static void main(String[] args) {
        int resultado;
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número: ");

        int num1 = Integer.parseInt(primeiroNumero);
        int num2 = Integer.parseInt(segundoNumero);
        String operador = JOptionPane.showInputDialog("+, -, *, /");
        char operacao = operador.charAt(0);

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '/') {
            resultado = num1 / num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido", "Calculadora", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, "O resultado é:" + resultado, "Calculadora", JOptionPane.PLAIN_MESSAGE);
    }
}