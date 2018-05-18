package lv.javaguru.workshops.streams.t1_codeduplicates;

import lv.javaguru.workshops.streams.code.ConfirmationCode;
import lv.javaguru.workshops.streams.code.ConfirmationCodeRepository;
import lv.javaguru.workshops.streams.code.User;
import lv.javaguru.workshops.streams.code.UserRepository;

import java.util.Comparator;
import java.util.List;

public class C2_UserBlockService {

    static UserRepository userRepository = new UserRepository();

    static ConfirmationCodeRepository confirmationCodeRepository = new ConfirmationCodeRepository();

    //Lambda is lazy
    //todo : create one blockBy and reuse it in blockByFacebookId and blockByNickname

    public static void main(String[] args) {
        boolean isJoseBlocked = blockByFacebookId("jose-facebook", "01EA");
        System.out.println("Jose blocked = " + isJoseBlocked);

        boolean isJohn89Blocked = blockByNickname("john89", "01EA");
        System.out.println("John89 blocked = " + isJohn89Blocked);

        boolean isUnknownBlocked = blockByNickname("unknown", "01EA");
        System.out.println("Unknown blocked = " + isUnknownBlocked);

        boolean isBlockedByWrongCode = blockByFacebookId("jose-facebook", "wrong code");
        System.out.println("Block jose with wrong code = " + isBlockedByWrongCode);
    }

    static boolean blockByFacebookId(String facebookId, String confirmationCode){
        ConfirmationCode code = confirmationCodeRepository.findByCode(confirmationCode);
        if (code == null){
            return false;
        }
        User user = userRepository.findByFacebookId(facebookId);
        if (user == null){
            return false;
        }
        user.setActive(false);
        return true;
    }

    static boolean blockByNickname(String nickname, String confirmationCode){
        ConfirmationCode code = confirmationCodeRepository.findByCode(confirmationCode);
        if (code == null){
            return false;
        }
        User user = userRepository.findByNickname(nickname);
        if (user == null){
            return false;
        }
        user.setActive(false);
        return true;
    }

}
