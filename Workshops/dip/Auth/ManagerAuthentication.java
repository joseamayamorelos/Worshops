package dip.Auth;

public class ManagerAuthentication {
    private ServiceAuthentication serviceAuthentication;

    public ManagerAuthentication(ServiceAuthentication serviceAuthentication) {
        this.serviceAuthentication = serviceAuthentication;
    }


    public boolean authentication(String user, String password) {
        return serviceAuthentication.auth(user, password);
    }

    
}
