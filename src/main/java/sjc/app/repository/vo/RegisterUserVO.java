package sjc.app.repository.vo;

import sjc.app.entity.RegisterUser;

import java.util.List;

/**
 * Created by Aleks69 on 12.07.2016.
 */
public class RegisterUserVO {

    private long id;
    private String name;
    private String lastName;
    private String password;
    private String login;

    public List<RegisterUserVO> getFriends() {
        return friends;
    }

    public void setFriends(List<RegisterUserVO> friends) {
        this.friends = friends;
    }

    private List<RegisterUserVO> friends;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public RegisterUserVO() {
    }

    public RegisterUserVO(long id,String name, String lastName, String password, String login) {
        this.id=id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.login = login;
        this.friends=null;
        }

    public RegisterUserVO(long id,String name, String lastName, String password, String login,List<RegisterUserVO> friends) {
        this.id=id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.login = login;
        this.friends=friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
