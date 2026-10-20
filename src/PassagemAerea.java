import java.util.List;

public class PassagemAerea implements Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override public String getModal() { return "Aéreo"; }
    @Override public String getNomePassageiro() { return nomePassageiro; }
    @Override public double getValorTarifa() { return valorTarifa; }
    @Override public double calcularTaxaEmbarque() { return valorTarifa * 0.08; }
    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletrônico (e-ticket)");
    }
}
