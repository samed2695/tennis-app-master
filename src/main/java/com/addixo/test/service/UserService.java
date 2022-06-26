package com.addixo.test.service;

import com.addixo.test.dao.RoleDao;
import com.addixo.test.dao.UserDao;
import com.addixo.test.entity.Role;
import com.addixo.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role refereeRole = new Role();
        refereeRole.setRoleName("Referee");
        refereeRole.setRoleDescription("Referee role");
        roleDao.save(refereeRole);

        User adminUser = new User();
        adminUser.setUserName("admin");
        adminUser.setUserPassword(getEncodedPassword("admin123"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        User user = new User();
        user.setUserName("johnRef");
        user.setUserPassword(getEncodedPassword("ref123"));
        user.setUserFirstName("john");
        user.setUserLastName("doe");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(refereeRole);
        user.setRole(userRoles);
        userDao.save(user);
    }

    public User addNewReferee(User user) {
        Role role = roleDao.findById("Referee").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
