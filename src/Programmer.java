public class Programmer extends Employee{
    protected String languages;

    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    /*@Override
    public String toString() {
        System.out.println("name: " + getName()+ ", surname: " + getSurname()+", languages: " + getLanguages());
        return null;
    }*/

    @Override
    public String toString() {
        return "Programmer{" +
                "languages='" + languages + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
