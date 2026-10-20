import java.util.List;

public class PassagemFerroviaria implements Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override public String getModal() { return "Ferroviário"; }
    @Override public String getNomePassageiro() { return nomePassageiro; }
    @Override public double getValorTarifa() { return valorTarifa; }
    @Override public double calcularTaxaEmbarque() { return valorTarifa * 0.05; }
    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Comprovante de reserva");
    }
}
