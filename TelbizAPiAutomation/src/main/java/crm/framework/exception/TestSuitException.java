package crm.framework.exception;

/*
   @Auther Anusha Eranda
 */


public class TestSuitException extends RuntimeException  {

    private String exceptionMsg;

    public TestSuitException(String exceptionMsgVal, Throwable e) {
        super(exceptionMsgVal, e);
        this.exceptionMsg = exceptionMsgVal;
    }

    public TestSuitException(String exceptionMsgVal) {
        this.exceptionMsg = exceptionMsgVal;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsgVal) {
        this.exceptionMsg = exceptionMsgVal;
    }
}


