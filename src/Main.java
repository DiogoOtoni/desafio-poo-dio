import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Descricao curso poo");
        curso1.setCargaHoraria(10);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java UI");
        curso2.setDescricao("Descricao curso ui");
        curso2.setCargaHoraria(5);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Descricao mento1");
        mentoria1.setTitulo("Mentoria 1 java");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println("Conteúdos inscritos" + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devDiogo.getConteudosConcluidos());
        System.out.println("XP: "+ devDiogo.calcularTotalXp());

        System.out.println("-----------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos inscritos" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devMaria.getConteudosConcluidos());
        System.out.println("XP: "+ devMaria.calcularTotalXp());




    }
}