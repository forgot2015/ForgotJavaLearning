package study.icourse.exercise6;

/**
 * 自定义异常
 */
public class MyException extends RuntimeException {
    private String data;
    private String error;

    public MyException() {
        super();
    }

    public MyException(String error) {
        this.error = error;
    }

    public MyException(String data, String error) {
        this.data = data;
        this.error = error;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
