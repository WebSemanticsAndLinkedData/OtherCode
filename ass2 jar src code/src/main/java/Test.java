import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

public class Test {
 public static void main(String [] args){
	Model model = ModelFactory.createDefaultModel();
	model.read(args[0]+".rdf");
	model = ModelFactory.createDefaultModel();
	model.read(args[0]+".ttl");
 }
}