import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso course1 = new Curso();
    course1.setTitulo("Curso Java");
    course1.setDescricao("Descrição curso Java");
    course1.setCargaHoraria(8);

    Curso course2 = new Curso();
    course2.setTitulo("Curso JavaScript");
    course2.setDescricao("Descrição curso JavaScript");
    course2.setCargaHoraria(7);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição da mentoria de Java");
    mentoria.setData(LocalDate.now());

    System.out.println(course1);
    System.out.println(course2);
    System.out.println(mentoria);

  }
}
