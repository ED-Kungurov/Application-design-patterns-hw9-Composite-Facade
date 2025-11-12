public class Main2 {
    public static void main(String[] args) {
        FileSystemComponent directoryLevel11 = new Directory("Level 1 number 1");
        FileSystemComponent directoryLevel21 = new Directory("Level 2 number 1");
        FileSystemComponent directoryLevel22 = new Directory("Level 2 number 2");
        FileSystemComponent file1 = new File("File1", 12);
        FileSystemComponent file2 = new File("File2", 24);
        FileSystemComponent file3 = new File("File3", 414);
        FileSystemComponent file4 = new File("File4", 567);
        FileSystemComponent file5 = new File("File5", 7978);
        FileSystemComponent file6 = new File("File6", 12122);
        directoryLevel22.addFileOrDirectory(file2);
        directoryLevel22.addFileOrDirectory(file3);
        directoryLevel22.addFileOrDirectory(file4);
        directoryLevel21.addFileOrDirectory(file5);
        directoryLevel21.addFileOrDirectory(file6);
        directoryLevel21.addFileOrDirectory(file1);
        directoryLevel11.addFileOrDirectory(directoryLevel22);
        directoryLevel11.addFileOrDirectory(directoryLevel21);
        directoryLevel11.Display();
    }
}
