public class Crack {

    public static void main(String [] args){
	String agent_message_01282 = "Who are you?";
	int agent_id = 007;
    	System.out.println(agent_message_01282);    //print out "Who are you?"
    	agent_message_01282 = "My name is, Bond...";
    	System.out.println(agent_message_01282);    //print out "My name is, Bond...""
        agent_message_01282 = "James Bond";
        System.out.println(agent_message_01282);    //print out "James Bond"
        agent_message_01282 = agent_message_01282 + "(00" + agent_id + ")";
        System.out.println(agent_message_01282);    //print out "James Bond(007)"
}

}

