public class EmissorFerroviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}
