import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class TestPerson {
    Person leslie;
    Person ron;
    Person chris;
    SocialNetwork sn;



    @Before
    public void init(){
        leslie = new Person("Leslie", LocalDate.of(1985,11,12), 35,
                Person.Sex.FEMALE, "leslie@knope.org");
        ron = new Person("Ron", LocalDate.of(1978,02,12),42,
                Person.Sex.MALE, "ron@swanson.org");
        chris = new Person("Chris", LocalDate.of(1981, 2, 10), 39,
                Person.Sex.MALE, "chris@traeger.org");
         sn = new SocialNetwork();
    }

    @Test
    public void addUsers(){
        sn.addUsers(leslie, ron, chris);
        Assert.assertEquals(3, sn.getUsers().size());
    }

    @Test
    public void anonAgeTest(){
        sn.addUsers(leslie, ron, chris);
        CheckPerson cp = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.age<40;
            }
        };
        sn.printUsersThat(sn.getUsers(), cp);

    }

    @Test
    public void lambdaAgeTest(){
        sn.addUsers(leslie, ron, chris);
        CheckPerson cp = p -> p.age<40;
        sn.printUsersThat(sn.getUsers(), cp);
    }




}
