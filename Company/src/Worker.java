public class Worker {

    String firstName;
    String secondName;

    public Worker(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    void show(){
        System.out.print("Name: "+firstName+"\nSecond Name: "+secondName);
    }
}
