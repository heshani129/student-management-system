public class Student {
    private int rollNum;
    private String name;
    private String clName;
    private String city;
    private double percentage;
 Student(){

 }
    public Student( String name, String clName, String city, double percentage) {
        this.name = name;
        this.clName = clName;
        this.city = city;
        this.percentage = percentage;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public static void main(String[]args){

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", clName='" + clName + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
