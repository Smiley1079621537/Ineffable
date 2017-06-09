package lemuel.ineffable;

import android.util.Log;

import java.io.IOException;

/**
 * Created by lemuel on 2017/6/9.
 */

public class TestHttp {

    private static final String TAG = TestHttp.class.getName();

    public static void testHttpGetonSubThread() throws IOException {
        String url = "http://api.stay4it.com";
        Request request = new Request(url);
        request.setCallback(new StringCallback<String>() {

            @Override
            public void onSuccess(String s) {
                Log.d(TAG, "onSuccess get result :" + s);
            }

            @Override
            public void onFailure(Exception e) {
                e.printStackTrace();
            }
        });
        RequestTask task = new RequestTask(request);
        task.execute();
    }


    public static void testHttpPostOnSubThread() throws IOException {
        String url = "http://api.stay4it.com/v1/public/core/?service=user.login";
        Request request = new Request(url, Request.RequestMethod.POST);
        request.content = "account=stay4it&password=123456";
        request.setCallback(new JsonCallback<Response.User>() {

            @Override
            public void onSuccess(Response.User user) {
                Log.d(TAG, "onSuccess post result :" + user.getUsername());
            }

            @Override
            public void onFailure(Exception e) {
                e.printStackTrace();
            }

        });
        RequestTask task = new RequestTask(request);
        task.execute();
    }

}
