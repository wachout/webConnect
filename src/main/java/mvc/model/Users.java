package mvc.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component("users")
@XmlRootElement
public class Users {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER_ID
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.name
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.age
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.sex
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.phone
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.qq
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    private String qq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER_ID
     *
     * @return the value of users.USER_ID
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER_ID
     *
     * @param userId the value for users.USER_ID
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.name
     *
     * @return the value of users.name
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.name
     *
     * @param name the value for users.name
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.age
     *
     * @return the value of users.age
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.age
     *
     * @param age the value for users.age
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.sex
     *
     * @return the value of users.sex
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.sex
     *
     * @param sex the value for users.sex
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.phone
     *
     * @return the value of users.phone
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.phone
     *
     * @param phone the value for users.phone
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.qq
     *
     * @return the value of users.qq
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.qq
     *
     * @param qq the value for users.qq
     *
     * @mbggenerated Sun Jan 25 16:43:46 CST 2015
     */
    public void setQq(String qq) {
        this.qq = qq;
    }
}