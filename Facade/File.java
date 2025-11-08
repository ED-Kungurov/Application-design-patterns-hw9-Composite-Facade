public class File extends FileSystemComponent {
    int size;
    String name;
    public File(String name, int size) {
        super(name);
        this.size = size;
        this.name = name;
    }

    @Override
    public void Display() {
        System.out.println(name + " " + size + " byte");
    }
    @Override
    public int GetSize(){
        return size;
    };
}
