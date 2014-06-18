package org.swordess.toy.spring.annotationbased.resource;

import javax.annotation.Resource;

/**
 * @Resource takes a name attribute, and by default Spring interprets that
 * value as the bean name to be injected. In other words, it follows by-name
 * semantics.
 * <p/>
 * If no name is specified explicitly, the default name is derived from the
 * field name or setter method.
 */
public class ResourceAnnotationOnFieldAndSetter {

    @Resource(name = "magicBehavior")
    private String behavior;
    private int duration;

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    @Resource
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}
