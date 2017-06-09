package lemuel.ineffable;

/**
 * Created by lemuel on 2017/6/9.
 */

public abstract class StringCallback<T> extends AbstractCallback<T>{

    @Override
    protected T bindData(String result) throws Exception {
        return (T) result;
    }
}
