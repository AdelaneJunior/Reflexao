import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reflexao {
    static String OBJETC = Object.class.getSimpleName();

    public List<Field> getAtributosClasse(Class<?> classe) {

        List<Field> atributos = new ArrayList<>();

        if (classe.getSuperclass().getSimpleName().equals(OBJETC)) {

            Field[] vetorAtributos = classe.getDeclaredFields();
            atributos.addAll(Arrays.asList(vetorAtributos));

        } else {

            atributos = getAtributosClasse(classe.getSuperclass());
            Field[] vetorAtributos = classe.getDeclaredFields();
            atributos.addAll(Arrays.asList(vetorAtributos));

        }

        return atributos;
    }

    public void imprimeAtributos(List<Field> listaAtributos) {

        System.out.println("--------Atributos---------");

        for (Field atributo : listaAtributos) {
            System.out.println("----------------------");
            System.out.println("Nome Atributo: " + atributo.getName());
            System.out.println("Atributo da classe = " + atributo.getDeclaringClass());
            System.out.println("Tipo = " + atributo.getType());
            int mod = atributo.getModifiers();
            System.out.println("Modificadores = " + Modifier.toString(mod));
        }
        System.out.println();
    }

    public List<Method> getMetodosClasse(Class<?> classe) {

        List<Method> metodos = new ArrayList<>();

        if (classe.getSuperclass().getSimpleName().equals(OBJETC)) {

            Method[] vetorAtributos = classe.getDeclaredMethods();
            metodos.addAll(Arrays.asList(vetorAtributos));

        } else {

            metodos = getMetodosClasse(classe.getSuperclass());
            Method[] vetorAtributos = classe.getDeclaredMethods();
            metodos.addAll(Arrays.asList(vetorAtributos));

        }
        return metodos;
    }

    public void imprimeMetodos(List<Method> listaMetodos) {

        System.out.println("------Metodos------");

        for (Method metodo : listaMetodos) {
            System.out.println("-------------------");
            System.out.println(metodo.toString());
        }
        System.out.println("___________________");
    }

}
