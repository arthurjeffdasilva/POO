public class Helicoptero{
    private boolean ligado;
    private double altitude;
    private int capacidade;
    private int pessoasPresentes;

    // Construtor
    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
        this.ligado = false;
        this.altitude = 0;
        this.pessoasPresentes = 0;
    }

    // Método para adicionar pessoa
    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no helicóptero.");
        }
    }

    // Método para remover pessoa
    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do helicóptero.");
        }
    }

    // Método para ligar
    public void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println("Helicóptero ligado.");
        }
    }

    // Método para decolar
    public void decolar(double novaAltitude) {
        if (ligado  == true && altitude == 0) {
            altitude = novaAltitude;
            System.out.println("Helicóptero decolou para a altitude " + novaAltitude);
        }
    }

    // Método para aterrisar
    public void aterrisar() {
        if (ligado == true && altitude > 0) {
            altitude = 0;
            System.out.println("Helicóptero aterrissou.");
        }
    }

    // Método para desligar
    public void desligar() {
        if (ligado == true && altitude == 0) {
            ligado = false;
            System.out.println("Helicóptero desligado.");
        }
    }

    // Getters e Setters
    public boolean isLigado() {
        return ligado;
    }

    public double getAltitude() {
        return altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setLigado(boolean ligado) {
        this.ligado  = ligado;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public String toString() {
        return "Helicoptero{" +
                "ligado=" + ligado +
                ", altitude=" + altitude +
                ", capacidade=" + capacidade +
                ", pessoasPresentes=" + pessoasPresentes +
                '}';
    }
}
