package dip.Almacenamiento;

public class CloudStorage  implements Storage{
    
    @Override
    public void saveFile(String file) {
        System.out.println("file : " + file + "is create successfuly");
    }

    @Override
    public void recover(String file) {
        System.out.println("file: " + file + "is recover with success");
    }
}
