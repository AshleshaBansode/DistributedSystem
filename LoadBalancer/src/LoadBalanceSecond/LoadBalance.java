package LoadBalanceSecond;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import service1.AddStub;
import service1.SubtractStub;

public class LoadBalance {
	
	static HashMap<String, Integer> load = new HashMap<String, Integer>();  //count the load in the servers
    static Map<String, ArrayList<String>> serverFunctions = new HashMap<String, ArrayList<String>>();  //It has the server to available functions in that server mapping in hashmap
	static HashMap<String, String> hmap = new HashMap<String, String>();  //WSDL and server name mapping
	static ArrayList<String> functions = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverAdd = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverMul = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverSub = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverDiv = new ArrayList<String>();
	
	static ArrayList<String> serverAdd1 = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverMul1 = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverSub1 = new ArrayList<String>();		//list of functions for the selected server
	static ArrayList<String> serverDiv1 = new ArrayList<String>();//list of functions for the selected server

	
	//addition function of server1
	public static int add(int i, int j) throws Exception {
		
		int result = 0;
		service.AddStub add_stub = new service.AddStub();
		service.AddStub.Add add_request = new service.AddStub.Add();
		add_request.setI(i);
		add_request.setJ(j);
		service.AddStub.AddResponse add_response = add_stub.add(add_request);
		result = add_response.get_return();
		return result;		
		
	}
	
	//addition function of server2
	public static int addition(int i, int j) throws Exception {
			
			int result = 0;
			AddStub add_stub = new AddStub();
			AddStub.Add add_request = new AddStub.Add();
			add_request.setI(i);
			add_request.setJ(j);
			AddStub.AddResponse add_response = add_stub.add(add_request);
			result = add_response.get_return();
			return result;
			
		}
	
	//addition function of server3
	public static int add2(int i, int j) throws Exception {
			
			int result = 0;
			service2.AddStub add_stub = new service2.AddStub();
			service2.AddStub.Add add_request = new service2.AddStub.Add();
			add_request.setI(i);
			add_request.setJ(j);
			service2.AddStub.AddResponse add_response = add_stub.add(add_request);
			result = add_response.get_return();
			return result;		
			
		}
	
	//addition function of server4
		public static int add3(int i, int j) throws Exception {
			
			int result = 0;
			service3.AddStub add_stub = new service3.AddStub();
			service3.AddStub.Add add_request = new service3.AddStub.Add();
			add_request.setI(i);
			add_request.setJ(j);
			service3.AddStub.AddResponse add_response = add_stub.add(add_request);
			result = add_response.get_return();
			return result;		
			
		}
	
		//subtraction function of server2
	public static int sub(int i, int j) throws Exception {
		
		int result = 0;
		SubtractStub sub_stub = new SubtractStub();
		SubtractStub.Sub sub_request = new SubtractStub.Sub();
		sub_request.setI(i);
		sub_request.setJ(j);
		SubtractStub.SubResponse sub_response = sub_stub.sub(sub_request);
		result = sub_response.get_return();
		return result;
		
	}	
	
	//subtraction function of server3
	public static int sub2(int i, int j) throws Exception {
			
			int result = 0;
			service2.SubtractStub sub_stub = new service2.SubtractStub();
			service2.SubtractStub.Sub sub_request = new service2.SubtractStub.Sub();
			sub_request.setI(i);
			sub_request.setJ(j);
			service2.SubtractStub.SubResponse sub_response = sub_stub.sub(sub_request);
			result = sub_response.get_return();
			return result;
			
		}	
	
	
	//subtraction function of server4
	public static int sub3(int i, int j) throws Exception {
		
		int result = 0;
		service3.SubtractStub sub_stub = new service3.SubtractStub();
		service3.SubtractStub.Sub sub_request = new service3.SubtractStub.Sub();
		sub_request.setI(i);
		sub_request.setJ(j);
		service3.SubtractStub.SubResponse sub_response = sub_stub.sub(sub_request);
		result = sub_response.get_return();
		return result;
		
	}
	
	//multiplication function of server3
	public static int multiply2(int i, int j) throws Exception {
		
		int result = 0;
		service2.MultiplyStub multiply_stub = new service2.MultiplyStub();
		service2.MultiplyStub.Multiply request = new service2.MultiplyStub.Multiply();
		request.setI(i);
		request.setJ(j);
		service2.MultiplyStub.MultiplyResponse response= multiply_stub.multiply(request);
		result = response.get_return();
		return result;		
		
	}
	
