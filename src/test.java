class stupid {
    private String type;

    public stupid(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}

public class test {
    public static void main(String[] args) {
        stupid s = new stupid("fuck");
        System.out.println(s.getType());

        s.setType("you");
        System.out.println(s.getType());
    }
}
