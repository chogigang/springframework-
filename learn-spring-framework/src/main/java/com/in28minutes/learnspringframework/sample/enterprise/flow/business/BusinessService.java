//비즈니스 로직
package com.in28minutes.learnspringframework.sample.enterprise.flow.business;
import com.in28minutes.learnspringframework.sample.enterprise.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;//이거 빈임

    public long calculateSum() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}
