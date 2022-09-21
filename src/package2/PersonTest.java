package package2;
import org.junit.Assert;
import org.junit.Test;
import package1.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void main() {
        Person[] person;
        person = new Person[12];
        // person1=new Person();
        int i=0;

        while (i<10) {
            person[i]=new Person();
            i++;
        }
        person[3].name = "hakan";
        person[2].name = "levent";
        assertEquals("hakan", person[3].name);
        Assert.assertNotSame(person[3],person[2]);
        Assert.assertNotNull(person[3]);
        Assert.assertNull(person[7]);
         // Person gurkan32350 = new Person();
        //Person levent35500 = new Person();
        //System.out.println("Hello world!");
        /**
        if (person[3] != null && person[2] != null){
            System.out.println("person2 mevcut ismi :  " + person[2].name );
            System.out.println("person3 mevcut ismi :  " + person[3].name );
        }**/
    }

}

