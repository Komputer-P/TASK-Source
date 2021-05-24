package kom.task.domain.dailydo.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Long> {
    List<Todo> findAllByUserId(String userId);

    @Modifying
    @Query("delete from User where userId = :userId")
    void deleteAllByUserId(@Param("userId") String userId);
}
