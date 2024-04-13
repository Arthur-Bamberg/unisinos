public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataComparacao) {
        if (this.dataValidade.getAno() != dataComparacao.getAno())
            return this.dataValidade.getAno() < dataComparacao.getAno();

        if (this.dataValidade.getMes() != dataComparacao.getMes())
            return this.dataValidade.getMes() < dataComparacao.getMes();

        return this.dataValidade.getDia() < dataComparacao.getDia();
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", dataValidade=" + dataValidade + ", getNome()="
                + getNome() + ", getPreco()=" + getPreco() + ", getDataValidade()=" + getDataValidade()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

}
