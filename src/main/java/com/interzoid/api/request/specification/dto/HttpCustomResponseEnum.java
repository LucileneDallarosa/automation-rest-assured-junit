package com.interzoid.api.request.specification.dto;

public enum HttpCustomResponseEnum {
    STATUS_200(200, "Current weather information for a US city", "HTTP/1.1 200 OK"),
    STATUS_404(404, "City and state location not found", "HTTP/1.1 404 Not Found"),
    STATUS_400(400, "Insufficient parameters: city and state are required", "HTTP/1.1 400 Bad Request");

    private int code;
    private String description;
    private String statusLine;

    HttpCustomResponseEnum(int code, String description, String statusLine)  {
        this.code = code;
        this.description = description;
        this.statusLine = statusLine;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getStatusLine() {
        return statusLine;
    }
}
