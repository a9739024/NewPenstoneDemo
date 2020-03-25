package newpenstone.penstone.job.work;

import lombok.extern.slf4j.Slf4j;
import newpenstone.penstone.job.base.BaseJob;
import org.quartz.JobExecutionContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class HelloJob implements BaseJob {

    @Override
    public void execute(JobExecutionContext context) {
        log.error("Hello Job 执行时间: {}",  new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date().getTime()));
    }
}
