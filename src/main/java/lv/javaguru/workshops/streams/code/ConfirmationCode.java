package lv.javaguru.workshops.streams.code;

import java.time.LocalDateTime;

public class ConfirmationCode {

    private String code;
    private LocalDateTime expireAt;

    public ConfirmationCode(String code, LocalDateTime expireAt) {
        this.code = code;
        this.expireAt = expireAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(LocalDateTime expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfirmationCode that = (ConfirmationCode) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return expireAt != null ? expireAt.equals(that.expireAt) : that.expireAt == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (expireAt != null ? expireAt.hashCode() : 0);
        return result;
    }
}
