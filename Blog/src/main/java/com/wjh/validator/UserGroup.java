package com.wjh.validator;

import javax.validation.GroupSequence;

@GroupSequence({UserFirstGroup.class,UserSecondGroup.class})//声明效验的顺序
public interface UserGroup {//可以代表上面的所有分组，但是上面的分组是有顺序的

}
