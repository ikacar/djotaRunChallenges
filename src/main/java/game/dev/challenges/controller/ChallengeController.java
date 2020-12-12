package game.dev.challenges.controller;

import game.dev.challenges.entity.Challenge;
import game.dev.challenges.repo.ChallengeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.List;

@RestController("/challenge")
public class ChallengeController {
    @Autowired
    ChallengeRepo challengeRepo;

    @PostMapping("/create")
    public void createChallenge(Challenge challenge)
    {
        //not null:
        //idrootplayer
        //idTargetPlayer
        //bet
        //rootResult
        //startTime

        challengeRepo.save(challenge);
    }
    @PostMapping("/response")
    public void challengeResponse(Long chellengeId, Long targetResult, Time endTime)
    {

    }
    @PostMapping("/delete/{id}")
    public void declineChallenge(@RequestParam Long id)
    {

    }
    @GetMapping("/getChellengesForPlayer")
    public List<Challenge> findAllForPlayer(Long playerId)
    {
        return null;
    }
    @GetMapping("/getChellengesByPlayer")
    public List<Challenge> findAllByPlayer(Long playerId)
    {
        return null;
    }


}
