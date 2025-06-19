public class InstanciaUsuario {
    String nome;
    int idade;

    public InstanciaUsuario(String n, int i) {
        nome = n;
        idade = i;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' + ", idade: " + idade;
    };


    public static void main(String[] args) {
        InstanciaUsuario u = new InstanciaUsuario("João", 25);
        System.out.println(u);
    }
}

