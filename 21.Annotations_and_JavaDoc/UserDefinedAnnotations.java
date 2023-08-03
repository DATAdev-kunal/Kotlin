import java.lang.annotation.Annotation;

@interface MyAnnot 
{
    String name();
    String project();
    String date();
    String version();
}

public class UserDefinedAnnotations {

@MyAnnot(name="kunal",project = "learnJava",date = "19-july-2023",version = "1.0.1")
    public static void main(String[] args) {
        
    }
}
