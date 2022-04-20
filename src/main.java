import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Laboratorio> lista = new ArrayList<>();


        Projetor p1 = new Projetor(true, false);
         p1.setDefeito(false);
         p1.setCodigo(509);

        Computador pc1 = new Computador();
        pc1.setArmazenamento(500);
        pc1.setMemoria(16);
        pc1.setProcessador("i9");
        pc1.setSoftwares("Windows");
        pc1.setCodigo(02001);
        pc1.setDefeito(true);

        Computador pc2 = new Computador();
        pc2.setArmazenamento(500);
        pc2.setMemoria(4);
        pc2.setProcessador("i3");
        pc2.setSoftwares("Linux");
        pc2.setCodigo(03001);
        pc2.setDefeito(false);

        Laboratorio lab01 = new Laboratorio();
        lista.add(lab01);
        lab01.setEquipamento("Memória RAM");
        lab01.setCodigo(01);
        lab01.setAndar(05);
        lab01.setDescricao("Memória RAM com defeito");

        Laboratorio lab02 = new Laboratorio();
        lista.add(lab02);
        lab02.setEquipamento("pc1");
        lab02.setCodigo(02001);
        lab02.setAndar(04);
        lab02.setDescricao("Computador não liga");


        Laboratorio lab03 = new Laboratorio();
        lista.add(lab03);
        lab03.setEquipamento("pc2");
        lab03.setCodigo(03001);
        lab03.setAndar(01);
        lab03.setDescricao("Computador funcionando!");


        Laboratorio lab04 = new Laboratorio();
        lista.add(lab04);
        lab04.setEquipamento("Projetor");
        lab04.setCodigo(0101);
        lab04.setAndar(02);
        lab04.setDescricao("Projetor funcionando!");

        for(Laboratorio l: lista){
            System.out.println(l.getCodigo() + "\n");
        }
        System.out.println("Atualmente temos " + lista.size() + " Laboratórios\n");

        for(Laboratorio l: lista){
            System.out.println(l.getDescricao());
        }
    }
}
