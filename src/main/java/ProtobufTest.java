import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ProtobufTest {
	public static void main(String[] args) throws IOException {
		serializationPB();
	}

	private static void serializationPB() throws FileNotFoundException, IOException {
		PersonOuterClass.Person.Builder builder = PersonOuterClass.Person.newBuilder();
		builder.
				setEmail("owen3@fcuh.com").setId(1).setName("owen3").build();
		FileOutputStream output = new FileOutputStream("Person.txt");
		builder.build().writeTo(output);
		output.close();
	}
	
	public static void readInput() throws IOException
	{
		FileInputStream INPUT = new FileInputStream("Person.txt");
		PersonOuterClass.Person person = PersonOuterClass.Person.parseFrom(INPUT);
		System.out.println(person);
	}
}
