public class Humans1
{
    private String name,gender,acn;
    public void set_Humans(String name,String gender,String acn)
    {
        this.name=name;//this:Self-reference.  this->name=name;
        this.gender=gender;
        this.acn=acn;
    }
    public void display_Humans()
    {
        System.out.print("\nAdharCard Number:"+acn+"\tName:"+name+"\tGender:"+gender);
    }
    public String get_adhar()
    {
        return acn;
    }
}
