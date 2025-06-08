package entidades;

public final class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.printf("\nRenovando bolsa de %s\n", getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.printf("%s é bolsista! Pagamento facilitado", getNome());
    }
}
