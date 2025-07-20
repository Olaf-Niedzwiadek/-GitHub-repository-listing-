package com.example.github.dto;

import java.util.List;

public class RepositoryResponse {
    private String name;
    private String ownerLogin;
    private List<BranchInfo> branches;

    public RepositoryResponse(String name, String ownerLogin, List<BranchInfo> branches) {
        this.name = name;
        this.ownerLogin = ownerLogin;
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public void setOwnerLogin(String ownerLogin) {
        this.ownerLogin = ownerLogin;
    }

    public List<BranchInfo> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchInfo> branches) {
        this.branches = branches;
    }
}