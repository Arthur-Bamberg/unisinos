import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equalsIgnoreCase(nome)) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        switch (tipo) {
            case "Cosmético":
                int quantidadeCosmeticos = 0;
                for (Loja loja : this.lojas) {
                    if (loja instanceof Cosmetico) {
                        quantidadeCosmeticos++;
                    }
                }
                return quantidadeCosmeticos;
            
            case "Vestuário":
                int quantidadeVestuarios = 0;
                for (Loja loja : this.lojas) {
                    if (loja instanceof Vestuario) {
                        quantidadeVestuarios++;
                    }
                }
                return quantidadeVestuarios;

            case "Bijuteria":
                int quantidadeBijuterias = 0;
                for (Loja loja : this.lojas) {
                    if (loja instanceof Bijuteria) {
                        quantidadeBijuterias++;
                    }
                }
                return quantidadeBijuterias;

            case "Alimentação":
                int quantidadeAlimentacoes = 0;
                for (Loja loja : this.lojas) {
                    if (loja instanceof Alimentacao) {
                        quantidadeAlimentacoes++;
                    }
                }
                return quantidadeAlimentacoes;

            case "Informática":
                int quantidadeInformaticas = 0;
                for (Loja loja : this.lojas) {
                    if (loja instanceof Informatica) {
                        quantidadeInformaticas++;
                    }
                }
                return quantidadeInformaticas;

            default:
                return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;

        for (Loja loja : this.lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (lojaSeguroMaisCaro == null || informatica.getSeguroEletronicos() > lojaSeguroMaisCaro.getSeguroEletronicos()) {
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }

    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas)
                + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getLojas()="
                + Arrays.toString(getLojas()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}
