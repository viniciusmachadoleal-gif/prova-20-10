public class EmissorAereo extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}
