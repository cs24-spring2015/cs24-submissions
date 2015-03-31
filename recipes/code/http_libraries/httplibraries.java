import java.io.*;
import java.net.*;

public class httplibraries {

	public void get_request(String url_input) {
		URL url;
		HttpURLConnection conn;
		BufferedReader read;
		String temp;
		String result = "";
		try {
			url = new URL(url_input);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			read = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while ((temp = read.readLine()) != null) {
			result += temp;
		}
		read.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			PrintWriter writer = new PrintWriter("get_request.txt", "UTF-8");
			writer.println(result);
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		httplibraries httplibraries = new httplibraries();
		String input = "http://cearto.com/teaching/cs24";
		httplibraries.get_request(input);
	}
}