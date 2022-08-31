package in.spdev.aop.anno.aroundadvice.bean;


import org.springframework.stereotype.Component;

@Component
public class Cal {
    public int add(int x,int y){
        return x+y;
    }
}
