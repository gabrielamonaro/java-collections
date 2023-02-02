import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections!");

        //Dada uma lista com 7 notas de um aluno: [7, 8.5, 9.3, 5, 7, 8, 3.6] faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        Set<Double> notas = new HashSet<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7d);
        notas.add(8.0);
        notas.add(3.6);

        //ou
        // Set<Double> notas = new HashSet<>()(Arrays.asList(7, 8.5, 9.3, 5, 7, 8, 3.6))

        System.out.println(notas);

        
        // nao trabalha com indice:  System.out.println("Exiba a posição da nota 5.0: ");
        // nao trabalha com indice: System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // nao trabalha com indice: System.out.println("Substitua a nota 5.0 pela nota 6.0: ");


        System.out.println("Confira se a nota 5.0 está na lista: " + 
        notas.contains(5.0)
        );

        // System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        // System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + 
        Collections.min(notas)
        );

        System.out.println("Exiba a maior nota: " +
        Collections.max(notas)
        );

        System.out.println("Exiba a soma dos valores: "    );

        Iterator <Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext())
        {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("Exiba a média dos valores: " +
        (soma/notas.size())
        );

        System.out.println("Remova a nota 7: " );
        System.out.println(notas);
        notas.remove(7d);
        System.out.println(notas);
       
        // System.out.println("Remova a nota na posicao 0: " );

        System.out.println("Remova as notas menores que 7:" );
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext())
        {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);

        System.out.println("Apague toda a lista." );
        notas.clear();


        System.out.println("Confira se a lista está vazia: " +
        notas.isEmpty()
        );
        

        /*
        Resolve os exercícios utilizando os metodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da List ArrayList nessa nova lista:")

        System.out.println( Mostre a primeira nota da nova lista sem removê-la: ")

        System.out.println( Mostre a primeira nota da nova lista removendo-a: ")
         */

    }
}
