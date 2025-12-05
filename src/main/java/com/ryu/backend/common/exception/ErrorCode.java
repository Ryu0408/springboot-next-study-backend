package com.ryu.backend.common.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    // 공통
    COMMON_INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "COMMON-400", "잘못된 요청입니다."),
    COMMON_INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON-500", "서버 오류가 발생했습니다."),

    // Validation
    VALIDATION_ERROR(HttpStatus.BAD_REQUEST, "VALID-400", "유효하지 않은 입력값입니다."),

    // 예시: 회원 관련
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER-404", "사용자를 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
