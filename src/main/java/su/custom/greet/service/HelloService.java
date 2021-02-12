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
     * Edit by SU Leader
     * @param name hostname
     * @return greeting state
     */
    public String greet(String name){
        return helloProperties.getPrefix()+name+helloProperties.getSuffix();
    }

}
