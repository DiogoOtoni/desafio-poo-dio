import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Descricao curso poo");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java UI");
        curso2.setDescricao("Descricao curso ui");
        curso2.setCargaHoraria(5);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Descricao mento1");
        mentoria1.setTitulo("Mentoria 1 java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        //Conteudo conteudo1 = new Curso(); //polimorfismo


    }
}