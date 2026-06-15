
public class Venda {
    import java.util.ArrayList;

    public class Venda implements Assinavel {
        private Cliente cliente;
        private ArrayList<ItemVenda> itens;
        private String data;
        private double total;
        private boolean fiado;
        private boolean assinado;

        public Venda(Cliente cliente, String data, boolean fiado){
            this.cleinte = cliente;
            this.data = data;
            this.fiado = fiado;
            this.itens = new ArrayList<>();
            this.total = 0;
            this.assinado = false;

        }

        public void  adicionarItem(itemVenda item){
            itens.add(item);
            total += item.getPrecoCalculado();
        }

        @Override 
        public void assinar() {
            this.assinado = true;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public ArrayList<ItemVenda> getItens() {
            return itens;
        }

        public String getData() {
            return data;
        }

        public double getTotal() {
            return total;
        }

        public boolean isFiado() {
            return fiado;
        }

        public boolean isAssinado() {
            return assinado;
        }

        public String exibir() {
            return "Venda{" + "cliente= " + cliente.getNome() + ", data=" + data + ", total=" + total +  ", fiado" + fiado + ", assinado=" + assinado + "}";
        }
    }
    
