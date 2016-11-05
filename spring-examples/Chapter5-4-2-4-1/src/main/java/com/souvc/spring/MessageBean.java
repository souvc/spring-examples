package com.souvc.spring;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 采用引用方式注入集合对象
 */
public class MessageBean {

    private List<String> someList;
    private Set<String> someSet;
    private Map<String,Object> someMap;
    private Properties someProps;

    public String execute(){
        System.out.println("---List信息如下---");
        for(String s : someList){
            System.out.println(s);
        }
        System.out.println("---Set信息如下---");
        for(String s : someSet){
            System.out.println(s);
        }
        System.out.println("---Map信息如下---");
        Set<String> keys = someMap.keySet();
        for(String key : keys){
            System.out.println(key+"=" +someMap.get(key));
        }
        System.out.println("---Properties信息如下---");
        Set<Object> keys1 = someProps.keySet();
        for(Object key : keys1){
            System.out.println(key+"="  +someProps.getProperty(key.toString()));
        }
        return "success";
    }


    public List<String> getSomeList() {
        return someList;
    }
    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }
    public Set<String> getSomeSet() {
        return someSet;
    }
    public void setSomeSet(Set<String> someSet) {
        this.someSet = someSet;
    }
    public Map<String, Object> getSomeMap() {
        return someMap;
    }
    public void setSomeMap(Map<String, Object> someMap) {
        this.someMap = someMap;
    }
    public Properties getSomeProps() {
        return someProps;
    }
    public void setSomeProps(Properties someProps) {
        this.someProps = someProps;
    }

}