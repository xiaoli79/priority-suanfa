import java.io.*;

public class test {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {

        String[] s = br.readLine().split(" ");

        out.print(Integer.parseInt(s[0]));
        out.println();
        out.println(Integer.parseInt(s[1]));
        out.flush();

    }
}
