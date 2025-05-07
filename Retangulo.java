//Class
public class Retangulo {
    //Atributos
    private int comprimento;
    private int largura;

    //Construtor
    public Retangulo(int comprimento, int largura){
    this.comprimento = comprimento;
    this.largura = largura;
    }
    
    //Métodos
    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return 4 * largura;
      }

    public void imprimir(){
        System.out.printf("Lado: %d, Área: %d, perímetro: %d \n", largura, calcularArea(), calcularPerimetro());
      }
}
