package lv.javaguru.workshops.streams.t3_methodreferences;

import lv.javaguru.workshops.streams.code.ConfirmationCode;
import lv.javaguru.workshops.streams.code.ConfirmationCodeRepository;
import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.function.Function;

public class M0_UserBlockService {

    private UserRepository userRepository = new UserRepository();
    private ConfirmationCodeRepository confirmationCodeRepository = new ConfirmationCodeRepository();

    public boolean blockByFacebookId(String facebookId, String confirmationCode){
        return blockBy(confirmationCode, facebookId, userRepository::findByFacebookId);
    }

    public boolean blockByNickname(String nickname, String confirmationCode){
        return blockBy(confirmationCode, nickname, userRepository::findByNickname);
    }

    protected boolean blockBy(String confirmationCode, String property, Function<String, User> findFunction){
        ConfirmationCode code = confirmationCodeRepository.findByCode(confirmationCode);
        if (code == null){
            return false;
        }
        User user = findFunction.apply(property);
        if (user == null){
            return false;
        }
        user.setActive(false);
        return true;
    }

}
