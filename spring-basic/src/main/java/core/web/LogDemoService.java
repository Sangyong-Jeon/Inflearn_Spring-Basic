package core.web;

import core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {
        System.out.println("myLogger = " + myLogger.getClass());
        myLogger.log("service id = " + id);
    }
}
