package lemuel.ineffable;

import java.net.HttpURLConnection;

/**
 * Created by lemuel on 2017/6/9.
 */

public interface ICallback<T> {
    void onSuccess(T s);
    void onFailure(Exception e);
    T parse(HttpURLConnection connection) throws Exception;
}
