package entidades;

public final class Tecnico extends Aluno{
    private String registroProf;

    public String getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(String registroProf) {
        this.registroProf = registroProf;
    }

    public void praticar(){
        System.out.printf("\n%s esta \n", getNome());
    }
}
