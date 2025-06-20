package prova_GC;
import java.rmi.registry.LocateRegistry;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class prova {

    public static void main(String[] args) {
        /*
        1
        LocalDate base = LocalDate.of(2025,6,1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());

        2

        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3)/5;
        if (media >= 7.0){
            System.out.println("aprovado");
        }else {
            System.out.println("revisar conteudo");
        }

        3 = classe separada

        4

        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7){
            System.out.println("tarefa critica");
        }else if (prioridade>3 || urgencia > 7){
            System.out.println("Tatefa importante");
        }else{
            System.out.println("Tarefa comun");
        }

        5

        int notificacoes = 0;

        for (int i = 1; i <= 5; i++){
            if (i % 2 == 0){
                notificacoes += 2;
            }else {
                notificacoes++;
            }
        }
        System.out.println(notificacoes);

        6

        ArrayList<String> horario = new ArrayList<>();
        horario.add("08:00");
        horario.add("10:00");
        horario.add("12:00");
        horario.remove(1);
        horario.add("14:00");
        System.out.println(horario.get(1));

        7 seguinte e em outra classe

        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";

        System.out.println("Título: " + l.titulo);
        System.out.println("Status: " + l.status());

        l.emprestar();
        System.out.println("Status após empréstimo: " + l.status());


        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);

        8 = outra classe

        9

        LocalDate data = LocalDate.of(2025,6,10);
        int diasUteis = 0;
        while (diasUteis < 7){
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() ==
            DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
                boolean feriado = data.equals(LocalDate.of(2025,6,15));

                if(!fimDeSemana && !feriado){
                    diasUteis++;
                }
        }
        System.out.println(data);

        10


        LocalTime envio = LocalTime.of(23,0);
        LocalTime limite = LocalTime.of(22,59);

        if (!envio.isBefore(limite)){
            System.out.println("Entrega fora do horario");
        }else{
            System.out.println("tarefa enviado com sucesso");
        }

        11 = fiz de cabeça

        12:
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("estudar Java");
        tarefas.add("Fazer exercicios");
        tarefas.add("Revisar codigo");

        for(String tarefa : tarefas){
            if (tarefa.contains("java")){
                System.out.println("tarefa de programação " + tarefa);
            }
        }

         */

    }
}



