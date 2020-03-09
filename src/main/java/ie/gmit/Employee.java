package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String number;

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPPS() {
        return PPS;
    }

    public String getNumber() {
        return number;
    }
    private String employmentType;
    private int age;

    public Employee(String title, String name, String PPS, String number, String employmentType, int age) {
        if(title.equals("mr")||title.equals("mrs")||title.equals("ms")){
            this.title = title;
        }
        if(name.length()>3 && name.length()< 25){
            this.name = name;
        }
    }
}
