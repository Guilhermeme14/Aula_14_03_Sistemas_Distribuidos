
public class CarroPasseio extends Veiculo   {
    private String cor;
    private String modelo;

    public CarroPasseio(String cor, String modelo, int peso, int velocmax, float preco) {
        super(peso, velocmax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    }
 