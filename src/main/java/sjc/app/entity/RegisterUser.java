package sjc.app.entity;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "registeruser")
public class RegisterUser extends AbstractPersistable {


	private String name;
	private String lastName;
	private String password;
	private String login;

	public RegisterUser() {
	}

	@ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "friends",  joinColumns = {
		@JoinColumn(name = "fk_user1", nullable = false, updatable = false) },
	inverseJoinColumns = { @JoinColumn(name = "fk_user2",
			nullable = false, updatable = false) })
	private List<RegisterUser> friends;

	@OneToMany( mappedBy = "idU", fetch = FetchType.LAZY)
	private List<Authorities> authorities;

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "login")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authorities> authorities) {
		this.authorities = authorities;
	}

	public List<RegisterUser> getFriends() {
		return friends;
	}

	public void setFriends(List<RegisterUser> friends) {
		this.friends = friends;
	}

}