import java.util.*;

public class Class implements MyComparator{
    String nazwaGrupy;
    List<Student> listaStudentow;
    int maxIloscStudentow;

    public Class(String nazwaGrupy1, List<Student> listaStudentow1, int maxIloscStudentow1){
        nazwaGrupy=nazwaGrupy1;
        listaStudentow=listaStudentow1;// new ArrayList<Student>();
        maxIloscStudentow=maxIloscStudentow1;
    }

    public List<Student> getListaStudentow() {
        return this.listaStudentow;
    }
    public void addStudent(Student student1){
        boolean sprawdz = false; //sprawdza czy student istnieje na liscie

        for (int i=0;i<listaStudentow.size();i++){
            if(listaStudentow.get(i).imie == student1.imie){
                sprawdz=true;

            }
        }

        if(listaStudentow.size()<maxIloscStudentow && sprawdz ==false){
            listaStudentow.add(student1);

        } else if (sprawdz = true) {
            System.out.println("Student: "+ student1.imie + " "+student1.nazwisko +" znajduje się na liście!");
        }
        else {
            System.out.println("Na liście brakuje miejsc!");
        }
    }
    public  void addPoints(Student student1, double iloscPunktow1){
        for(Student singleStudent : listaStudentow){
            if(singleStudent.equals(student1)){
                student1.setPunkty(student1.getPunkty()+iloscPunktow1);
            }
        }
    }
    public  void getStudent(Student student1){
        if(student1.getPunkty()<=0){
            listaStudentow.remove(student1);
        }
    }


    public void changeCondition(Student student1, StudentCondition stanStudenta1){
        for (Student singleStudent : listaStudentow){
            if (singleStudent.equals(student1)){
                student1.setStanStudenta(stanStudenta1);
            }
        }
    }
    public void removePoints(Student student1, double iloscPunktow1){
    for (Student singleStudent : listaStudentow){
        if (singleStudent.equals(student1)){
            singleStudent.setPunkty(singleStudent.getPunkty()-iloscPunktow1);
        }
    }
    }

    public Student search(String studentS){
        for (Student singleStudent : listaStudentow) {
            if (singleStudent.nazwisko.compareTo(studentS)==0){
                System.out.println("Student znajduje sie w bazie!");
                return singleStudent;
            }
            else {
                System.out.println("Student nie znajduje sie w bazie!");
            }
        }
        return null;
    }

    public List<Student> searchPartial(String fragment1){

        List <Student> wynikowaLista = new ArrayList();
        for( Student singleStudent : listaStudentow){
            if(singleStudent.getNazwisko().toUpperCase().contains(fragment1) || singleStudent.getImie().toUpperCase().contains(fragment1)){
                wynikowaLista.add(singleStudent);
                singleStudent.print();
            }
            if(singleStudent.getNazwisko().toLowerCase().contains(fragment1) || singleStudent.getImie().toLowerCase().contains(fragment1)){
                wynikowaLista.add(singleStudent);
                singleStudent.print();
            }
        }
        return wynikowaLista;
    }

    public int countByCondition(StudentCondition stanStudenta1){
        int iloscOsobStan=0;
        for (Student singleStudent : listaStudentow){
            if(singleStudent.getStanStudenta()==stanStudenta1){
                iloscOsobStan++;
            }
        }
        System.out.println(iloscOsobStan);
        return iloscOsobStan;
    }

    public void summary() {
        for(Student singleStudent : listaStudentow){
            singleStudent.print();
        }

    }

    public void sortByName(){

        listaStudentow.sort(new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                return student1.imie.compareTo(student2.imie);
            }
        });

    }

    public void sortByPoints(){ //sortowanie malejace
        listaStudentow.sort(this::compare);
    }

    public void max(){
        Student student =  Collections.max(listaStudentow, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.iloscPunktow, o2.iloscPunktow);
            }
        });
        System.out.println(student.iloscPunktow);
    }

    public void show(Student student1){
        student1.print();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (-1)*Double.compare(o1.iloscPunktow, o2.iloscPunktow);
    }




}
