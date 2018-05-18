package lv.javaguru.workshops.streams.code;

import java.time.LocalDateTime;
import java.util.Set;

public class User {

    private String nickname;

    private LocalDateTime createdAt;

    private String facebookId;

    private String twitterId;

    private boolean active;

    public User(){}

    public User(String nickname, LocalDateTime createdAt, boolean active) {
        this.nickname = nickname;
        this.createdAt = createdAt;
        this.active = active;
    }

    public User(String nickname,
                LocalDateTime createdAt,
                boolean active,
                String facebookId,
                String twitterId) {
        this(nickname, createdAt, active);
        this.facebookId = facebookId;
        this.twitterId = twitterId;
        this.active = active;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (active != user.active) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        if (facebookId != null ? !facebookId.equals(user.facebookId) : user.facebookId != null) return false;
        if (twitterId != null ? !twitterId.equals(user.twitterId) : user.twitterId != null) return false;
        return createdAt != null ? createdAt.equals(user.createdAt) : user.createdAt == null;
    }

    @Override
    public int hashCode() {
        int result = nickname != null ? nickname.hashCode() : 0;
        result = 31 * result + (facebookId != null ? facebookId.hashCode() : 0);
        result = 31 * result + (twitterId != null ? twitterId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", facebookId='" + facebookId + '\'' +
                ", twitterId='" + twitterId + '\'' +
                '}';
    }
}
