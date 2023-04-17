public class Aplicacao {

    private enum Sexo {
        MASCULINO("FEM"),
        FEMININO("MASC");

        private String valor;

        Sexo(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }

    }

    public static void main(String[] args) {

        DiadaSemana hoje = DiadaSemana.SEXTA;

        int num = DiadaSemana.QUARTA.getNum();

        System.out.println(num);

        try {
            String s = "TERCA";

            DiadaSemana d = DiadaSemana.valueOf(s);
            System.out.println(d.getNum());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        Sexo sexo = Sexo.MASCULINO;
        System.out.println(sexo.getValor());

    }

}