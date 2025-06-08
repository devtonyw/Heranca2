import entidades.*;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); erro
        //Visitante v1 = new Visitante(); liberado
        //v1.setNome("Pedro");
        //1.setIdade(21);
        //v1.setSexo("M");
        //System.out.printf(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setMatricula(112);
        a1.setCurso("Info");
        a1.setIdade(13);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubi");
        b1.setMatricula(2123);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Kleber");
        p1.setIdade(55);
        p1.setSexo("M");
        p1.setSalario(1250.0f);
        p1.receberAumento(200.0f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Kleber");
        t1.setIdade(55);
        t1.setSexo("M");
        t1.setRegistroProf("Informarica");
        t1.praticar();
    }
}