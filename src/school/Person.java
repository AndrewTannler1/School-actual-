// @author 143000438
// Andrew Tannler
package school;
import java.util.ArrayList;
public class Person {
    enum Gender{
        Male,Female
    }
    private static int currentPeopleIndex=0;
//    private static Person people[]=new Person[numPeople];
    private static ArrayList<Person> people=new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp=new Person(_name,_gender,_weight);
        people.add(temp);
        return temp;
    }
    Person()
    {
        name="No Name";
        gender=Gender.Male;
    }
    Person(String _name, Gender _gender, int _weight)
    {
        name=_name;
        gender=_gender;
        weight=_weight;
    }
     public void setWeight(int _weight)
   {
       weight=_weight;
   }
   public int getWeight()
   {
       return weight;
   }
   public void setName(String _name)
   {
       name=_name;
   }
   public String getName()
   {
       return name;
   }
   public void setGender(Gender _gender)
   {
       gender=_gender;
   }
   public Gender getGender()
   {
       return gender;
   }
   public static void printNames(Gender _gender)
   {
       System.out.println(_gender+"s:");
       for(Person temp: people)
       {
           if(temp.gender==_gender)
               System.out.println(temp.getName());
       }
   }
     public static void printNames()
   {
       System.out.println("All names:");
       for(Person temp: people)
       {
               System.out.println(temp.getName());
       }
   }
     public static void printWeight()
   {
       System.out.println("All peoples weight:");
       for(Person temp : people)
       {
           if(temp !=null)
           {
               System.out.println(temp.getName()+" is "+temp.getWeight()+" pounds");
           }
           
       }
   }
   public String toString()
   {
       return("Hi my name is "+name);
   }
   
    
    
}
