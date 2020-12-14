package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branches> bankBranch;

    public Bank() {
        this.bankBranch = bankBranch;
    }

    public ArrayList<Branches> getBankBranch() {
        return bankBranch;
    }

    public boolean addNewBranch(Branches branch) {
        if (findBranch(branch.getBranchName()) >= 0) {
            System.out.println("Branch is already on file");
            return false;
        }
        bankBranch.add(branch);
        return true;
    }

    public int findBranch(String branchName) {
        for (int i = 0; i < this.bankBranch.size(); i++) {
            Branches branch = this.bankBranch.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
    public void printBranches() {
        System.out.println("Branch List");
        for (int i = 0; i < this.bankBranch.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.bankBranch.get(i));
        }
    }
}