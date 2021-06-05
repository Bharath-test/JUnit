package org.test;

import org.datas.Pojo1;
import org.datas.Pojo2;
import org.datas.Pojo3;
import org.datas.Pojo4;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Pojo1.class,Pojo2.class,Pojo3.class,Pojo4.class})

public class TestRunner {

}
