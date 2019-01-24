
/**
 * LoadBalanceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

package loadbalancesecond;

public class LoadBalanceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1545241947253L;
    
    private loadbalancesecond.LoadBalanceStub.LoadBalanceException faultMessage;

    
        public LoadBalanceExceptionException() {
            super("LoadBalanceExceptionException");
        }

        public LoadBalanceExceptionException(java.lang.String s) {
           super(s);
        }

        public LoadBalanceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoadBalanceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(loadbalancesecond.LoadBalanceStub.LoadBalanceException msg){
       faultMessage = msg;
    }
    
    public loadbalancesecond.LoadBalanceStub.LoadBalanceException getFaultMessage(){
       return faultMessage;
    }
}
    