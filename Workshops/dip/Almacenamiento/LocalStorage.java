package dip.Almacenamiento;

public class LocalStorage  implements Storage {

    @Override
    public void saveFile(String file) {
        System.out.println("file : " + file + "is save");
    }

    @Override
    public void recover(String file) {
        System.out.println("file: " + file + "is recover");
    }
    
}
