public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        }
        return "Disponível";
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Java para Iniciantes";
        System.out.println(livro1.status());
        livro1.emprestar();
        System.out.println(livro1.status());
    }
}