package Produtos;

public class Produtos {
    private int id;
    private String nome;
    private double valor;
    private String status;

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
