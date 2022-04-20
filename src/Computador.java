public class Computador extends Equipamento{
    private int memoria;
    private int armazenamento;
    private String processador;
    private String softwares;

    public Computador() {
    }

    public Computador(int memoria, int armazenamento, String processador, String softwares, Equipamento ep) {
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.softwares = softwares;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getSoftwares() {
        return softwares;
    }

    public void setSoftwares(String softwares) {
        this.softwares = softwares;
    }
}
