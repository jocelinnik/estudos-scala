public class FotoJava {
    private final String id;
    private final String owner;

    public FotoJava(String id, String owner){
        this.id = id;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }
}
