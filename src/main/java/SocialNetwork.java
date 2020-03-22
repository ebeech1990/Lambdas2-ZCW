import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialNetwork implements CheckPerson{
    private List<Person> users;

    public SocialNetwork(){
        users = new ArrayList<>();
    }

    public void addUsers(Person... p){
        users.addAll(Arrays.asList(p));
    }

    public List<Person> getUsers(){
        return users;
    }




    public void printUsersThat(List<Person> users, CheckPerson tester) {
        for(Person p : users){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        return p.age<40;
    }
}
