public class Human_2
{
    private String name;
    public String gender;

    public void set_Human(String name,String gender)
    {
        this.name=name;//this:Self-reference.  this->name=name;
        this.gender=gender;
    }
    public void display_Human()
    {
        System.out.print("\nHi i am "+name+" and i am a "+gender);
    }
    public static void main(String[] args) {
        Human_2 h=new Human_2();
        h.set_Human("champak","male" +
                "");
        h.display_Human();
    }
}
