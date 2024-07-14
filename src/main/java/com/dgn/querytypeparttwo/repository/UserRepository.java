package com.dgn.querytypeparttwo.repository;

import com.dgn.querytypeparttwo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = """
            select U.* from T_USER as U 
            inner join T_USER_DETAIL as UD 
            on U.id = UD.user_id
            where UD.email=?
            """,nativeQuery = true)
    User getUserByUserDetailEmail(String email);

    User findUserByUserDetails_Email(String email);

}
