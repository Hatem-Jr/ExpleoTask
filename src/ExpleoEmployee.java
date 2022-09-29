import java.util.*;
public class ExpleoEmployee
{
    static ArrayList<String> employeesList = new ArrayList<String>();
    static int counter = 1;
    String name;
    int sapID;
    String employeeProject = "Not Assigned";

    public ExpleoEmployee(String name)
    {
        this.name = name;
        sapID = counter;
        counter++;
        String record = name + "-" + sapID;
        employeesList.add(record);
    }

    public static ExpleoEmployee hire(String name)
    {
        ExpleoEmployee x = new ExpleoEmployee(name);
        return x;
    }

    public static void resignOrFire(ExpleoEmployee employee)
    {
        String name = employee.name;
        int sapID = employee.sapID;
        String record = name + "-" + sapID;
        for (int i=0;i< employeesList.size();i++)
        {
            if (record.equals(employeesList.get(i)))
            {
                employeesList.remove(i);
                break;
            }
        }
    }

    public String toString()
    {
        return name + "-" + sapID;
    }

}
