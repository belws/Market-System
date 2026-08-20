public enum Achievements {
    GETTING_STARTED(0,"Your collecting journey has began!"),
    WAY_TO_GO(1, "You collected 10 Apples!"),
    MASTERFUL_COLLECTION(2, "100 Apples is an impressive feat");
    private final int id;
    private final String s;

    Achievements(int id, String s) {
        this.id = id;
        this.s = s;

    }
    public int getId(){
        return id;
    }
    public String getMessage(){
        return s;
    }
}
