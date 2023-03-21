import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassContainer {
    public Map<String, Class > mapClass = new HashMap<>();
    public void addClass(String nazwaGrupy, List<Student> lista, double pojemnosc){
        mapClass.put(nazwaGrupy, new Class(nazwaGrupy,lista, (int)pojemnosc));
    }


    public void removeClass(String nazwaGrupy){
        mapClass.remove(nazwaGrupy);
    }

    public List<Class> findEmpty(){
        List empty=new ArrayList();
        for(Class singleGroup : mapClass.values()){
            if(singleGroup.getListaStudentow().size()==0){
                empty.add(singleGroup);
                System.out.println("Pusta grupa: "+singleGroup.nazwaGrupy);
            }
        }
        System.out.println("");
        return empty;
    }


    public void summary(){
        for (Class singleGroup : mapClass.values()){
            System.out.println("\nnazwa grupy: \t\t\t"+singleGroup.nazwaGrupy);

            System.out.println("Pojemnosc max. klasy: \t" +((double)(singleGroup.listaStudentow.size())/(double)(singleGroup.maxIloscStudentow)*100.0)+" %");
        }
    }
     public void print(){
        System.out.println(mapClass);
     }

}
