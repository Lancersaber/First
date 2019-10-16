package chapter3.demo1;

//表示请求的Request类
public class Request {
    private final String name;
    public Request(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "[ Request "+ name+" ]";
    }
}
