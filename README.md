# desafio-poo-dio25
# 🚀 Desafio POO - DIO

🎯 Objetivo do Projeto
Este projeto simula um sistema simples de gerenciamento de um Bootcamp de desenvolvimento, onde desenvolvedores (Dev) podem se inscrever, acompanhar conteúdos (cursos e mentorias) e evoluir acumulando experiência (XP).

O foco é modelar conceitos de programação orientada a objetos, encapsulamento, herança e polimorfismo com uma aplicação prática.
---

## 📂 Estrutura do Projeto
src/
└─ br.com.dio.desafio.dominio/
├─ Bootcamp.java       # Modelo do Bootcamp
├─ Conteudo.java       # Classe abstrata Conteúdo
├─ Curso.java          # Conteúdo do tipo Curso
├─ Mentoria.java       # Conteúdo do tipo Mentoria
└─ Dev.java            # Modelo do Desenvolvedor
Main.java              # Classe para execução principal


📚 Conceitos Envolvidos
Programação Orientada a Objetos (POO): uso de classes, herança e polimorfismo.

Abstração: a classe abstrata Conteudo serve como base para conteúdos específicos.

Encapsulamento: uso de getters e setters para manipulação de dados.

Coleções Java: uso de Set, HashSet e LinkedHashSet para gerenciar listas sem duplicação e com ordenação.

Java 8+ Streams: para operações funcionais como soma de XP.

Datas com java.time.LocalDate: gerenciamento de datas de início e fim do Bootcamp e mentoria.

Regras de Negócio
Um Bootcamp possui um conjunto de Conteudo (cursos e mentorias).

Um Dev pode se inscrever em um Bootcamp, recebendo todos os conteúdos do bootcamp como inscritos.

O progresso do Dev ocorre consumindo os conteúdos inscritos, que passam para concluídos.

O XP acumulado do Dev é a soma do XP de todos os conteúdos concluídos.

Cada curso calcula XP multiplicando uma base fixa pelo número de horas.

Cada mentoria adiciona XP fixo extra.

O bootcamp tem duração padrão de 45 dias a partir da data inicial.

▶️ Exemplo de Execução
Curso curso1 = new Curso();
curso1.setTitulo("curso Java");
curso1.setDescricao("linguagem backend de alto nível");
curso1.setCargaHoraria(50);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("Mentoria para Java");
mentoria.setDescricao("tópicos da mentoria");
mentoria.setData(LocalDate.now());

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(mentoria);

Dev dev1 = new Dev();
dev1.setNome("Samir");
dev1.inscreverBootcamp(bootcamp);

dev1.progresso(); // Conclui o primeiro conteúdo inscrito

System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
System.out.printf("XP Total: %.2f%n", dev1.calcularTotalXp());

Saída esperada:
Conteúdos Inscritos: [curso JS, Mentoria para Java]
Conteúdos Concluídos: [curso Java]
XP Total: 500.00

📖 Explicação Linha por Linha (Classe Main)

Curso curso1 = new Curso();
- Cria uma instância do curso.

curso1.setTitulo("curso Java");
curso1.setDescricao("linguagem backend de alto nível");
curso1.setCargaHoraria(50);
- Define título, descrição e carga horária do curso.

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("Mentoria para Java");
mentoria.setDescricao("tópicos da mentoria");
mentoria.setData(LocalDate.now());
- Cria e configura uma mentoria, incluindo a data atual.

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.setDescricao("Descrição Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(mentoria);
- Cria o bootcamp e adiciona os conteúdos (curso e mentoria).

Dev dev1 = new Dev();
dev1.setNome("Samir");
dev1.inscreverBootcamp(bootcamp);
- Cria um desenvolvedor, define nome e inscreve no bootcamp (adicionando os conteúdos).

dev1.progresso();
O dev conclui o próximo conteúdo inscrito.

System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
System.out.printf("XP Total: %.2f%n", dev1.calcularTotalXp());
- Exibe os conteúdos restantes, os concluídos e o total de XP acumulado.






