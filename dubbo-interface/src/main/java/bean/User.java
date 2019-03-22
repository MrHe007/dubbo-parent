package bean;/**
 * @author shkstart
 * @create 2019-03-22 9:02
 */

/**
 * @author hechen
 * @data 2019/3/22
 *
 */
public class User {
    private int id;
    private String name;

    public User(){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
