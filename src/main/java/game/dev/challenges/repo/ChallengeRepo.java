package game.dev.challenges.repo;

import game.dev.challenges.entity.Challenge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepo extends CrudRepository<Challenge, Long> {
}
