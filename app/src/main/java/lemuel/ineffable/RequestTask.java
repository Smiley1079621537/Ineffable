package lemuel.ineffable;

import android.os.AsyncTask;

import java.net.HttpURLConnection;

/**
 * Created by lemuel on 2017/6/9.
 */

public class RequestTask extends AsyncTask<Void, String, Object> {

    private Request request;

    public RequestTask(Request request) {
        this.request = request;
    }

    @Override
    protected Object doInBackground(Void... voids) {
        try {
            HttpURLConnection connection = HttpUtil.execute(request);
            return request.callback.parse(connection);
        } catch (Exception e) {
            return e;
        }
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        if (o instanceof Exception) {
            request.callback.onFailure((Exception) o);
        } else {
            request.callback.onSuccess(o);
        }
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }
}
