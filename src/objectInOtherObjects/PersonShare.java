package objectInOtherObjects;

public class PersonShare {
	private int id;
	private Person person;
	private String capation;
	private String content;
	public PersonShare() {
		super();
	}
	public PersonShare(int id, Person person, String capation, String content) {
		super();
		this.id = id;
		this.person = person;
		this.capation = capation;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getCapation() {
		return capation;
	}
	public void setCapation(String capation) {
		this.capation = capation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
