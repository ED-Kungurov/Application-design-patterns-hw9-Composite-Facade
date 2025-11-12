public abstract class FileSystemComponent {
    private String name;
    public FileSystemComponent(String name) {
        this.name = name;
    }
    public abstract void Display();
    public int GetSize(){
        throw new UnsupportedOperationException();
    };
    public void addFileOrDirectory(FileSystemComponent component){
        throw new UnsupportedOperationException();
    }
    public void removeFileOrDirectory(FileSystemComponent component){
        throw new UnsupportedOperationException();
    }
}
