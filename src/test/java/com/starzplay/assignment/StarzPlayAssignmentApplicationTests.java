package com.starzplay.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.starzplay.assignment.service.FilterServiceTest;
import com.starzplay.assignment.service.MediaServiceTest;
import com.starzplay.assignment.validation.ValidationUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    MediaServiceTest.class, 
    FilterServiceTest.class,
    ValidationUtilTest.class
})
public class StarzPlayAssignmentApplicationTests {


}
