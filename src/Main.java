import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("linguagem backend de alto nível");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("linguagem front e backend");
        curso2.setCargaHoraria(40);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria para Java");
        mentoria1.setDescricao("topicos da mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);



    }
}
