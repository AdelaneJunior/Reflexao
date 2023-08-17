public class Main {

    public static void main(String[] args){

        Reflexao reflexao = new Reflexao();

        System.out.println("          Avo");
        reflexao.imprimeAtributos(reflexao.getAtributosClasse(Avo.class));
        reflexao.imprimeMetodos(reflexao.getMetodosClasse(Avo.class));

        System.out.println("\n          Pai");
        reflexao.imprimeAtributos(reflexao.getAtributosClasse(Pai.class));
        reflexao.imprimeMetodos(reflexao.getMetodosClasse(Pai.class));

        System.out.println("\n          Filho");
        reflexao.imprimeAtributos(reflexao.getAtributosClasse(Filho.class));
        reflexao.imprimeMetodos(reflexao.getMetodosClasse(Filho.class));

    }
}
