package objectInOtherObjects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	private static final String nickName = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons=new ArrayList<Person>();
		ArrayList<PersonShare> personShares=new ArrayList<PersonShare>(); 
		ArrayList<PersonLike> personLikes=new ArrayList<PersonLike>();
		persons.add(new Person(newId(persons),"EmirCopyCenter","Emirr","Akbaþoðlu","ERKEK"));
		persons.add(new Person(newId(persons),"Murat","Oðuz","Düzgün","ERKEK"));
		persons.add(new Person(newId(persons),"Yaþar","Beytullah","Sarý","ERKEK"));
		personShares.add(new PersonShare(newIdShare(personShares),findPersonByNickName("EmirCopyCenter", persons ) , "Java ya Merhaba","sfasfsa sdsadas sdasf safsadfsa"));
		
	personLikes.add(
				new PersonLike(newIdLike(personLikes), personShares.get(0),  findPersonByNickName("EmirCopyCenter", persons))
			);
	System.out.println(personShares.get(0).getPerson().getName());
	
	
	
	
	
	
	
	
	}
	public static int newId(ArrayList<Person> searchList) {
		int maxId=0;
		for(Person person:searchList) {
			if(person.getId()>maxId)maxId=person.getId();
		
		}
		return maxId+1;
	
	
	
	}

public static int newIdShare(ArrayList<PersonShare> searchList) {
	int maxId=0;
	for(PersonShare personShare:searchList) {
		if(personShare.getId()>maxId)maxId=personShare.getId();
	
	}
	return maxId+1;
}
public static Person findPersonByNickName(String nickName,ArrayList<Person> serarchList){
	for(Person person:serarchList) {
		if(person.getNickName()==nickName) return person;
	}
    return null;		

	}
public static int newIdLike(ArrayList<PersonLike> searchList) {
	int maxId=0;
	for(PersonLike personShare:searchList) {
		if(personShare.getId()>maxId)maxId=personShare.getId();

}	
	return maxId+1;
	}
	
}

