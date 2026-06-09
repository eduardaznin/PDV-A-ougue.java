
public class Cliente extends Pessoa {
    private double saldoDevedor;
    private boolean quitado;

    public Cliente(String nome, String cpf, String telefone, double saldoDevedor, boolean quitado){
        super(nome, cpf, telefone);
        this.saldoDevedor = saldoDevedor;
        this.quitado = quitado;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }

    @Override
    public String exibir(0){
        return "Cliente{" + "nome=" + getNome() + "cpf=" + getCpf() + "telefone=" + getTelefone() + "saldo" + saldoDevedor + "quitado=" + quitado + "}"
    }
    
}
