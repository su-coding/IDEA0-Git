package su.custom.greet.service;

import su.custom.greet.bean.HelloProperties;

public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    /**
     * Edit by SU
     * @param name username
     * @return processed Greeting
     */
    public String greet(String name){
        return helloProperties.getPrefix()+name+helloProperties.getSuffix();
    }

}
