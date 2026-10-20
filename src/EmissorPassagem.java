import java.text.NumberFormat;
import java.util.Locale;

public abstract class EmissorPassagem {
    
    public final void emitir(String nomePassageiro, double valorTarifa) {
        if (nomePassageiro == null || nomePassageiro.isBlank()) {
            throw new IllegalArgumentException("O nome do passageiro é obrigatório.");
        }
        if (valorTarifa < 0) {
            throw new IllegalArgumentException("A tarifa não pode ser negativa.");
        }

        Passagem passagem = criarPassagem(nomePassageiro, valorTarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        System.out.println("=== Resumo da emissão ===");
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getNomePassageiro());
        System.out.println("Tarifa: " + moeda.format(passagem.getValorTarifa()));
        System.out.println("Taxa de embarque: " + moeda.format(taxa));
        System.out.println("Documentos exigidos: " +
            String.join(", ", passagem.getDocumentosExigidos()));
        System.out.println();
    }

    protected abstract Passagem criarPassagem(String nomePassageiro, double valorTarifa);
}
