package com.flatinfo.Service;

public interface SecurityService {
    String findLoggedInUsername();
    void autologin(String username, String password);
}
