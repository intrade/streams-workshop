package lv.javaguru.workshops.streams.code;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ConfirmationCodeRepository {

    private final Set<ConfirmationCode> codes;

    public ConfirmationCodeRepository() {
        Set<ConfirmationCode> codes = new HashSet<>();
        codes.add(new ConfirmationCode("01EA", LocalDateTime.now().plusMinutes(5)));
        this.codes = codes;
    }

    public ConfirmationCode findByCode(String code){
        Asserts.notEmpty(code);
        for (ConfirmationCode cc : codes) {
            if (code.equals(cc.getCode())){
                return cc;
            }
        }
        return null;
    }
}
