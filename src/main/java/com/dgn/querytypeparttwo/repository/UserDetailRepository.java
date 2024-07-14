package com.dgn.querytypeparttwo.repository;

import com.dgn.querytypeparttwo.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {
}
