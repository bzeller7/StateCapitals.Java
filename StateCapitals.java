import java.util.Scanner;
import java.util.HashMap;

// file: StateCapitals.java
// Author: Ken Meerdink
// Author: Brea Zeller
// Purpose: I have modified the program so the states and their state are pairs in a Java Map with a pair’s key
// being a state and the value associated with that key being the capital of that state. 
// That way, the program won’t have to search the array to look for a capital. 

public class StateCapitals {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("This program will find a state's capital");
        System.out.print("Which state do you want? ");
        String state = "";
        try {
            state = console.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        HashMap < String, String > statesAndCapitals = getState();

        // Display the capital for the state
        if (statesAndCapitals.containsKey(state)) {
            System.out.println("The capital of " + state + " is " +
                statesAndCapitals.get(state));
        }
        //Display a message for non-state string
        if (!statesAndCapitals.containsKey(state)) {
            System.out.println("The state of " + state + " is not in our state list.");
        }
    }

    // Method getData stores the 50 states and their state in a map
    public static HashMap < String, String > getState() {
        HashMap < String, String > state = new HashMap < > ();

        state.put("Alabama", "Montgomery");
        state.put("Alaska", "Juneau");
        state.put("Arizona", "Phoenix");
        state.put("Arkansas", "Little Rock");
        state.put("California", "Sacramento");
        state.put("Colorado", "Denver");
        state.put("Connecticut", "Hartford");
        state.put("Delaware", "Dover");
        state.put("Florida", "Tallahassee");
        state.put("Georgia", "Atlanta");
        state.put("Hawaii", "Honolulu");
        state.put("Idaho", "Boise");
        state.put("Illinois", "Springfield");
        state.put("Indiana", "Indianapolis");
        state.put("Iowa", "Des Moines");
        state.put("Kansas", "Topeka");
        state.put("Kentucky", "Frankfort");
        state.put("Louisiana", "Baton Rouge");
        state.put("Maine", "Augusta");
        state.put("Maryland", "Annapolis");
        state.put("Massachusetts", "Boston");
        state.put("Michigan", "Lansing");
        state.put("Minnesota", "Saint Paul");
        state.put("Mississippi", "Jackson");
        state.put("Missouri", "Jefferson City");
        state.put("Montana", "Helena");
        state.put("Nebraska", "Lincoln");
        state.put("Nevada", "Carson City");
        state.put("New Hampshire", "Concord");
        state.put("New Jersey", "Trenton");
        state.put("New Mexico", "Santa Fe");
        state.put("New York", "Albany");
        state.put("North Carolina", "Raleigh");
        state.put("North Dakota", "Bismarck");
        state.put("Ohio", "Columbus");
        state.put("Oklahoma", "Oklahoma City");
        state.put("Oregon", "Salem");
        state.put("Pennsylvania", "Harrisburg");
        state.put("Rhode Island", "Providence");
        state.put("South Carolina", "Columbia");
        state.put("South Dakota", "Pierre");
        state.put("Tennessee", "Nashville");
        state.put("Texas", "Austin");
        state.put("Utah", "Salt Lake City");
        state.put("Vermont", "Montpelier");
        state.put("Virginia", "Richmond");
        state.put("Washington", "Olympia");
        state.put("West Virginia", "Charleston");
        state.put("Wisconsin", "Madison");
        state.put("Wyoming", "Cheyenne");
        return state;
    }
}