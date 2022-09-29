public class EngineeringExpleoEmployee
{

    public static void assign(ExpleoEmployee employee,String projectName)
    {
        boolean isHired = false;
        String name = employee.name;
        int sapID = employee.sapID;
        String record = name + "-" + sapID;
        for(int i=0;i<ExpleoEmployee.employeesList.size();i++)
        {
            if(record.equals(ExpleoEmployee.employeesList.get(i)))
            {
                isHired = true;
                break;
            }
        }

        if(isHired==true)
            if(employee.employeeProject.equals("Not Assigned"))
                employee.employeeProject = projectName;



    }

    public static void main(String[]args)
    {
        //Testing hire(String name)
        /*ExpleoEmployee  m = ExpleoEmployee.hire("Mohamed");
        ExpleoEmployee f = ExpleoEmployee.hire("Fadl");
        ExpleoEmployee  h = ExpleoEmployee.hire("Hatem");
        ExpleoEmployee  s = ExpleoEmployee.hire("Sayed");
        ExpleoEmployee  e = ExpleoEmployee.hire("Easy");*/

        //Testing toString()
        /*System.out.println(m.toString());
        System.out.println(f.toString());
        System.out.println(h.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println("");*/



        //Testing resignorFire(ExpleoEmployee employee)
        /*
        for(int i=0;i<ExpleoEmployee.employeesList.size();i++)
        {
            System.out.println(ExpleoEmployee.employeesList.get(i));
        }
        System.out.println("");
        ExpleoEmployee.resignOrFire(h);
        for(int i=0;i<ExpleoEmployee.employeesList.size();i++)
        {
            System.out.println(ExpleoEmployee.employeesList.get(i));
        }*/

        //Testing assign(ExpleoEmployee x, String projectName)
        /*assign(m,"Website Developing Project");
        assign(e,"AI Model Developing Project");
        assign(f,"Machine Learning Project");
        assign(h,"Data Science Project");
        assign(s,"Test all above Projects ");

        System.out.println(m.employeeProject);
        System.out.println(e.employeeProject);
        System.out.println(f.employeeProject);
        System.out.println(h.employeeProject);
        System.out.println(s.employeeProject);*/
    }
}
