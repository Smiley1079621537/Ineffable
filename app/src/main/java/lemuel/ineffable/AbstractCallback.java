package lemuel.ineffable;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * Created by lemuel on 2017/6/9.
 */

public abstract class AbstractCallback<T> implements ICallback<T> {

    @Override
    public T parse(HttpURLConnection connection) throws Exception {
        if (connection.getResponseCode() == 200) {
            InputStream in = connection.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            in.close();
            out.flush();
            out.close();
            String result = new String(out.toByteArray());
            return bindData(result);
        }
        return null;
    }

    protected abstract T bindData(String result) throws Exception;
}
