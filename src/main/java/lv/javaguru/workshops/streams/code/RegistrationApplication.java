package lv.javaguru.workshops.streams.code;

import java.time.LocalDateTime;

public class RegistrationApplication {

    private String nickname;

    private String facebookId;

    private String twitterId;

    public RegistrationApplication(){}

    public RegistrationApplication(String nickname,
                                   String facebookId,
                                   String twitterId) {
        this.nickname = nickname;
        this.facebookId = facebookId;
        this.twitterId = twitterId;
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
}
