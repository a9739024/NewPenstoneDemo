package newpenstone.penstone.service.quartz.mapper;

import newpenstone.penstone.service.quartz.domain.JobAndTrigger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JobMapper {
    /**
     * 查询定时作业和触发器列表
     *
     * @return 定时作业和触发器列表
     */
    List<JobAndTrigger> list();
}
