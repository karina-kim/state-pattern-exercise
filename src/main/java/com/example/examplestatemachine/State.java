package com.example.examplestatemachine;

public abstract class State {
    protected StateContext sc;
<<<<<<< HEAD
    protected boolean accept = true;
    String actions;
    
    public void actionA() {
    	actions=actions+"A";
    	if(actions.startsWith("A")) {
    		accept=true;
    	}
    	else accept=false;
    }
    
    public void actionB() {
    	actions=actions+"B";
    	if(actions.startsWith("B")) {
    		accept=true;
    	}
    	else accept=false;
    }
=======
    protected boolean accept = false;
    
    public void actionA() {}
    
    public void actionB() {}
>>>>>>> b1bc2bf765776c80e4525de811e9f4b4ede0ea0d
    
    public boolean isAccept() {
        return this.accept;
    }
}
