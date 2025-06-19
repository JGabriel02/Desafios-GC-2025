import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaComparable implements Comparable<TarefaComparable> {
    String titulo;

    public TarefaComparable(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(TarefaComparable outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }


    public static void main(String[] args) {
        List<TarefaComparable> tarefas = new ArrayList<>();
        tarefas.add(new TarefaComparable("Estudar"));
        tarefas.add(new TarefaComparable("Almoçar"));
        tarefas.add(new TarefaComparable("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}