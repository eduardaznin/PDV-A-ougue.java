
public class Produto {
    
    private int id;
    private String nome;
    private String categoria;
    private double precoKg;
    private double precoUn;

    public Produto(int id, String nome, String categoria, double precoKg, double precoUn) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.precoKg = precoKg;
        this.precoUn = precoUn;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public double getPrecoUn() {
        return precoUn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setPrecoKg(double precoKg){
        this.precoKg = precoKg;
    }

    public void setPrecoUn(double precoUn){
        this.precoUn = precoUn;
    }

    public String exibir() {
        return "Produto{" + "id=" + id + "nome=" + nome + "categoria=" + categoria + "precoKg=" + precoKg + "precoUn" + precoUn + "}";
    }
}
