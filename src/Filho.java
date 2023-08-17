public class Filho extends Pessoa{

    private int idade;

    public int getIdade() {return this.idade;}

    public void setIdade(int idade){this.idade = idade;}

    @Override
    public String getTipoVoz() {
        return "fina";
    }
}
