import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class TestHeap {
	
	public static void main(String[] args) {

		Heap<Student> heap = new Heap<Student>();

		InputStreamReader reader = new InputStreamReader(System.in);
	
		StreamTokenizer tokens = new StreamTokenizer(reader);
		
		try {
			while (tokens.nextToken() == StreamTokenizer.TT_WORD){		//while next token is string
				switch (tokens.sval){
					case ("Add"):{							
						tokens.nextToken();
						if (!tokens.sval.equals("pty")) {
							System.out.println("The command 'add " + tokens.sval + "' is invalid");
							break;
						}
						String id;
						double grade;
						double age;
						
						try {
							tokens.nextToken();
							id = tokens.sval;
							tokens.nextToken();
							grade = tokens.nval;
							tokens.nextToken();
							age = tokens.nval;
						} catch (Exception e) {
							System.out.println("Invalid input. Student's values should be entered as following: id grade age ");
							break;
						}
						
						Student student = new Student(id,grade,age);
						heap.insert(new HeapData<Student>(student,grade));
						System.out.println("student added succesfully");
						} break;
					
					case("Del"):{
						heap.removeMin();
						System.out.println("lowest priority student deleted");
					} break;
					
					case("E"):{
						System.out.println("student heap is " + (heap.isEmpty() ? "empty" : "not empty"));
					} break;
					
					case ("F"):{
						System.out.println("student heap is " + (heap.isFull() ? "full" : "not full"));
					} break;
					
					case ("C"):{
						heap.clear();
					} break;
					
					case ("P"):{
						heap.showStructure();
					} break;

					case ("Q"):{								
						return;
					} 
					
					default:	
						System.out.println("The command '" + tokens.sval + "' is invalid");
				}
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
	}
	}
}
