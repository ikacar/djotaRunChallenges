package game.dev.challenges.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long idRootPlayer;
    Long idTargetPlayer;
    Long rootResult;
    Long targetResult;
//    boolean accepted;
    Long winnerId;
    Time startTime;
    Time endTime;
    Long bet;

    public Challenge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRootPlayer() {
        return idRootPlayer;
    }

    public void setIdRootPlayer(Long idRootPlayer) {
        this.idRootPlayer = idRootPlayer;
    }

    public Long getIdTargetPlayer() {
        return idTargetPlayer;
    }

    public void setIdTargetPlayer(Long idTargetPlayer) {
        this.idTargetPlayer = idTargetPlayer;
    }

    public Long getRootResult() {
        return rootResult;
    }

    public void setRootResult(Long rootResult) {
        this.rootResult = rootResult;
    }

    public Long getTargetResult() {
        return targetResult;
    }

    public void setTargetResult(Long targetResult) {
        this.targetResult = targetResult;
    }

//    public boolean isAccepted() {
//        return accepted;
//    }
//
//    public void setAccepted(boolean accepted) {
//        this.accepted = accepted;
//    }

    public Long getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Long winnerId) {
        this.winnerId = winnerId;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Long getBet() {
        return bet;
    }

    public void setBet(Long bet) {
        this.bet = bet;
    }
}
