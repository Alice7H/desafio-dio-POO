import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso course1 = new Curso();
    course1.setTitulo("Curso Java");
    course1.setDescricao("Descrição curso Java");
    course1.setCargaHoraria(8);

    Curso course2 = new Curso();
    course2.setTitulo("Curso de POO");
    course2.setDescricao("Descrição curso de POO");
    course2.setCargaHoraria(7);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição da mentoria de Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcampJava = new Bootcamp();
    bootcampJava.setNome("Bootcamp Java Developer");
    bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
    bootcampJava.getConteudos().add(course1);
    bootcampJava.getConteudos().add(course2);
    bootcampJava.getConteudos().add(mentoria);

    Dev bob = new Dev();
    bob.setNome("Bob Single");
    bob.inscreverBootcamp(bootcampJava);
    System.out.println("Conteudos inscritos de Bob: " + bob.getConteudosInscritos());
    bob.progredir();
    bob.progredir();
    bob.progredir();
    System.out.println();
    System.out.println("Conteudos inscritos de Bob: " + bob.getConteudosInscritos());
    System.out.println();
    System.out.println("Conteudos concluídos de Bob: " + bob.getConteudosConcluidos());
    System.out.println("XP: " + bob.calcularTotalXp());

    System.out.println("------------");

    Dev amy = new Dev();
    amy.setNome("Amy Joy");
    amy.inscreverBootcamp(bootcampJava);
    System.out.println("Conteudos inscritos de Amy: " + amy.getConteudosInscritos());
    amy.progredir();
    System.out.println();
    System.out.println("Conteudos inscritos de Amy: " + amy.getConteudosInscritos());
    System.out.println();
    System.out.println("Conteudos concluídos de Amy: " + amy.getConteudosConcluidos());
    System.out.println("XP: " + amy.calcularTotalXp());

  }
}
