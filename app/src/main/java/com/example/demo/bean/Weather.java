package com.example.demo.bean;

public class Weather {

    private Result result;
    private int error_Code;
    private String reason;


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getError_Code() {
        return error_Code;
    }

    public void setError_Code(int error_Code) {
        this.error_Code = error_Code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    class Result {
        String title;
        String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
