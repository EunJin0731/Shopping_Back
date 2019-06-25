package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Review;
import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Repository.ReviewRepository;
import kr.hs.dgsw.shopping_back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void init(){
        /*User u = this.userRepository.save(new User("abc","1234","홍길동","1234-1234", "1234-1234", "12322", "대한민국", "123@dggg.gg"));
        this.reviewRepository.save(new Review(u.getName(), "후기 남깁니다", u.getAccount(), "굳"));*/
    }
}
