package com.firstyearproject.salontina.Services;

import com.firstyearproject.salontina.Models.User;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class UserAuthenticator {
    //Jonathan
    public boolean userIsAdmin(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user != null) {
            for (String s : user.getUserRoles()) {
                if (s.equals("Admin") || s.equals("Frisør")) {
                    return true;
                }
            }
        }
        return false;
    }
    //Jonathan
    public boolean userIsUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user != null) {
            for (String s : user.getUserRoles()) {
                if (s.equals("Bruger")) {
                    return true;
                }
            }
        }
        return false;

    }

}