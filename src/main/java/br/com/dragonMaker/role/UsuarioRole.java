package br.com.dragonMaker.role;

public enum UsuarioRole {

    ADMIN("admin"),
    USER("admin");

    private String role;

    UsuarioRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}
