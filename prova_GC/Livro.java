package prova_GC;

public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }
    public String status(){
        if (emprestado){
            return  "indisponivel";
        }
        return "disponivel";
    }


}
