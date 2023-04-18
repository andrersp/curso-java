/**
 * Classe que representa um contato.
 * 
 * @author Andre
 * @version 1.0
 * 
 */
public class Contato {

    /**
     * Nome do contato
     */
    private String nome;

    /**
     * Email do contato
     */
    private String email;

    /**
     * Endereco do contato
     */
    private Endereco endereco = new Endereco();

    /**
     * Construor
     * 
     * @param nome  nome do contato
     * @param email email do contato
     */
    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    /**
     * Define o contato
     * 
     * @param rua    Rua do contato
     * @param numero Numero do contato
     */
    public void definirEndereco(String rua, int numero) {
        endereco.setNumero(numero);
        endereco.setRua(rua);
    }

    /**
     * Retorna o nome
     * 
     * @return nome do contato
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o email
     * 
     * @return email do contato
     */
    public String getEmail() {
        return email;
    }

}
