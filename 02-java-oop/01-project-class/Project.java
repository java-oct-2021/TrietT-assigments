
public class Project
{
    //Attributes / File
    private String name;
    private String description;

    //Method  method called elevatorPitch that will return 
    // the name and description separated by a colon.
    public String elevatorPitch()
    {
        return this.name + " : " + this.description;
    }

    //Constructor method
    public Project() {
        this.name = "Given name";
        this.description = "Given description";
    }

    public Project(String name) 
    {
        this.name = name;
        this.description = "Given description";
    }

    public Project(String name, String description) 
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDes()
    {
        return this.description;
    }

    public void setName(String name)
    {
        this.name = name ;
    }
    public void setDes(String description)
    {
        this.description= description ;
        
    }


}