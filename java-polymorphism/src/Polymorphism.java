public class Polymorphism {
    public static void main(String[] args) throws Exception {
        Triangle tr = new Triangle();
        Square sq = new Square();
        Circle cr = new Circle();

        // This is incorrect since the object of one polygon does not identify the other.
        // Square[] shapes = {tr, sq, cr};

        // However, when polymorphism is used, this issue gets resolved.
        // Each of these shapes identify themselves as polygons. 
        Polygon[] shapes = {tr, sq, cr};
        for (Polygon poly : shapes) {
            poly.numberOfEdges();
        }
    }
}
