package lemuel.ineffable;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lemuel on 2017/6/9.
 */

public class HttpUtil {

    public static HttpURLConnection execute(Request request) throws IOException {
        switch (request.method) {
            case GET:
            case DELEATE:
                return get(request);
            case POST:
            case PUT:
                return post(request);
        }
        return null;
    }

    private static HttpURLConnection get(Request request) throws IOException {
            HttpURLConnection connection = (HttpURLConnection) new URL(request.url).openConnection();
            connection.setRequestMethod(request.method.name());
            connection.setConnectTimeout(5 * 1000);
            return connection;
    }

    private static HttpURLConnection post(Request request) throws IOException {
            HttpURLConnection connection = (HttpURLConnection) new URL(request.url).openConnection();
            connection.setRequestMethod(request.method.name());
            connection.setConnectTimeout(5 * 1000);
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(request.content.getBytes());
            return connection;
    }
}
