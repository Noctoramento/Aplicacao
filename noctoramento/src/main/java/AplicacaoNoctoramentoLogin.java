import java.util.Scanner;

public class AplicacaoNoctoramentoLogin {
    public static void main(String[] args) {
        AplicacaoNoctoramentoMetodos util = new AplicacaoNoctoramentoMetodos();
        Scanner input = new Scanner(System.in);

        Boolean loginRealizado = false;

        do {
            System.out.println("Insira seu email:");
            String email = input.nextLine();
            // Variável onde será salvo o email do usuário

            System.out.println("Insira sua senha:");
            String senha = input.nextLine();
            // Variável onde será salva a senha, contendo pelo menos:
            // 8 caractéres, 1 caractere especial, 1 número e uma letra maiúscula

            if (util.confirmarLogin(email, senha) == true) {
                loginRealizado = true;
            }
        } while (loginRealizado == false);
        // Loop do login, fazendo com que o usuário fique "preso" até inserir email e senha cadastrados

        System.out.println("""
                \nLogin realizado com sucesso!
                Seja bem-vindo(a)""");
    }
}
