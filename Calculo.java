import java.util.Scanner;

public class BancoAssalto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dinheiroPessoas = new int[10];
        int totalRoubado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade de dinheiro da pessoa " + (i + 1) + ": ");
            dinheiroPessoas[i] = scanner.nextInt();
        } 
        System.out.print("Digite a quantidade de dinheiro que o bandido confesso revelou: ");
        int dinheiroBandidoConfesso = scanner.nextInt();
        for (int valor : dinheiroPessoas) {
            if (valor % 10 == 0 && valor >= dinheiroBandidoConfesso) {
                totalRoubado += valor;
            }
        }

        System.out.println("O total roubado foi: " + totalRoubado + " reais");
    }
}
