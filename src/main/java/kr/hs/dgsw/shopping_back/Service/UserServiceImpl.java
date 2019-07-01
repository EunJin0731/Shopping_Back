package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User Login(User user) {
        Optional<User> found = this.userRepository.findByAccountAndPassword(user.getAccount(), user.getPassword());
        if(found.isPresent()){
            if(found.get().getPassword().equals(user.getPassword())){
                return found.get();
            }
        }
        return null;
    }
}
