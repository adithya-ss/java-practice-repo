abstract class ProgrammingLanguages {
    public void application() {
        System.out.println("Java is predominantly used in backend development.");
        System.out.println("Html is predominantly used in frontend development.");
    }
    public abstract void createdBy();
}

class Java extends ProgrammingLanguages {
    public void createdBy() {
        System.out.println("Java was created by James Gosling.");
    }
}

class Html extends ProgrammingLanguages {
    public void createdBy() {
        System.out.println("HTML was created by Tim Berners-Lee.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Java java = new Java();
        Html html = new Html();
        java.application();
        java.createdBy();
        html.createdBy();
    }
}

