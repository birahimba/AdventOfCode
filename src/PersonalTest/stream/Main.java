package PersonalTest.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(32);
        list.add(98);

        /**
         * Pour filtrer des données, un Stream propose plusieurs opérations :
         */
     /*   //filter(Predicate) : renvoie un Stream qui contient les éléments pour lesquels l'évaluation du Predicate passé en paramètre vaut true
        list.stream().filter(s->{return s < 10;}).forEach(System.out::println);

        //distinct() : renvoie un Stream qui ne contient que les éléments uniques (elle retire les doublons). La comparaison se fait grâce à l'implémentation de la méthode equals()
        list.stream().distinct().forEach(System.out::println);

        //limit(n) : renvoie un Stream que ne contient comme éléments que le nombre fourni en paramètre
        list.stream().limit(3).forEach(System.out::println);

        //skip(n) : renvoie un Stream dont les n premiers éléments sont ignorés
        list.stream().skip(1).forEach(System.out::println);

      */

        /**
         * Pour rechercher une correspondance avec des éléments, un Stream propose plusieurs opérations :
         */

     /*   //anyMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur au moins un élément vaut true
        Boolean reponse1 = list.stream().anyMatch(s->{ return s == 98;});
        Boolean reponse2 = list.stream().anyMatch(s->{ return s == 9;});
        System.out.println(reponse1);
        System.out.println(reponse2);

        //allMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur tous les éléments vaut true
        Boolean reponse3 = list.stream().allMatch(s->{ return s * 2 > 1;});
        System.out.println(reponse3);

        //noneMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur tous les éléments vaut false
        Boolean reponse4 = list.stream().allMatch(s->{ return s * 2 < 1;});
        System.out.println(reponse4);

        //findAny() : renvoie un objet de type Optional qui encapsule un élément du Stream s'il existe
        Optional s = list.stream().findAny();
        System.out.println(s);

        //findFirst() : renvoie un objet de type Optional qui encapsule le premier élément du Stream s'il existe
        Optional s1 = list.stream().findFirst();
        System.out.println(s1);

      */

        /**
         * Pour transformer des données, un Stream propose plusieurs opérations :
         */
      /*  //map(Function) : applique la Function fournie en paramètre pour transformer l'élément en créant un nouveau
        list.stream().map(s -> s.toString()).map(s -> s.concat(s)).forEach(System.out::println);

        //flatMap(Function) : applique la Function fournie en paramètre pour transformer l'élément en créant zéro, un ou plusieurs éléments
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Java 8
        String[] result = Stream.of(array)  // Stream<String[]>
                .flatMap(Stream::of)        // Stream<String>
                .toArray(String[]::new);    // [a, b, c, d, e, f]
       */

        /**
         * Pour réduire les données et produire un résultat, un Stream propose plusieurs opérations :
         */
        //reduce() : applique une Function pour combiner les éléments afin de produire le résultat

       //collect() : permet de transformer un Stream qui contiendra le résultat des traitements de réduction dans un conteneur mutable

    }
}