	//multiplication function of server4
	public static int multiply3(int i, int j) throws Exception {
		
		int result = 0;
		service3.MultiplyStub multiply_stub = new service3.MultiplyStub();
		service3.MultiplyStub.Multiply request = new service3.MultiplyStub.Multiply();
		request.setI(i);
		request.setJ(j);
		service3.MultiplyStub.MultiplyResponse response= multiply_stub.multiply(request);
		result = response.get_return();
		return result;		
		
	}
	
	//division function of server3
	public static int divide2(int i, int j) throws Exception {
		
		int result = 0;
		service2.DivideStub divide_stub = new service2.DivideStub();
		service2.DivideStub.Divide request = new service2.DivideStub.Divide();
		request.setI(i);
		request.setJ(j);
		service2.DivideStub.DivideResponse response= divide_stub.divide(request);
		result = response.get_return();
		return result;		
		
	}
	
	//division function of server4
	public static int divide3(int i, int j) throws Exception {		
		int result = 0;
		service3.DivideStub divide_stub = new service3.DivideStub();
		service3.DivideStub.Divide request = new service3.DivideStub.Divide();
		request.setI(i);
		request.setJ(j);
		service3.DivideStub.DivideResponse response= divide_stub.divide(request);
		result = response.get_return();
		return result;				
	}
	
