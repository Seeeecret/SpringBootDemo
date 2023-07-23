package com.secret.controller;

import com.secret.constants.ResultCodeEnum;
import com.secret.pojo.dto.ResultSet;
import com.secret.pojo.po.User;
import com.secret.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
// TODO  返回值类型可以改为ResponseEntity<ResultSet>，这样可以返回状态码
    @PostMapping
    public ResponseEntity<ResultSet> login(@RequestBody User user) {
        User queryUser = userService.getUserByName(user.getName());
        if (queryUser != null) {
            if (queryUser.getPassword().equals(user.getPassword())) {
                return ResponseEntity.ok().body(new ResultSet(ResultCodeEnum.OK, queryUser));
            } else {
                return ResponseEntity.badRequest().body(new ResultSet(false, 400, "密码错误", null));
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body((new ResultSet(false, 400, "用户不存在", null)));
        }
    }

    @PutMapping
    public ResultSet register(@RequestBody User user) {
        User queryUser = userService.getUserByName(user.getName());
        if (queryUser != null) {
            return new ResultSet(false, 400, "用户已存在", null);
        } else {
            if (userService.addUser(user)) {
                return new ResultSet(ResultCodeEnum.OK, null);
            } else {
                return new ResultSet(ResultCodeEnum.SERVER_ERROR, null);
            }
        }
    }

    @DeleteMapping("/{ID}")
    public ResultSet deleteUserByID(@PathVariable int ID) {
        User queryUser = userService.getUserByID(ID);
        if (queryUser != null) {
            if (userService.deleteUserByID(ID)) {
                return new ResultSet(ResultCodeEnum.OK, null);
            } else {
                return new ResultSet(ResultCodeEnum.SERVER_ERROR, null);
            }
        } else {
            return new ResultSet(false, 400, "用户不存在", null);
        }
    }

    @GetMapping("/{ID}")
    public ResultSet getUserByID(@PathVariable int ID) {
        User queryUser = userService.getUserByID(ID);
        if (queryUser != null) {
            return new ResultSet(ResultCodeEnum.OK, queryUser);
        } else {
            return new ResultSet(false, 400, "用户不存在", null);
        }
    }

    @GetMapping
    public ResultSet getAll() {
        List<User> users = userService.getAll();
        return users != null ? new ResultSet(ResultCodeEnum.OK, users) : new ResultSet(ResultCodeEnum.SERVER_ERROR, null);
    }
}
