package dip.Almacenamiento;

public class ManagerFile {
    private Storage storage;

    public ManagerFile(Storage storage) {
        this.storage = storage;
    }

    public void createFile(String file) {
        storage.saveFile(file);
    }

    public void recoerFile(String file) {
        storage.recover(file);
    }
}
