public class EmissorRodoviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}
