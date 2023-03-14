import javax.swing.*;
public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturamax;
    private int comprimento;

    public Caminhao(int toneladas, int alturamax, int comprimento, int peso, int velocmax, float preco) {
        super(peso, velocmax, preco);
        this.toneladas = toneladas;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public void peso() {
            super.peso();
            JOptionPane.showMessageDialog(null,"O peso é " + getPeso());
    }
    
    public String toString() {
        return (super.toString()+ " Toneladas: "+ getToneladas()+"T " + " Altura max: " + getAlturamax() +"m "+ " Comprimento: " + getComprimento ()+"m");
    }
}
