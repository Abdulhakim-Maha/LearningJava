package users;

public class User {
    private final String firtname;
    private final String lastname;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuilder userBuilder) {
        this.firtname = userBuilder.firstname;
        this.lastname = userBuilder.lastname;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    @Override
    public String toString() {
        return "User: " +
                "firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' ;
    }

    public String getFirtname() {
        return firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstname;
        private final String lastname;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
