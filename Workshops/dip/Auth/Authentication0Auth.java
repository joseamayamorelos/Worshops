package dip.Auth;

public class Authentication0Auth implements ServiceAuthentication{

    @Override
    public boolean auth(String user, String password) {
        return "oauth_user".equals(user) && "outh_password".equals(password);
    }

    
} 