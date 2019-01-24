package Client;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.varia.NullAppender;

import loadbalance.LoadBalanceStub;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());

		int num1 = 0, num2 = 0, operation = 1;
		//int[] res = 0;
	    Map<Integer, ArrayList<Integer>> passValuesOnServer = new HashMap<Integer, ArrayList<Integer>>();
		Scanner in = new Scanner(System.in);
		int [] result = new int[400];
		/*System.out.println("Select below operation - ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		operation = in.nextInt();		
		System.out.println("Enter two numbers for above operation - ");
		num1 = in.nextInt();
		num2 = in.nextInt();*/
		int respond = 0;
		String temp = "http://localhost:8061/LoadBalanceServiceDirectory/";
		URL url = new URL(temp);
		respond = checkLoadBalancerStatus(url);
		
		passValuesOnServer = passLoad();
		int [][] array = new int[100][200];
		int index =0; 
		
		int [] kemp = new int[400];
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for (Map.Entry<Integer, ArrayList<Integer>> mapEntry : passValuesOnServer.entrySet()) {
		    kemp[index++] = mapEntry.getKey();
		    array1 = mapEntry.getValue();
		    int length = array1.size();
		    kemp[index++] = length;
		    for(int i =0;i<array1.size();i++) {
		    	kemp[index++] = array1.get(i);
		    }
		    	    
		}
		
	
		
		//result = loadbal1(passValuesOnServer);
	    
		
		//if the server responds with status 200 it means the first load balancer is up and working
		if(respond == 200) {
			System.out.println("First Load Balancer");
			LoadBalanceStub LoadStub = new LoadBalanceStub();
			LoadBalanceStub.Loadbal1 request = new LoadBalanceStub.Loadbal1();
			request.setPassValuesOnServer1(kemp);
			LoadBalanceStub.Loadbal1Response response = LoadStub.loadbal1(request);
			result = response.get_return();
		}
		else {  //if the first load balancer server is down, the request is sent to 2nd load balancer
			System.out.println("Second Load Balancer");
			loadbalancesecond.LoadBalanceStub LoadStub = new loadbalancesecond.LoadBalanceStub();
			loadbalancesecond.LoadBalanceStub.Loadbal1 request = new loadbalancesecond.LoadBalanceStub.Loadbal1();
			request.setPassValuesOnServer1(kemp);			
			loadbalancesecond.LoadBalanceStub.Loadbal1Response response = LoadStub.loadbal1(request);
			result = response.get_return();
		}
		/*if(operation == 1 )
			System.out.println("The addition is: "+ res);
		else if(operation == 2)
			System.out.println("The subtraction is: "+ res);
		else if(operation == 3)
			System.out.println("The multiplication is: "+ res);
		else if(operation == 4)
			System.out.println("The division is:"+ res);*/
		
		
		
	    int temp1 = 0, n1 = 0, n2 = 0, res1 = 0;
	    int i = 0;
	    while(i<result.length){
	    	temp1 = result[i++];
	    	n1=result[i++];
	    	n2=result[i++];
	    	res1 = result[i++];
	    	if(temp1 ==1) {
	    		System.out.printf("The addition of %d and %d is %d \n", n1, n2, res1);
	    	}
	    	else if(temp1==2) {
	    		System.out.printf("The subtraction of %d and %d is %d \n", n1, n2, res1);
	    	}
	    	else if(temp1 ==3) {
	    		System.out.printf("The multiplication of %d and %d is %d \n", n1, n2, res1);
	    	}
	    	else {
	    		System.out.printf("The division of %d and %d is %d \n", n1, n2, res1);
	    	}
	    	
	    }
	}
	
	
	//Checking the status of the load balancer server 
	@SuppressWarnings("finally")
	public static int checkLoadBalancerStatus(URL url) throws Exception {
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		int responseCode = 0;
		try{
			connection.connect();
			responseCode = connection.getResponseCode();
		}catch(Exception e){
			//nothing to do
		}finally {
			return responseCode;
		}	
		
	}

	@SuppressWarnings("rawtypes")
	public static Map passLoad() {
	    Map<Integer, ArrayList<Integer>> passValuesOnServer = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
	    Random random = new Random();
	    int operation = 0, num1 = 0, num2 = 0, i =0; 
	    int[][] input = new int [20][3];
	    for(i = 0; i < 100;i++) {
	    	operation = random.nextInt(5);
	    	num1 = random.nextInt(100);
	    	num2 = random.nextInt(100);	    	
	    	if(operation == 0)
	    		operation = 1;   
	    	ArrayList<Integer> array = new ArrayList<Integer>();
	    	array.add(num1);
	    	array.add(num2);
	    	
	    	if(passValuesOnServer.containsKey(operation)) {
	    		aList = passValuesOnServer.get(operation);
	    		aList.add(num1);
	    		aList.add(num2);
	    		passValuesOnServer.put(operation, aList);
	    	}
	    	else	
	    		passValuesOnServer.put(operation, array);   	
	    	
	    }
	    
	    System.out.println("Array - " + passValuesOnServer);
		return passValuesOnServer;		
	}
	
}
