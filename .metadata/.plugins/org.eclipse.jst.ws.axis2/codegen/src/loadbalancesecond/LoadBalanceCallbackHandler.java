
/**
 * LoadBalanceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package loadbalancesecond;

    /**
     *  LoadBalanceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class LoadBalanceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public LoadBalanceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public LoadBalanceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for add2 method
            * override this method for handling normal response from add2 operation
            */
           public void receiveResultadd2(
                    loadbalancesecond.LoadBalanceStub.Add2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add2 operation
           */
            public void receiveErroradd2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addition method
            * override this method for handling normal response from addition operation
            */
           public void receiveResultaddition(
                    loadbalancesecond.LoadBalanceStub.AdditionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addition operation
           */
            public void receiveErroraddition(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for add3 method
            * override this method for handling normal response from add3 operation
            */
           public void receiveResultadd3(
                    loadbalancesecond.LoadBalanceStub.Add3Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add3 operation
           */
            public void receiveErroradd3(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for passResult method
            * override this method for handling normal response from passResult operation
            */
           public void receiveResultpassResult(
                    loadbalancesecond.LoadBalanceStub.PassResultResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from passResult operation
           */
            public void receiveErrorpassResult(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for divide2 method
            * override this method for handling normal response from divide2 operation
            */
           public void receiveResultdivide2(
                    loadbalancesecond.LoadBalanceStub.Divide2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from divide2 operation
           */
            public void receiveErrordivide2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadBalancer method
            * override this method for handling normal response from loadBalancer operation
            */
           public void receiveResultloadBalancer(
                    loadbalancesecond.LoadBalanceStub.LoadBalancerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadBalancer operation
           */
            public void receiveErrorloadBalancer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for divide3 method
            * override this method for handling normal response from divide3 operation
            */
           public void receiveResultdivide3(
                    loadbalancesecond.LoadBalanceStub.Divide3Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from divide3 operation
           */
            public void receiveErrordivide3(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for multiply3 method
            * override this method for handling normal response from multiply3 operation
            */
           public void receiveResultmultiply3(
                    loadbalancesecond.LoadBalanceStub.Multiply3Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiply3 operation
           */
            public void receiveErrormultiply3(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiply2 method
            * override this method for handling normal response from multiply2 operation
            */
           public void receiveResultmultiply2(
                    loadbalancesecond.LoadBalanceStub.Multiply2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiply2 operation
           */
            public void receiveErrormultiply2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkServerStatus method
            * override this method for handling normal response from checkServerStatus operation
            */
           public void receiveResultcheckServerStatus(
                    loadbalancesecond.LoadBalanceStub.CheckServerStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkServerStatus operation
           */
            public void receiveErrorcheckServerStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for minload method
            * override this method for handling normal response from minload operation
            */
           public void receiveResultminload(
                    loadbalancesecond.LoadBalanceStub.MinloadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from minload operation
           */
            public void receiveErrorminload(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for servicedis method
            * override this method for handling normal response from servicedis operation
            */
           public void receiveResultservicedis(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from servicedis operation
           */
            public void receiveErrorservicedis(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sub3 method
            * override this method for handling normal response from sub3 operation
            */
           public void receiveResultsub3(
                    loadbalancesecond.LoadBalanceStub.Sub3Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sub3 operation
           */
            public void receiveErrorsub3(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sub2 method
            * override this method for handling normal response from sub2 operation
            */
           public void receiveResultsub2(
                    loadbalancesecond.LoadBalanceStub.Sub2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sub2 operation
           */
            public void receiveErrorsub2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sub method
            * override this method for handling normal response from sub operation
            */
           public void receiveResultsub(
                    loadbalancesecond.LoadBalanceStub.SubResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sub operation
           */
            public void receiveErrorsub(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getMinKey method
            * override this method for handling normal response from getMinKey operation
            */
           public void receiveResultgetMinKey(
                    loadbalancesecond.LoadBalanceStub.GetMinKeyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMinKey operation
           */
            public void receiveErrorgetMinKey(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadbal1 method
            * override this method for handling normal response from loadbal1 operation
            */
           public void receiveResultloadbal1(
                    loadbalancesecond.LoadBalanceStub.Loadbal1Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadbal1 operation
           */
            public void receiveErrorloadbal1(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for execute method
            * override this method for handling normal response from execute operation
            */
           public void receiveResultexecute(
                    loadbalancesecond.LoadBalanceStub.ExecuteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from execute operation
           */
            public void receiveErrorexecute(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadBal method
            * override this method for handling normal response from loadBal operation
            */
           public void receiveResultloadBal(
                    loadbalancesecond.LoadBalanceStub.LoadBalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadBal operation
           */
            public void receiveErrorloadBal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for passLoad method
            * override this method for handling normal response from passLoad operation
            */
           public void receiveResultpassLoad(
                    loadbalancesecond.LoadBalanceStub.PassLoadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from passLoad operation
           */
            public void receiveErrorpassLoad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for add method
            * override this method for handling normal response from add operation
            */
           public void receiveResultadd(
                    loadbalancesecond.LoadBalanceStub.AddResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add operation
           */
            public void receiveErroradd(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for serviceDirectory method
            * override this method for handling normal response from serviceDirectory operation
            */
           public void receiveResultserviceDirectory(
                    loadbalancesecond.LoadBalanceStub.ServiceDirectoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from serviceDirectory operation
           */
            public void receiveErrorserviceDirectory(java.lang.Exception e) {
            }
                


    }
    