package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserBean {
    @Inject
    private UserRepository userRepository;

    public String getFullName(int id){
    User user = userRepository.findById(id);
        return user.getName();
    }
}

