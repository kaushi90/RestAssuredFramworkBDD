package crm.framework.config;

/*
   @Auther Anusha Eranda
 */

public interface ImplementConfig {

    String getValue(String var1);

    Long getLongValue(String var1, long var2);

    void setValue(String var1, String var2);

}
