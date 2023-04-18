public class Aplicacao {
    public static void main(String[] args) {
        ContatoPF c1 = new ContatoPF();
        c1.setNome("Andre luis");
        c1.setCpf("585.945.380-90"); // Gerado via https://www.4devs.com.br/gerador_de_cpf

        Endereco c1Endereco = c1.getEndereco();
        c1Endereco.setRua("Rua 1");
        c1Endereco.setNumero("123");
        c1Endereco.setCidade("Sao Paulo");
        c1Endereco.setEstado("SP");

        ContatoPJ c2 = new ContatoPJ();
        c2.setNome("RSP INFOTEC");
        c2.setCnpj("38.944.312/0001-26"); // Gerado via https://www.4devs.com.br/gerador_de_cnpj

        Endereco c2Endereco = c2.getEndereco();
        c2Endereco.setRua("Rua 1");
        c2Endereco.setNumero("123");
        c2Endereco.setCidade("Sao Paulo");
        c2Endereco.setEstado("SP");

        Agenda agenda = new Agenda();

        agenda.setContato1(c1);
        agenda.setContato2(c2);

        imprimirNome(agenda);
        imprimirCNPJ(agenda);

        System.out.println("Contato definido");

    }

    private static void imprimirNome(Agenda a) {

        if (a.getContato1() != null) {
            System.out.println(a.getContato1().getNome());
        }

        if (a.getContato2() != null) {
            System.out.println(a.getContato2().getNome());
        }

        if (a.getContato3() != null) {
            System.out.println(a.getContato3().getNome());
        }

    }

    private static void imprimirCNPJ(Agenda a) {

        if (a.getContato1() != null) {

            if (a.getContato1() instanceof ContatoPJ) {
                ContatoPJ c = (ContatoPJ) a.getContato1();
                System.out.println(c.getCnpj());
            }

        }

        if (a.getContato2() != null && a.getContato2() instanceof ContatoPJ) {
            ContatoPJ c = (ContatoPJ) a.getContato2();
            System.out.println(c.getCnpj());
        }

        if (a.getContato3() != null && a.getContato3() instanceof ContatoPJ) {
            ContatoPJ c = (ContatoPJ) a.getContato3();
            System.out.println(c.getCnpj());
        }

    }
}
