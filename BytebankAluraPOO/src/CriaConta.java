public class CriaConta {

    public static void main(String[] args) {
        Conta firstConta = new Conta(6646,969060);
        firstConta.deposita(200);
        System.out.println(firstConta.getSaldo());

        firstConta.deposita(100);
        System.out.println(firstConta.getSaldo());

        Conta secondConta = new Conta(6645,969061);
        secondConta.deposita(50);

        System.out.println("primeira conta tem " + firstConta.getSaldo());
        System.out.println("segunda conta tem " + secondConta.getSaldo());

        System.out.println("referenciar: " + firstConta);
    }

}