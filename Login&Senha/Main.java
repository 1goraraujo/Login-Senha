import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        teclado
        Scanner teclado = new Scanner(System.in);

//       variaveis
        String senhaUser = null;
        String nameUser = null;

//        solicitaç�o para o usuario

        System.out.println("BEM VINDO!");
        System.out.println("Digite 1 para fazer um cadastro:");

//        switch case
        int opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                System.out.println("---LOGIN DO USUARIO---");
                System.out.println("Digite seu E-mail: ");
                nameUser = teclado.next();
                System.out.println("Digite sua senha: ");
                senhaUser = teclado.next();
            default:
        }
        if(nameUser.equals("igor@hotmail.com") && senhaUser.equals("12345")){
            System.out.printf("Usuário logado com sucesso.");
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}