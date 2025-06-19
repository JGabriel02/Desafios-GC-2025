import java.util.ArrayList;

public class RemoveArray {
    public static void main(String[] args) {
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00"); // Índice 0
        horarios.add("10:00"); // Índice 1
        horarios.add("12:00"); // Índice 2
        horarios.remove(1);     // Remove "10:00"
        horarios.add("14:00");  // Adiciona ao final

        System.out.println(horarios.get(1));
    }
}
