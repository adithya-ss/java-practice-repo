public class Ferrari implements Car {
    // IOReader ioread = new IOReader();
    public void drive() {
        System.out.println("Ferrari's engine started.");
    }
    // Better and cleaner approach.
    public void close() {
        // Cleanup resources.
        System.out.println("Resource closed.");
    }
    
    // 1. No guarantee that this method will ever be called. JVM Controls it.
    // 2. If there is an exception which is not caught, the process stops and the objects move into zombie state.
    /* public void finalize() {
        ioread.close();
    }*/
}
