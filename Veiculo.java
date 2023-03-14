import javax.swing.*;

public class Veiculo {
  private int peso;
  private int velocmax;
  private float preco;

    public Veiculo(int peso, int velocmax, float preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
  @Override
    public String toString() {
        return ("Peso: " + getPeso()+"Kg " +"Velocidade Max: " + getVelocmax() +"Km/h " + "Preço: " + getPreco()+ "R$ ");
    }

    void peso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}