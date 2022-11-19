import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        



    }
}