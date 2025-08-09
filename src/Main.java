import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria para Java");
        mentoria.setDescricao("topicos da mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Samir");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("======================================");
        System.out.printf("👨‍💻 Dev: %s%n", dev1.getNome());
        System.out.printf("📚 Conteúdos Inscritos: %s%n", dev1.getConteudosInscritos());

        dev1.progresso();
        System.out.println("\n🔄 Progresso atualizado...");

        System.out.printf("📚 Conteúdos Inscritos: %s%n", dev1.getConteudosInscritos());
        System.out.printf("✅ Conteúdos Concluídos: %s%n", dev1.getConteudosConcluidos());
        System.out.printf("⭐ XP Total: %.2f%n", dev1.calcularTotalXp());
        System.out.println("======================================");

        Dev dev2 = new Dev();
        dev2.setNome("Victinho");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("======================================");
        System.out.printf("👨‍💻 Dev: %s%n", dev2.getNome());
        System.out.printf("📚 Conteúdos Inscritos: %s%n", dev2.getConteudosInscritos());

        dev1.progresso();
        System.out.println("\n🔄 Progresso atualizado...");

        System.out.printf("📚 Conteúdos Inscritos: %s%n", dev2.getConteudosInscritos());
        System.out.printf("✅ Conteúdos Concluídos: %s%n", dev2.getConteudosConcluidos());
        System.out.printf("⭐ XP Total: %.2f%n", dev1.calcularTotalXp());
        System.out.println("======================================");



    }
}
