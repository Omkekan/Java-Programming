public class Human
{
    private String name;
    public String gender;

    public Human() {
        this.name = null;
        this.gender = null;
    }

    public boolean display_Human(Object dummy) {
        return this.name == null;
    }

    public void set_Human(String name,String gender)
    {
        this.name=name;//this:Self-reference.  this->name=name;
        this.gender=gender;
    }
    public void display_Human()
    {
        System.out.print("\nHi i am "+name+" and i am a "+gender);
    }
    public String get_name()
    {
        return name;
    }
    public String get_gender()
    {
        return gender;
    }
}
