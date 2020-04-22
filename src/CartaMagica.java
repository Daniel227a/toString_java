public class CartaMagica
{
    private int ID;
    private String nome;
    private int vidaAtual;
    private int vidaMaxima;
    private int custoMana;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }

    public CartaMagica(int ID, String nome, int vidaAtual, int vidaMaxima, int custoMana) {
        this.ID = ID;
        this.nome = nome;
        this.vidaAtual = vidaAtual;
        this.vidaMaxima = vidaMaxima;
        this.custoMana = custoMana;
    }

    @Override
    public String toString() {
        return "CartaMagica" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", vidaAtual=" + vidaAtual +
                ", vidaMaxima=" + vidaMaxima +
                ", custoMana=" + custoMana
                ;
    }
}
