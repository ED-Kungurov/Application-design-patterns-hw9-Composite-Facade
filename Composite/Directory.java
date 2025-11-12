import java.util.ArrayList;

public class Directory extends FileSystemComponent{
    String name;
    ArrayList<FileSystemComponent> components = new ArrayList<FileSystemComponent>();
    public Directory(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void Display() {
        System.out.println("Directory: " + name + " comntains ");
        for (FileSystemComponent component : components) {
            component.Display();
        }
    }
    @Override
    public void addFileOrDirectory(FileSystemComponent component){
        components.add(component);
    }
    @Override
    public void removeFileOrDirectory(FileSystemComponent component){
        components.remove(component);
    }
}
