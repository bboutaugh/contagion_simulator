import com.company.Person;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    Person person = new Person(false, 0, 0);
    Person infectee = new Person(true, 5, 5);
    @Test
    public void infectTest()
    {
        infectee.infect(person);
        assertTrue(person.isSick(), "test");

    }

}