import java.util.ArrayList;
import java.util.List;

public class Main {

    static public void main(String[] args){



        List<Student> lista1= new ArrayList<>();
        List<Student> lista2 = new ArrayList<>();
        List<Student> lista3 = new ArrayList<>();

        Class grupa1=new Class("pierwsza",lista1, 15);
        Class grupa2=new Class("druga",lista2, 4);
        Class grupa3=new Class("trzecia",lista3, 20);

        Student student3 = new Student("Basia","Sokol", StudentCondition.odrabiajacy, 1788, 50 );
        Student student1 = new Student("Justyna","Slosarz", StudentCondition.nieobecny, 2000, 35 );
        Student student2 = new Student("Kamil","Kanol", StudentCondition.chory, 1999, 15 );
        //Student student3 = new Student("Basia","Sokol", StudentCondition.odrabiajacy, 1788, 50 );
        Student student4 = new Student("Basia","Slosarz", StudentCondition.odrabiajacy, 1788, 50 );
        Student student5 = new Student("Asia","Slosarz", StudentCondition.odrabiajacy, 1788, 50 );
        System.out.println("---------AddStudent----------");
        grupa1.addStudent(student3);
        grupa1.addStudent(student1);
        grupa1.summary();
        System.out.println("--------WypisanieGrupa1-----------");

        grupa1.addStudent(student2);
        grupa1.addStudent(student4);
        //grupa1.addStudent(student3);
        grupa2.addStudent(student1);
        grupa2.addStudent(student2);

        System.out.println("-------------------");
        grupa1.search("Kanol");
        grupa1.summary();
        System.out.println("-------------------");

        grupa1.summary();
        System.out.println("--------AddPoints-----------");
        grupa1.addPoints(student1, 34);
        grupa1.summary();
        System.out.println("--------RemovePoint&GetStudent-----------");
        grupa1.removePoints(student2, 30);
        grupa1.getStudent(student2);
        grupa1.summary();
        System.out.println("------ChangeCondition------------");
        grupa1.changeCondition(student1, StudentCondition.odrabiajacy);
        grupa1.show(student1);

        System.out.println("---------WypisanieGrupa1----------");

        grupa1.addStudent(student2);
        grupa1.addStudent(student3);
        grupa1.summary();
        System.out.println("-------Search------------");
        grupa1.search("Sokol");
        System.out.println("-------Partial-------------");
        grupa1.searchPartial("slo");
        System.out.println("---------CountByCondition-----------");
        grupa1.countByCondition(StudentCondition.odrabiajacy);
        System.out.println("----------SortByName----------");
        grupa1.addStudent(student5);
        grupa1.sortByName();
        grupa1.summary();
        System.out.println("----------SortByPoints----------");
        grupa1.sortByPoints();
        grupa1.summary();
        System.out.println("--------MaxElementWKolekcji------------");
        grupa1.max();
        System.out.println("--------------------");

ClassContainer container = new ClassContainer();
List<Student> lista0 = new ArrayList<>();
System.out.println("-------AddClass-------------");
container.addClass(grupa1.nazwaGrupy, grupa1.listaStudentow,grupa1.maxIloscStudentow);
//container.addClass(grupa2.nazwaGrupy, grupa1.listaStudentow, grupa2.maxIloscStudentow);
container.addClass(grupa2.nazwaGrupy,grupa2.listaStudentow, grupa2.maxIloscStudentow );
container.addClass("Pusta",lista0, 15);
container.addClass("Lista_pusta",lista0, 12);
container.print();

System.out.println("-----RemoveClass---------------");
container.removeClass("Pusta");
container.print();
System.out.println("-------Summary-------------");
container.summary();
System.out.println("--------AddClass(PUSTE)&FindEmpty------------");
container.addClass("Pusta",lista0, 15);
//container.addClass("Pusta1",lista0, 15);
container.findEmpty();
container.summary();

    }
}