public class Fitasdevideo {
    //Criar os atributos
    private String titulo;
    private float precoAluguel;

    //Criar o construtor
    public Fitasdevideo(String titulo, float precoAluguel){
    this.titulo = titulo;
    this.precoAluguel = precoAluguel;
    }

    public String gettitulo(){
        return titulo;
    }

    public float getprecoAluguel(){
        return precoAluguel;
    }

    public float getValorAluguel(int numeroDeDiasAlugada){
        return precoAluguel = numeroDeDiasAlugada;
    }

    public String toString(){
        return "titulo: " + titulo + "precoAluguel" + precoAluguel;
    }

    public void Imprimir(){
        System.out.printf("titulo: %s, precoAluguel: %.2f", titulo, precoAluguel);
    }
}
