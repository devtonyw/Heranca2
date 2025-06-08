package entidades;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void pagarMensalidade(){
        //System.out.printf("Pagando matricula do %s", this.nome); uso this por que esta protegido ou
        System.out.printf("\nPagando matricula do %s\n", getNome());
    }

}
