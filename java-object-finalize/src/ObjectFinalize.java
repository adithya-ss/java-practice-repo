public class ObjectFinalize {
    public static void main(String[] args) {
        Ferrari fer = new Ferrari();
        try {
            fer.drive();
        } finally {
            fer.close();
        }
    }
}
