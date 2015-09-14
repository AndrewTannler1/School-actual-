
package school;
import java.util.ArrayList;
public class Course {
    enum Type{
        Math,Science,English,History,Language,Elective,PE
    }
    private static ArrayList<Course> courses=new ArrayList<Course>();
    private String name;
    private int period;
    private Type type;
    
     public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp=new Course(_name,_type,_period);
        courses.add(temp);
        return temp;
    }
    Course()
    {
        name="Balnk";
        period=0;
        type=Type.Elective;
    }
     Course(String _name,Type _type,int _period)
    {
        name=_name;
        period=_period;
        type=_type;
    }
     public void setName(String _name)
   {
       name=_name;
   }
   public String getName()
   {
       return name;
   }
   public void setPeriod(int _period)
   {
       period=_period;
   }
   public int getPeriod()
   {
       return period;
   }
   public void setType(Type _type)
   {
       type=_type;
   }
   public Type getType()
   {
       return type;
   }
//    public static void printCourse()
//   {
//       System.out.println("");
//       for(Course temp: courses)
//       {
//               System.out.println(temp.());
//       }
//  }
}
