import java.util.List;

public class Student implements Comparable<Student> {
    String imie;
    String nazwisko;
    StudentCondition stanStudenta;
    int rokUrodzenia;
    double iloscPunktow;

    public Student(String imie1, String nazwisko1, StudentCondition stanStudenta1, int rokUrodzenia1, double iloscPunktow1){
        imie=imie1;
        nazwisko=nazwisko1;
        stanStudenta=stanStudenta1;
        iloscPunktow=iloscPunktow1;
        rokUrodzenia=rokUrodzenia1;
    }

    public double getPunkty(){
        return iloscPunktow;
    }
    public void setPunkty(double punkty){
        this.iloscPunktow=punkty;
    }

    public void setStanStudenta(StudentCondition stanStudenta1){
        this.stanStudenta=stanStudenta1;
    }
    public StudentCondition getStanStudenta(){
        return this.stanStudenta;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public String getImie() { return this.imie; }



    public void print(){
        System.out.println("Imię studenta: "+imie);
        System.out.println("Nazwisko studenta: "+nazwisko);
        System.out.println("Stan studenta: "+stanStudenta);
        System.out.println("Rok urodzenia: "+rokUrodzenia);
        System.out.println("Ilosc punktow: "+iloscPunktow);
    }


    @Override
    public int compareTo(Student student1) {
        if(this.nazwisko == student1.nazwisko){
            return 0;
        }
        else {
            return 1;
        }
    }
    public int compareTo(String student1) {
        if(this.nazwisko == student1){
            return 0;
        }
        else {
            return 1;
        }
    }
}
