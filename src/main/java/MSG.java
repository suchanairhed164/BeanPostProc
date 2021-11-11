public class MSG {
    private String msg;

    public String getMsg() {
        return "MSG Message: " + msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void init() {
        System.out.println("MSG Bean is in init phase.");
    }

    public void destroy() {
        System.out.println("MSG Bean will be destroyed now");
    }
}
