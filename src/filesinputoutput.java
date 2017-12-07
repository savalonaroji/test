import java.io.*;
class filesinputoutput {
public static void main(String args[]) throws IOException {
InputStream obj = new FileInputStream("C:\\Users\\Savalo\\Desktop\\Savalo\\Study.txt");
System.out.print(obj.available());
}
}