
package school;
 // @author 143000438
 //Andrew Tannler
public class School {

    public static void main(String[] args) {
        Person joe= Person.addPerson("Joe", Person.Gender.Male,180);
        Person jack = Person.addPerson("Jack", Person.Gender.Male,165);
        Person john = Person.addPerson("John", Person.Gender.Male,150);
        Person jill = Person.addPerson("Jill", Person.Gender.Female,140);
        Person jessica = Person.addPerson("Jessica", Person.Gender.Female,120);
        Person jenifer = Person.addPerson("Jenifer", Person.Gender.Female,100);
        jill.setName("Julia");
        Person.printNames();
        System.out.println(" ");
        Person.printNames(Person.Gender.Male);
        System.out.println(" ");
        Person.printNames(Person.Gender.Female);
        System.out.println(" ");
        System.out.println(joe);
        System.out.println(jack);
        System.out.println(john);
        System.out.println(jill);
        System.out.println(jessica);
        System.out.println(jenifer);
        System.out.println(" ");
        Person.printWeight();
    }
}
