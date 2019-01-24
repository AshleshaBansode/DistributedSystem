
/**
 * LoadBalanceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

package loadbalance;

public class LoadBalanceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1545241570632L;
    
    private loadbalance.LoadBalanceStub.LoadBalanceException faultMessage;

    
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
    

    public void setFaultMessage(loadbalance.LoadBalanceStub.LoadBalanceException msg){
       faultMessage = msg;
    }
    
    public loadbalance.LoadBalanceStub.LoadBalanceException getFaultMessage(){
       return faultMessage;
    }
}
    