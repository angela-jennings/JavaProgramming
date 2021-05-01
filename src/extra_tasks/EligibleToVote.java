package extra_tasks;

public class EligibleToVote {
    public static void main(String[] args) {
        boolean isEligibleToVote;
        String citizenship = "US";
        int age = 30;

        if(citizenship.equalsIgnoreCase("usa")){
            if(age>= 18);
            System.out.println("Eligible to Vote");
        }
        if(!citizenship.equalsIgnoreCase("usa")){
            System.out.println("Not USA citizen, cannot vote");
        }
    }
}
/*[EligibleToVote]

Redo the EligibleToVote task but this time ask which country the person has citizenship for

If the citizenship is for the USA then ask user to enter their age. Use the age to figure out if they vote.

    -> 18+ : You are eligible to vote
    -> < 18: You must be at least 18 years old to vote

If the person is not a USA citizen: You must be US citizen in order to vote" */