
public class Funcionario extends Pessoa {

    private String senha;

    public Funcionario(String nome, String cpf, String telefone, String senha){
        super(nome, cpf, telefone);
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public String exibir() {
        return "Funcionario{" + "nome=" + getNome() + "cpf=" + getCpf() + "telefone=" + getTelefone() + "}";
    }
    
}
