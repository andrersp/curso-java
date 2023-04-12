public class Aplicacao {
    public static void main(String[] args){
        Matematica m = new Matematica();

        int resultado = m.somar(10, 20);
        int resultato2 = m.somar(10, 20, 30);
        System.out.println(resultado);
        System.out.println(resultato2);

        System.out.println(m.somar(10.0, 20.0));
    }
}
