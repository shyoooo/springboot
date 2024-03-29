package cn.tycoding.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author tycoding
 * @date 2019-01-19
 */
public enum StatusEnums {

    SUCCESS(200, "操作成功"),
    ACCOUNT_UNKNOWN(500, "账户不存在"),
    ACCOUNT_ERROR(500,"用户名或密码错误"),
    CODE_ERROR(400,"验证码错误"),
    SYSTEM_ERROR(500, "系统错误"),
    PARAM_ERROR(400, "参数错误"),
    PARAM_REPEAT(400, "参数已存在"),
    PERMISSION_ERROR(403, "没有操作权限"),
    OTHER(-100, "其他错误");

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String info;

    StatusEnums(int code, String info) {
        this.code = code;
        this.info = info;
    }
}
