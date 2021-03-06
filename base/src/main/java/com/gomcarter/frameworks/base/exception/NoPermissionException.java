package com.gomcarter.frameworks.base.exception;

import com.gomcarter.frameworks.base.json.ErrorCode;

/**
 * 自定义异常类
 * @author gomcarter
 */
public class NoPermissionException extends CustomException {
    public NoPermissionException() {
        super(ErrorCode.noPermission);
    }
}
