import java.io.*;

public class files {
    public static void main (String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("'line 1'");
            fw.append('\n');
            fw.append('1');
            fw.append('\n');
            fw.append('2');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        // посимвольное чтение
        
        try (FileReader fr = new FileReader("file.txt")) {
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') 
                System.out.println("Enter");
            else if (ch == '2')
                System.out.println("Два");
            else
                System.out.print(ch);
            } 
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String str;
            while ((str = br.readLine()) != null)
                System.out.println(str);
                br.close()
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

    }



        

}