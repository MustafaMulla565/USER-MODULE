package com.example.USER_MODULE.Repository;




import com.example.USER_MODULE.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByUser_Id(Long userId);
    // You can fetch profile by userId
  //  Profile findByUser_Id(Long userId);  // Correct query for userId

}
