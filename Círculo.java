//Criar a classe
public class Círculo {
    //Criar os atributos
    private float raio;

    //Criar os construtor
    public Círculo(float raio){
    this.raio = raio;
    }

    //Criar os métodos
    public float CalcularArea(){
        return 3.141515f * raio * raio;
    }

    public float CalcularPerimetro(){
        return 2 * 3.141516f * raio;
    }
    
    public void Imprimir(){
        System.out.printf("raio: %.2f, Area: %.2f, Perimetro: %.2f\n",
            raio, CalcularArea(), CalcularPerimetro());
    }
}
