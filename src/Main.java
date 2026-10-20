public class Main {
    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorAereo();
        EmissorPassagem emissorRodoviario = new EmissorRodoviario();
        EmissorPassagem emissorFerroviario = new EmissorFerroviario();

        emissorAereo.emitir("Ana Souza", 850.00);
        emissorRodoviario.emitir("Bruno Lima", 180.00);
        emissorFerroviario.emitir("Carla Mendes", 320.00);
    }
}
