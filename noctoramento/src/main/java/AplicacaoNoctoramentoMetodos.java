public class AplicacaoNoctoramentoMetodos {
    Boolean confirmarLogin(String email, String senha) {
        Boolean loginRealizado = false;
        if (senha.length() >= 8) {
            if (email.equals("fernanda.caramico@sptech.school") && senha.equals("C@ramic0")) {
                loginRealizado = true;
            } else {
                System.out.println("\nEmail e/ou senha incorretos, tente novamente\n");
            }
        } else {
            System.out.println("\nSenha não cadastrada\n");
        }
        return loginRealizado;
    }
    // Aqui é onde validará o login do usuário

}
