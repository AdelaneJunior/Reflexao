public class Avo extends Pessoa{

    private String corChapeu;

    public String getCorChapeu() {return this.corChapeu;}

    public void setCorChapeu(String corChapeu){this.corChapeu = corChapeu;}

    @Override
    public String getTipoVoz() {return "rouca";}
}
