package serializationtest;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "PEOPLE")
@XmlType(propOrder = { "id", "name", "value" })
public class People implements Serializable{

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8482481339253976692L;
	
	private int id = 1;
	private String name = "owen";
	private double value = 0;
	
	public People(int i, String string, double d) {
		this.id = i;
		this.name = string;
		this.value = d;
	}
	public People()
	{
		
	}

    @XmlElement(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="VALUE")
	public double getValue() {
		return value;
	}
	public void setValue(double sex) {
		this.value = sex;
	}

	@XmlElement(name="ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
