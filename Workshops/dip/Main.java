package dip;

import dip.Almacenamiento.LocalStorage;
import dip.Almacenamiento.ManagerFile;
import dip.Almacenamiento.Storage;
import dip.Auth.Authentication0Auth;
import dip.Auth.AuthenticationLocal;
import dip.Auth.ManagerAuthentication;
import dip.Auth.ServiceAuthentication;

public class Main {
    public static void main(String[] args) {
        //Auth
        ServiceAuthentication authLocal = new AuthenticationLocal();
        ManagerAuthentication managerAuthentication = new ManagerAuthentication(authLocal);
        System.out.println(managerAuthentication.authentication("juan", "12345"));


        ServiceAuthentication authO = new Authentication0Auth();
        ManagerAuthentication managerAuthentication2 = new ManagerAuthentication(authO);
        System.out.println(managerAuthentication2.authentication("joaksu", "32421323"));



        //Storagee
        Storage localStorage = new LocalStorage();
        ManagerFile managerFile = new ManagerFile(localStorage);
        managerFile.createFile("new file");
        managerFile.recoerFile("new file");

    }
}
