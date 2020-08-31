package lesson14;

import javaslang.collection.List;

import java.util.ArrayList;

public class PreOrganization {
    private String name;
    private String address;
    private ArrayList<PreBranch> branches;

    public PreOrganization(String name, String address) {
        this.name = name;
        this.address = address;
        branches = new ArrayList<PreBranch>();
    }
    public void addBranches (PreBranch branch) {
        branches.add(branch);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<PreBranch> getBranches() {
        return branches;
    }
}

