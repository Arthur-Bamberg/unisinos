public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            this.setDataPadrao();
            return;
        }

        this.mes = mes;

        this.ano = ano;

        if (dia < 1 || dia > this.getMaxDiasInMes()) {
            this.setDataPadrao();
        }

        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private int getMaxDiasInMes() {
        switch (this.mes) {
            case 2:
                return this.verificaAnoBissexto() ? 29 : 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return 31;
        }
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 400 == 0)
            return true;

        if (this.ano % 100 == 0)
            return false;

        if (this.ano % 4 == 0)
            return true;

        return false;
    }

    private void setDataPadrao() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
