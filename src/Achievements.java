public enum Achievements {
    GETTING_STARTED(0,"Your collecting journey has began!", 1),
    WAY_TO_GO(1, "You collected 10 Apples!", 10),
    MASTERFUL_COLLECTION(2, "100 Apples is an impressive feat", 100);
    private final int id;
    private final String s;
    private final int amount;

    Achievements(int id, String s, int amount) {
        this.id = id;
        this.s = s;
        this.amount = amount;

    }
    public int getId(){
        return id;
    }
    public String getMessage(){
        return s;
    }
    public int getAmount(){
        return amount;
    }
}
