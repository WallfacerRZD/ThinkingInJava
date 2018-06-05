package chapter20.database;

/**
 * @author WallfacerRZD
 * @date 2018/6/5 11:40
 */
@DBTable(name = "MEMBER")
public class Member {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    private static int memberCount;

    @SQLString(value = 30)
    private String firstName;

    @SQLString(value = 50)
    private String lastName;

    @SQLInteger
    private Integer age;

    @SQLString(value = 30, constrains = @Constrains(primaryKey = true))
    private String handle;

    @Override
    public String toString() {
        return handle;
    }
}