	//mapping urls to the respective servers
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void addURL(HashMap hmap) {
		hmap.put("Server1", "http://localhost:8080/Server1/");
		hmap.put("Server2","http://localhost:8081/Server2/");
		hmap.put("Server3","http://localhost:8084/Server3/");
		hmap.put("Server4","http://130.85.233.250:8083/Server4/");		
	}
	
	
	//adding functions list to the respective servers
	public static void serverAndServices() {
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();		

		array1.add("add");
		array2.add("add");
		array2.add("subtract");
		array3.add("add");
		array3.add("subtract");
		array3.add("multiply");
		array3.add("divide");
		array4.add("add");
		array4.add("subtract");
		array4.add("multiply");
		array4.add("divide");
		serverFunctions.put("Server1",array1);
		serverFunctions.put("Server2",array2);	
		serverFunctions.put("Server3", array3);
		serverFunctions.put("Server4", array4);
		
	}
	
	
	//service directory checks which server has the particular operation and if the server is up and running
	public static String[] serviceDirectory(int operation) throws Exception {
		int k = 0;		
		String key = "";	
		String op = "";
		String[] funct = new String[hmap.size()];
		String[] result = new String[hmap.size()]; 
		if(operation == 1) {		//addition operation
			Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        key = (String) pair.getKey();
		        functions = serverFunctions.get(key);
		        if(functions.contains("add"))
					funct[k++] = key;				
		    }
		}
		else if(operation ==2) {		//subtraction operation
			Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        key = (String) pair.getKey();
		        functions = serverFunctions.get(key);
		        if(functions.contains("subtract"))
					funct[k++] = key;				
		    }
		}
		else if(operation ==3) {    //multiplication operation
			Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        key = (String) pair.getKey();
		        functions = serverFunctions.get(key);
		        if(functions.contains("multiply"))
					funct[k++] = key;				
		    }
		}
		else {     //division operation
			Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        key = (String) pair.getKey();
		        functions = serverFunctions.get(key);
		        if(functions.contains("divide"))
					funct[k++] = key;				
		    }
		}
		
		String server = "";
		int responseCode=0;
		int count = 0;
		URL url = new URL(hmap.get(funct[0]));
		for (int counter = 0; counter < k; counter++){   
			server = funct[counter];
			url = new URL(hmap.get(server));
			responseCode = checkServerStatus(url);
			if(responseCode == 200)
				result[count++] = server;    //list of all the servers with the desired operation and which are up and running
	    } 
		
		if(operation == 1)
			op = "addition";
		else if(operation == 2)
			op = "subtraction";
		else if(operation == 3)
			op = "multiplication";
		else 
			op = "Division";
		System.out.print("The service " + op + " is available on servers - ");
		for(int i = 0;i < count;i++) {
			System.out.print(result[i]+ "  ");
		}
		
		System.out.println("");

		return result;
	}
	
	
	//this loadbalancer checks the service request load on the servers list which service registor directory sent and picks the server which has the lowest load
	@SuppressWarnings({ "rawtypes", "unused" })
	public static int LoadBal(int operation, int num1, int num2) throws Exception {
		
		int res = 0;
		String requestServer = "";
		String[] serv = new String[hmap.size()];
		int k=1;
		int count=0;
		String[] funct = new String[hmap.size()];
		serv = serviceDirectory(operation);
		requestServer = getMinKey(load,serv);
		
		System.out.println("The least load among the available server is on - " + requestServer);
		if(operation == 1) {
			if(requestServer == "Server1") {
				load.put("Server1", load.get("Server1")+1);
				System.out.println("Adding load..Now the load on server1 is - " + load.get("Server1"));
				res = add(num1, num2);
				System.out.println("The 8080 server output of addition - " + res);
				load.put("Server1", load.get("Server1")-1);
				System.out.println("Removing the load..Now The load now on server1 is - " + load.get("Server1"));
			}
			else if(requestServer == "Server2") {
				load.put("Server2", load.get("Server2")+1);
				System.out.println("Adding load..Now the load on server2 is - " + load.get("Server2"));
				res = addition(num1, num2);
				System.out.println("The 8081 server output of addition - " + res);
				load.put("Server2", load.get("Server2")-1);
				System.out.println("Removing the load..Now The load now on server2 is - " + load.get("Server2"));
			}
			else if(requestServer == "Server3") {
				load.put("Server3", load.get("Server3")+1);
				System.out.println("Adding load..Now the load on server3 is - " + load.get("Server3"));
				res = add2(num1, num2);
				System.out.println("The 8084 server output of addition - " + res);
				load.put("Server3", load.get("Server3")-1);
				System.out.println("Removing the load..Now The load now on server3 is - " + load.get("Server3"));
			}
			else {
				load.put("Server4", load.get("Server4")+1);
				System.out.println("Adding load..Now the load on server4 is - " + load.get("Server4"));
				res = add3(num1, num2);
				System.out.println("The 8083 server output of addition - " + res);
				load.put("Server4", load.get("Server4")-1);
				System.out.println("Removing the load..Now The load now on server4 is - " + load.get("Server4"));
			}
		}
		else if(operation == 2) {
			if(requestServer == "Server2") {
				load.put("Server2", load.get("Server2")+1);
				System.out.println("Adding load..Now The load on server2 is - " + load.get("Server2"));
				res = sub(num1, num2);
				System.out.println("The 8081 server output of subtraction - " + res);
				load.put("Server2", load.get("Server2")-1);
				System.out.println("Removing the load..Now The load now on server2 is - " + load.get("Server2"));
			}
			else if(requestServer == "Server3") {
				load.put("Server3", load.get("Server3")+1);
				System.out.println("Adding load..Now the load on server3 is - " + load.get("Server3"));
				res = sub2(num1, num2);
				System.out.println("The 8084 server output of subtraction - " + res);
				load.put("Server3", load.get("Server3")-1);
				System.out.println("Removing the load..Now the load on server3 is - " + load.get("Server3"));
			}
			else {
				load.put("Server4", load.get("Server4")+1);
				System.out.println("Adding load..Now The load on server4 is - " + load.get("Server4"));
				res = sub3(num1, num2);
				System.out.println("The 8083 server output of subtraction - " + res);
				load.put("Server4", load.get("Server4")-1);
				System.out.println("Removing the load..Now The load now on server4 is - " + load.get("Server4"));
			}
		}
		else if(operation ==3) {
			if(requestServer == "Server1") {
				
			}
			else if(requestServer == "Server2") {
				
			}
			else if(requestServer == "Server3") {
				load.put("Server3", load.get("Server3")+1);
				System.out.println("Adding load..Now The load on server3 is - " + load.get("Server3"));
				res = multiply2(num1, num2);
				System.out.println("The 8084 server output of multiplication - " + res);
				load.put("Server3", load.get("Server3")-1);
				System.out.println("Removing the load..Now The load now on server3 is - " + load.get("Server3"));
			}
			else {
				load.put("Server4", load.get("Server4")+1);
				System.out.println("Adding load..Now The load on server4 is - " + load.get("Server4"));
				res = multiply3(num1, num2);
				System.out.println("The 8083 server output of multiplication - " + res);
				load.put("Server4", load.get("Server4")-1);
				System.out.println("Removing the load..Now The load now on server4 is - " + load.get("Server4"));
			}
		}
		else {			
			if(requestServer == "Server1") {
				
			}
			else if(requestServer == "Server2") {
				
			}
			else if(requestServer == "Server3") {
				load.put("Server3", load.get("Server3")+1);
				System.out.println("Adding load..Now The load on server3 is - " + load.get("Server3"));
				res = divide2(num1, num2);
				System.out.println("The 8084 server output of division - " + res);
				load.put("Server3", load.get("Server3")-1);
				System.out.println("Removing the load..Now The load now on server3 is - " + load.get("Server3"));
			}
			else {
				load.put("Server4", load.get("Server4")+1);
				System.out.println("Adding load..Now The load on server4 is - " + load.get("Server4"));
				res = divide3(num1, num2);
				System.out.println("The 8083 server output of division - " + res);
				load.put("Server4", load.get("Server4")-1);
				System.out.println("Removing the load..Now The load now on server4 is - " + load.get("Server4"));
			}
		}	
		
		return res;
		
	}
	
	
	//this function is used to pick the server with minimum load 
	public static String getMinKey(HashMap<String, Integer> map, String[] server) {
	    int min = Integer.MAX_VALUE;
	    int i = 0;
	    String key="";
	    for(Map.Entry<String, Integer> entry : map.entrySet()) {
	    	for(i = 0; i<server.length;i++) {
		        if(entry.getValue() < min && entry.getKey() == server[i]  ) {
		            min = entry.getValue();
		            key = entry.getKey();
		        }
	    	}
	    }
	    
	    return key;
	}
	
	
	//this function is used to check if the server is up and runnning
	@SuppressWarnings("finally")
	public static int checkServerStatus(URL url) throws Exception {
		
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
	
	//putting load in servers for demo
	public static int loadBalancer(int operation, int num1, int num2) throws Exception {
		
		load.put("Server1", 5);
		load.put("Server2", 8);
		load.put("Server3", 11);
		load.put("Server4",17);
		addURL(hmap);
		serverAndServices();
		int res = LoadBal(operation, num1, num2);
		return res;
	}
	
	public static Map passResult(HashMap<Integer, ArrayList<Integer>> map) {
		
		ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >();
		
		return map;
	}
	
	public static void addServ() {
		serverAdd.add("Server1");
		serverSub.add("Server2");
		serverAdd.add("Server2");
		serverAdd.add("Server3");
		serverSub.add("Server3");
		serverMul.add("Server3");
		serverDiv.add("Server3");
		serverAdd.add("Server4");
		serverSub.add("Server4");
		serverMul.add("Server4");
		serverDiv.add("Server4");
		
	}
	
	public static void servicedis() throws Exception {
		String[] funct = new String[hmap.size()];
		String[] result = new String[hmap.size()]; 
		Iterator it = hmap.entrySet().iterator();
		String key="";
		String value = "";
		int responseCode=0, count = 0, index = 0;
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        key = (String) pair.getKey();
	        value = (String) pair.getValue();
	        URL url = new URL(value);
	        responseCode = checkServerStatus(url);
			if(responseCode != 200)
				result[count++] = key;
	    }		
	    
	    addServ();
	    serverAdd1 = serverAdd;
	    serverDiv1 = serverDiv;
	    serverSub1 = serverSub;
	    serverMul1 = serverMul;
	    for(int i = 0;i<count;i++) {
	    	if(serverAdd1.contains(result[i])) {
	    		index = serverAdd1.indexOf(result[i]);
	    		if(index!= -1) {	    			
	    			serverAdd1.remove(index);
	    		}
	    	}
	    	if(serverSub1.contains(result[i])) {
	    		index = serverSub1.indexOf(result[i]);
	    		if(index!= -1) {
	    			serverSub1.remove(index);
	    		}
	    	}
	    	if(serverMul1.contains(result[i])) {
	    		index = serverMul1.indexOf(result[i]);
	    		if(index!= -1) {
	    			serverMul1.remove(index);
	    		}
	    	}
	    	if(serverDiv1.contains(result[i])) {
	    		index = serverDiv1.indexOf(result[i]);
	    		if(index!= -1) {
	    			serverDiv1.remove(index);
	    		}
	    	}
	    }	    
	}
	
	public static String minload(ArrayList<String> servers) {
		Iterator it = servers.iterator();
		String minServer = "";
		String result = "";
		int minValue = 100;
		while(it.hasNext()) {
			minServer = (String) it.next();
			if(load.get(minServer) < minValue) {
				result = minServer;
				minValue = load.get(minServer);
			}
		}		
		return result;		
	}
	
	public static int[] loadbal1(int[] passValuesOnServer1) throws Exception {
		addURL(hmap);
		load.put("Server1", 0);
		load.put("Server2", 0);
		load.put("Server3", 0);
		load.put("Server4",0);
		servicedis();
		String server ="";
		ArrayList<Integer> values = new ArrayList<Integer>();
		Map<Integer, ArrayList<Integer>> serverone = new HashMap<Integer,ArrayList<Integer>>();
		Map<Integer, ArrayList<Integer>> servertwo = new HashMap<Integer,ArrayList<Integer>>();
		Map<Integer, ArrayList<Integer>> serverthree = new HashMap<Integer,ArrayList<Integer>>();
		Map<Integer, ArrayList<Integer>> serverfour = new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Map<Integer,ArrayList<Integer>> passValuesOnServer = new HashMap<Integer,ArrayList<Integer>>();
		int x=0;
		for(x =0;x<400;) {
			int z = passValuesOnServer1[x++];
			int length = passValuesOnServer1[x++];
			ArrayList<Integer> result12 = new ArrayList<Integer>();
			while(length>0) {
				result12.add(passValuesOnServer1[x++]);
				length--;
			}
			
			passValuesOnServer.put(z, result12);
			
		}
		
		
		for(Integer op : passValuesOnServer.keySet()) {
			values = passValuesOnServer.get(op);
			int k = 0;
			for(int j = 0; j< (values.size()/2);j++ ) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				ArrayList<Integer> temp1 = new ArrayList<Integer>();
				if(op == 1) {
					server = minload(serverAdd1);					
					if(server == "Server1") {
						temp1 = serverone.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverone.put(1, temp);
						load.put("Server1", load.get("Server1")+1);
					}
					if(server == "Server2") {
						temp1 = servertwo.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						servertwo.put(1, temp);
						load.put("Server2",load.get("Server2")+1);
					}
					if(server == "Server3") {
						temp1 = serverthree.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverthree.put(1, temp);
						load.put("Server3",load.get("Server3")+1);
					}
					if(server == "Server4") {
						temp1 = serverfour.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverfour.put(1, temp);
						load.put("Server4",load.get("Server4")+1);
					}
				}
				else if(op == 2) {
					server = minload(serverSub1);
					if(server == "Server1") {
						temp1 = serverone.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverone.put(2, temp);
						load.put("Server1", load.get("Server1")+1);
					}
					if(server == "Server2") {
						temp1 = servertwo.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						servertwo.put(2, temp);
						load.put("Server2",load.get("Server2")+1);
					}
					if(server == "Server3") {
						temp1 = serverthree.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverthree.put(2, temp);
						load.put("Server3",load.get("Server3")+1);
					}
					if(server == "Server4") {
						temp1 = serverfour.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverfour.put(2, temp);
						load.put("Server4", load.get("Server4")+1);
					}
				}
				else if(op == 3) {
					server = minload(serverMul1);
					if(server == "Server1") {
						temp1 = serverone.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverone.put(3, temp);
						load.put("Server1", load.get("Server1")+1);
					}
					if(server == "Server2") {
						temp1 = servertwo.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						servertwo.put(3, temp);
						load.put("Server2",load.get("Server2")+1);
					}
					if(server == "Server3") {
						temp1 = serverthree.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverthree.put(3, temp);
						load.put("Server3",load.get("Server3")+1);
					}
					if(server == "Server4") {
						temp1 = serverfour.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverfour.put(3, temp);
						load.put("Server4", load.get("Server4")+1);
					}
				}
				else if(op == 4) {
					server = minload(serverDiv1);
					if(server == "Server1") {
						temp1 = serverone.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverone.put(4, temp);
						load.put("Server1", load.get("Server1")+1);
					}
					if(server == "Server2") {
						temp1 = servertwo.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						servertwo.put(4, temp);
						load.put("Server2",load.get("Server2")+1);
					}
					if(server == "Server3") {
						temp1 = serverthree.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverthree.put(4, temp);
						load.put("Server3",load.get("Server3")+1);
					}
					if(server == "Server4") {
						temp1 = serverfour.get(op);
						if(temp1 != null)
							temp.addAll(temp1);
						temp.add(values.get(k++));
						temp.add(values.get(k++));
						serverfour.put(4, temp);
						load.put("Server4", load.get("Server4")+1);
					}
				}
			}
		}
		System.out.println("serverone - " + serverone);
		System.out.println("servertwo - " + servertwo);
		System.out.println("serverthree - " + serverthree);
		System.out.println("serverfour - " + serverfour);
		System.out.println("Load - " + load);
		result = execute(serverone, servertwo, serverthree, serverfour);
		
		int[] p = new int[result.size()];
		for(int g =0;g<result.size();g++)
			p[g]=result.get(g);
		return p;
	}
	
	public static ArrayList<Integer> execute(Map<Integer, ArrayList<Integer>> serverone, Map<Integer, ArrayList<Integer>> servertwo,
			Map<Integer, ArrayList<Integer>> serverthree, Map<Integer, ArrayList<Integer>> serverfour) throws Exception {
		ArrayList<Integer> values = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int temp1 = 0 , temp2 = 0; 
		int res = 0, k = 0;
		for(int i : serverone.keySet()) {
			values = serverone.get(i);
			k=0;
			for(int j = 0 ; j< (values.size()/2); j++) {
				if(i == 1) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = add(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}			
			}			
		}	
		
		for(int i:servertwo.keySet()) {
			values = servertwo.get(i);
			k=0;
			for(int j = 0 ; j< (values.size()/2); j++) {
				if(i == 1) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = addition(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}	
				else if(i == 2) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = sub(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
			}	
		}
		k=0;
		for(int i:serverthree.keySet()) {
			values = serverthree.get(i);
			k=0;
			for(int j = 0 ; j< (values.size()/2); j++) {
				if(i == 1) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = add2(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 2) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = sub2(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 3) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = multiply2(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 4) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = divide2(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
			}	
		}
		k=0;
		for(int i:serverfour.keySet()) {
			values = serverfour.get(i);
			k=0;
			for(int j = 0 ; j< (values.size()/2); j++) {
				if(i == 1) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = add3(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 2) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = sub3(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 3) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = multiply3(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
				else if(i == 4) {
					temp1 = values.get(k++);
					temp2 = values.get(k++);
					res = divide3(temp1, temp2);
					result.add(i);
					result.add(temp1);
					result.add(temp2); 
					result.add(res);
				}
			}	
		}
		
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		
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
		
		result = loadbal1(kemp);
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
		
		
		/*addURL(hmap);
		
		load.put("Server1", 0);
		load.put("Server2", 0);
		load.put("Server3", 0);
		load.put("Server4",0);
		
		serverAndServices();
		int num1 = 0, num2 = 0, operation = 1, res = 0;

			//serviceDirectory(serv, operation);
			Scanner in = new Scanner(System.in);
			System.out.println("Select below operation - ");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			operation = in.nextInt();		
			System.out.println("Enter two numbers for above operation - ");
			num1 = in.nextInt();
			num2 = in.nextInt();

			System.out.println("Picked First Load Balancer");
			System.out.println("Existing Loads on Servers - "+ load);
			
			res = loadBalancer(operation, num1, num2);
			if(operation == 1 )
				System.out.println("The addition is - "+ res);
			else if(operation == 2)
				System.out.println("The subtraction is - "+ res);
			else if(operation == 3)
				System.out.println("The multiplication is - "+ res);
			else if(operation == 4)
				System.out.println("The division is - "+ res);
		
		 Map<Integer, ArrayList<Integer>> passValuesOnServer = new HashMap<Integer, ArrayList<Integer>>();
			ArrayList<Integer> aList = new ArrayList<Integer>();
			ArrayList<Integer> result = new ArrayList<Integer>();
		    Random random = new Random();
		    int operation = 0, num1 = 0, num2 = 0, i =0; 
		    int[][] input = new int [20][3];
		    for(i = 0; i < 5;i++) {
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
		    System.out.println("passValuesOnServer - " + passValuesOnServer);
		    result = loadbal1(passValuesOnServer);
		    System.out.println("Output - " + result);
		    int temp = 0, n1 = 0, n2 = 0, res = 0;
		    i = 0;
		    while(i<result.size()) {
		    	temp = result.get(i++);
		    	n1=result.get(i++);
		    	n2=result.get(i++);
		    	res = result.get(i++);
		    	if(temp ==1) {
		    		System.out.printf("The addition of %d and %d is %d \n", n1, n2, res);
		    	}
		    	else if(temp==2) {
		    		System.out.printf("The subtraction of %d and %d is %d \n", n1, n2, res);
		    	}
		    	else if(temp ==3) {
		    		System.out.printf("The multiplication of %d and %d is %d \n", n1, n2, res);
		    	}
		    	else {
		    		System.out.printf("The division of %d and %d is %d \n", n1, n2, res);
		    	}
		    	
		    }
		    */
		}
	
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
