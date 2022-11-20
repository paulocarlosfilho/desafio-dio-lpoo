import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        System.out.println();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
        System.out.println();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Descrição do curso de C#");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);
        System.out.println();

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de C#");
        mentoria2.setDescricao("Descrição da mentoria de C#");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);
        System.out.println();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcap Java Developer");
        bootcamp.setDescricao("Descrição sobre o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev paulo = new Dev();
        paulo.setNome("Paulo");
        paulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Paulo: " + paulo.getConteudosInscritos());
        System.out.println("XP Paulo: " + paulo.calcularTotalXp());
        paulo.progredir();
        paulo.progredir();
        System.out.println("Conteúdos Inscritos de Paulo: " + paulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Paulo: " + paulo.getConteudosConcluidos());
        System.out.println("XP Paulo: " + paulo.calcularTotalXp());







    }
}