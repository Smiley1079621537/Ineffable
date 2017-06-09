package lemuel.ineffable;

/**
 * Created by lemuel on 2017/6/9.
 */

public class Response {

    /**
     * ret : 200
     * msg : 有心课堂,传递给你的不仅仅是技术✈️
     * data : {"account":"stay4it","username":"stay4it","id":"1","token":"@","avatar":"@","email":"@"}
     */

    private int ret;
    private String msg;
    private User data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public static class User {
        /**
         * account : stay4it
         * username : stay4it
         * id : 1
         * token : @
         * avatar : @
         * email : @
         */

        private String account;
        private String username;
        private String id;
        private String token;
        private String avatar;
        private String email;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
