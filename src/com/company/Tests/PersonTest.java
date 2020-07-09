import com.company.Person;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{

    @Test
    public void infectTest()
    {
        Person person = new Person(false, 2, 2);
        Person infectee = new Person(true, 0, 0);
        infectee.infect(person);
        assertTrue(person.isSick(), "test");

    }

    @Test
    public void sneezeContactTest()
    {
        Person person = new Person(false, 2, 2);
        Person infectee = new Person(true, 0, 0);
        assertEquals(infectee.getXCoordinate()+2, infectee.sneeze(person));
    }

    @Test
    public void sneezeNoContactTest()
    {
        Person person = new Person(false, 5, 5);
        Person infectee = new Person(true, 0, 0);
        assertEquals(-1, infectee.sneeze(person));
    }

}