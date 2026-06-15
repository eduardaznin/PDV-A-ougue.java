public class Debito {
    private Cliente cliente;
    private double valor;
    private String data;
    private boolean assinado;

    public Debito(Cliente cliente, double valor, String data, boolean assinado){
        this.cliente = cliente;
        this.valor = valor;
        this.data= data;
        this.assinado = assinado;

    }

    public Cliente getCliente(){
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getData(){
        return data;
    }

    public boolean isAssinado(){
        return assinado;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setAssinado(boolean assinado){
        this.assinado = assinado;
    }

    public String exibir(){
        return "Debito{" + "cliente=" + cliente.getNome() + ", valor =" + valor + ", data=" + data + ", assinado=" + assinado + "}";
    }
    
    
}

