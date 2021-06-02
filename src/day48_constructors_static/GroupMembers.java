package day48_constructors_static;

import java.util.Arrays;

public class GroupMembers {
    public static void main(String[] args) {
    Group group1 = new Group("Wolf Pack");
    group1.addMember("Angela");
    group1.addMember("Koga");
    group1.addMember("Athena");
    group1.addMember("Matt");
        System.out.println("Group name: " + group1.getName() + "\nGroup members: " + group1.getMembers());
        System.out.println("Number of group members: " + group1.getMembers().size());

        System.out.println("-----------------------------------");

        Group group2 = new Group("LPOTL");
        group2.addMember("Ben");
        group2.addMember("Henry");
        group2.addMember("Marcus");
        System.out.println("Group name: " + group2.getName() + "\nGroup members: " + group2.getMembers());
        System.out.println("Number of group members: " + group2.getMembers().size());

        System.out.println("-----------------------------------");

        Group group3 = new Group("Best Dog Friends");
        group3.addMember("Athena");
        group3.addMember("Koga");
        group3.addMember("Sinclair");
        group3.addMember("Sadie");
        group3.addMember("Bandit");
        group3.addMember("Hubby");
        System.out.println("Group name: " + group3.getName() + "\nGroup members: " + group3.getMembers());
        System.out.println("Number of group members: " + group3.getMembers().size());
        group3.removeMember("Bandit");
        System.out.println(group3);
        System.out.println("Number of group members: " + group3.getMembers().size());

        System.out.println("-----------------------------------");

        if(group1.getMembers().size()>group2.getMembers().size()){
            System.out.println("group 1 is larger than group 2");
        }
        if(group1.getMembers().size() > group3.getMembers().size()){
            System.out.println("group 1 is larger than group 3");
        }
        if(group2.getMembers().size()>group1.getMembers().size()){
            System.out.println("group 2 is larger than group 1");
        }
        if(group2.getMembers().size() > group3.getMembers().size()){
            System.out.println("group 2 is larger than group 3");
        }

        System.out.println("-----------------------------------");

        Group group4 = new Group ("Kitties");
        group4.setMembers(Arrays.asList("Freya", "Poppy", "Kirkwood", "Nollie"));
        //print all members not using toString();
        System.out.println("Group 4 members: " + group4.getMembers());
        if(group4.getMembers().contains("Kirkwood")){
            System.out.println("Kirky baby is in group 4");
        }












    }
}
