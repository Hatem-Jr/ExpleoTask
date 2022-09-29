import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpleoEmployeeTest {

    //Each time we are creating an employee we are testing hire
    @Test
    public void resignOrFire()
    {
        ExpleoEmployee  m = ExpleoEmployee.hire("Mohamed");
        ExpleoEmployee f = ExpleoEmployee.hire("Fadl");
        ExpleoEmployee  h = ExpleoEmployee.hire("Hatem");
        ExpleoEmployee.resignOrFire(f);
        boolean fired = true;
        String record = f.name + "-" + f.sapID;
        for(int i=0;i<ExpleoEmployee.employeesList.size();i++)
        {
            String r = ExpleoEmployee.employeesList.get(i);
            if(r.equals(record))
            {
                fired=false;
                break;
            }
        }
        assertTrue(fired);
    }

    @Test
    public void testToString()
    {
        ExpleoEmployee  m = ExpleoEmployee.hire("Mohamed");
        ExpleoEmployee f = ExpleoEmployee.hire("Fadl");
        ExpleoEmployee  h = ExpleoEmployee.hire("Hatem");

        assertEquals(m.toString(),"Mohamed-1");
        assertEquals(h.toString(),"Hatem-3");
        assertEquals(f.toString(),"Fadl-2");

    }

    @Test
    public void testAssign()
    {
        ExpleoEmployee  m = ExpleoEmployee.hire("Mohamed");
        ExpleoEmployee f = ExpleoEmployee.hire("Fadl");
        ExpleoEmployee  h = ExpleoEmployee.hire("Hatem");
        EngineeringExpleoEmployee.assign(m,"Website Developing Project");
        EngineeringExpleoEmployee.assign(h,"AI Model Developing Project");

        assertEquals(m.employeeProject,"Website Developing Project");
        assertEquals(f.employeeProject,"Not Assigned");
        assertEquals(h.employeeProject,"AI Model Developing Project");
    }
}