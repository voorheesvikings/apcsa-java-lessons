public class Sign {
    String msg;
    int width;


    public Sign(String msg, int width) {
        this.msg = msg;
        this.width = width;
    }

    public int numberOfLines() {
        if (msg.length() ==0) {
            return 0;
        }
        return (msg.length() +  width - 1) / width;
    }

    public String getLines() {
        if (msg.length() == 0) {
            return "";
        }

        String editedMsg = "";
        for (int i = 0; i < msg.length(); i+=width) {
            int end;
            if (i + width < msg.length()) {
                end = i + width;
            } else {
                end = msg.length();
            }
            editedMsg += msg.substring(i, end);
            if (end < msg.length()) {
                editedMsg += ";";
            }
        }
        return editedMsg;
    }
}
