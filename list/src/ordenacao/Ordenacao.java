package ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {

   public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>() {{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6,"tigrado"));
        add(new Gato("Jon", 12," amarelo"));  
    }};

    System.out.println("--- Ordem de inserção: ---");
    System.out.println(meusGatos);

    System.out.println("--- Ordem aleatória: ---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--- Ordem natural: (nome) ---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--- Ordem (idade) ---");
    //Collections.sort(meusGatos, new ComparatorIdade());
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);
    
    System.out.println("--- Ordem (cor) ---");
    //Collections.sort(meusGatos, new ComparatorCor());
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    System.out.println("--- Ordem (Nome/Cor/Idade) ---");
    // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);

   }   
}



