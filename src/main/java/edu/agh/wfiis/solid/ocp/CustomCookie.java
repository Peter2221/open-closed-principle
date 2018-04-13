package edu.agh.wfiis.solid.ocp;

import lombok.Getter;

@Getter
public class CustomCookie {

    private String name;
    private String comment;
    private String domain;
    private String path;
    private String value;
    private int version = 0;
    private int maxAge = -1;
    private boolean secure;

    public static class Builder {

        private String name;
        private String comment;
        private String domain;
        private String path;
        private String value;
        private int version = 0;
        private int maxAge = -1;
        private boolean secure;

        public Builder(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public CustomCookie.Builder comment(String comment){
            this.comment = comment;
            return this;
        }

        public CustomCookie.Builder domain(String domain){
            this.domain = domain;
            return this;
        }

        public CustomCookie.Builder path(String path){
            this.path = path;
            return this;
        }

        public CustomCookie.Builder version(int version) {
            this.version = version;
            return this;
        }

        public CustomCookie.Builder maxAge(int maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public CustomCookie.Builder secure(boolean secure) {
            this.secure = secure;
            return this;
        }

        public CustomCookie build(){
            return new CustomCookie(this);
        }
    }

    private CustomCookie(CustomCookie.Builder builder) {
        this.name = builder.name;
        this.comment = builder.comment;
        this.domain = builder.domain;
        this.path = builder.path;
        this.value = builder.value;
        this.version = builder.version;
        this.maxAge = builder.maxAge;
        this.secure = builder.secure;
    }
}
