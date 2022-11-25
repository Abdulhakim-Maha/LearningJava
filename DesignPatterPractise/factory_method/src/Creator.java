public abstract class Creator {
    void printToScreen(){
        Log log = createLog();
        log.console();
    }
    abstract Log createLog();
}
