import java.io.*;
public class Docs {
    public static void main(String[] args){
        String file;
        try (BufferedReader br= new BufferedReader(new FileReader("doc.txt")))
        {
            while ( (file=br.readLine()) !=null)
            {
                System.out.println(file);
            }

        }
        catch (IOException exc)
        {
            System.out.println("Ошибка - отсутствует файл " + exc);
        }

    }

}
