package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {
    @Inject
    private UserRepository userRepository;

    public String getFullName(int id) {
        User user = userRepository.findById(id);
        return user.getFirstName() + " " + user.getLastName();
    }

    private User newuser = new User();

    public User getNewuser() {
        return newuser;
    }

    public String submitUser() {
        userRepository.addUser(newuser);
        return "usertable.faces";
    }
}

