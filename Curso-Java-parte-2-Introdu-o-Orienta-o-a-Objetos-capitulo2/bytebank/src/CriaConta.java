public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setTitular(new Cliente());
        
        primeiraConta.getTitular().setNome("Flávio Dias");
        
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        System.out.println("referenciar: " + primeiraConta.getTitular().getNome());
        System.out.println("referenciar: " + primeiraConta.getTitular());
    }

}