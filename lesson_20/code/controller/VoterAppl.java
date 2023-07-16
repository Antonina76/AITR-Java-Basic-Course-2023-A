package controller;

import model1.Voter;

public class VoterAppl {
    public static void main(String[] args) {
        Voter voter1 = new Voter("Antonina ",47,"russian","Steiner Str.",25,"Hennef");
        Voter voter2 = new Voter("Alexander ",15,"german","Hauptstr.",240,"Hennef");
        Voter voter3 = new Voter("John ",13,"english","Akazienweg",6,"Hennef");

        Voter [] voters = new Voter[3];
        voters[0]= voter1;
        voters[1] = voter2;
        voters[2]= voter3;
       printArray(voters);

    }

    public static void  printArray(Object[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
