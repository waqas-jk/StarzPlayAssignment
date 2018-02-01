package com.starzplay.assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.starzplay.assignment.controller.MediaControllerIT;
import com.starzplay.assignment.controller.MediaControllerTest;
import com.starzplay.assignment.service.FilterServiceTest;
import com.starzplay.assignment.service.MediaServiceTest;
import com.starzplay.assignment.validation.ValidationUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    MediaServiceTest.class, 
    FilterServiceTest.class,
    ValidationUtilTest.class,
    MediaControllerIT.class,
    MediaControllerTest.class
})
public class StarzPlayAssignmentApplicationTests {


}
